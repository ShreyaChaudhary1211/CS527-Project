import builtins
import collections
import curses
import inspect
import sys

import visidata
from visidata import vd, VisiData, BaseSheet, Sheet, ColumnItem, Column, RowColorizer, options, colors, wrmap, clipdraw, ExpectedException, update_attr


vd.option('disp_rstatus_fmt', ' {sheet.longname} {sheet.nRows:9d} {sheet.rowtype} {sheet.modifiedStatus} {sheet.options.disp_selected_note}{sheet.nSelectedRows}', 'right-side status format string')
vd.option('disp_status_fmt', '{sheet.shortcut}› {sheet.name}| ', 'status line prefix')
vd.option('disp_lstatus_max', 0, 'maximum length of left status line')
vd.option('disp_status_sep', '│', 'separator between statuses')

vd.option('color_keystrokes', 'bold 233 black on 110 cyan', 'color of input keystrokes on status line')
vd.option('color_keys', 'bold', 'color of keystrokes in help')
vd.option('color_status', 'bold on 238', 'status line color')
vd.option('color_error', 'red', 'error message color')
vd.option('color_warning', 'yellow', 'warning message color')
vd.option('color_top_status', 'underline', 'top window status bar color')
vd.option('color_active_status', 'black on 110 cyan', ' active window status bar color')
vd.option('color_inactive_status', '8 on black', 'inactive window status bar color')

BaseSheet.init('longname', lambda: '')

@BaseSheet.api
def _updateStatusBeforeExec(sheet, cmd, args, ks):
    sheet.longname = cmd.longname
    if sheet._scr:
        vd.drawRightStatus(sheet._scr, sheet)  #996 show longname during commands
        sheet._scr.refresh()


vd.beforeExecHooks.append(BaseSheet._updateStatusBeforeExec)


@BaseSheet.property
def modifiedStatus(sheet):
    return ' [M]' if sheet.hasBeenModified else ''


@VisiData.lazy_property
def statuses(vd):
    return collections.OrderedDict()  # (priority, statusmsg) -> num_repeats; shown until next action


@VisiData.lazy_property
def statusHistory(vd):
    return list()  # list of [priority, statusmsg, repeats] for all status messages ever

def getStatusSource():
    stack = inspect.stack()
    for i, sf in enumerate(stack):
        if sf.function in 'status aside'.split():
            if stack[i+1].function in 'error fail warning debug'.split():
                sf = stack[i+2]
            else:
                sf = stack[i+1]
            break

    fn = sf.filename
    if fn.startswith(visidata.__path__[0]):
        fn = visidata.__package__ + fn[len(visidata.__path__[0]):]
    return f'{fn}:{sf.lineno}:{sf.function}'


@VisiData.api
def status(vd, *args, priority=0):
    'Display *args* on status until next action.'
    if not args:
        return True

    k = (priority, tuple(map(str, args)))
    vd.statuses[k] = vd.statuses.get(k, 0) + 1

    source = getStatusSource()

    if not vd.cursesEnabled:
        msg = '\r' + composeStatus(args)
        if vd.options.debug:
            msg += f' [{source}]'
        builtins.print(msg, file=sys.stderr)

    return vd.addToStatusHistory(*args, priority=priority, source=source)

@VisiData.api
def addToStatusHistory(vd, *args, priority=0, source=None):
    if vd.statusHistory:
        prevpri, prevargs, _, _ = vd.statusHistory[-1]
        if prevpri == priority and prevargs == args:
            vd.statusHistory[-1][2] += 1
            return True

    vd.statusHistory.append([priority, args, 1, source])
    return True

@VisiData.api
def error(vd, *args):
    'Abort with ExpectedException, and display *args* on status as an error.'
    vd.status(*args, priority=3)
    raise ExpectedException(args[0] if args else '')

@VisiData.api
def fail(vd, *args):
    'Abort with ExpectedException, and display *args* on status as a warning.'
    vd.status(*args, priority=2)
    raise ExpectedException(args[0] if args else '')

@VisiData.api
def warning(vd, *args):
    'Display *args* on status as a warning.'
    vd.status(*args, priority=1)

@VisiData.api
def aside(vd, *args, priority=0):
    'Add a message to statuses without showing the message proactively.'
    return vd.addToStatusHistory(*args, priority=priority, source=getStatusSource())

@VisiData.api
def debug(vd, *args, **kwargs):
    'Display *args* on status if options.debug is set.'
    if options.debug:
        return vd.status(*args, **kwargs)

def middleTruncate(s, w):
    if len(s) <= w:
        return s
    return s[:w] + options.disp_truncator + s[-w:]


def composeStatus(msgparts, n=1):
    msg = '; '.join(wrmap(str, msgparts))
    if n > 1:
        msg = '[%sx] %s' % (n, msg)
    return msg


@BaseSheet.api
def leftStatus(sheet):
    'Return left side of status bar for this sheet. Overridable.'
    return sheet.formatString(sheet.options.disp_status_fmt)


@VisiData.api
def drawLeftStatus(vd, scr, vs):
    'Draw left side of status bar.'
    cattr = colors.get_color('color_active_status')
    active = (vs is vd.activeSheet)
    if active:
        cattr = update_attr(cattr, colors.color_active_status, 1)
    else:
        cattr = update_attr(cattr, colors.color_inactive_status, 1)

    if scr is vd.winTop:
        cattr = update_attr(cattr, colors.color_top_status, 1)

    attr = cattr.attr

    x = 0
    y = vs.windowHeight-1  # status for each window
    try:
        lstatus = vs.leftStatus()
        maxwidth = options.disp_lstatus_max
        if maxwidth > 0:
            lstatus = middleTruncate(lstatus, maxwidth//2)

        x = clipdraw(scr, y, 0, lstatus, attr, w=vs.windowWidth-1)

        vd.onMouse(scr, 0, y, x, 1,
                        BUTTON3_PRESSED='rename-sheet',
                        BUTTON3_CLICKED='rename-sheet')
    except Exception as e:
        vd.exceptionCaught(e)


@VisiData.property
def recentStatusMessages(vd):
    r = ''
    for (pri, msgparts), n in vd.statuses.items():
        msg = '; '.join(wrmap(str, msgparts))
        msg = f'[{n}x] {msg}' if n > 1 else msg

        if pri == 3: msgattr = '[:error]'
        elif pri == 2: msgattr = '[:warning]'
        elif pri == 1: msgattr = '[:warning]'
        else: msgattr = ''

        if msgattr:
            msg = ' ' + msg + ' '

        r += f'\n{msgattr}{msg}[:]'

    if r:
        return '# statuses' + r


@VisiData.api
def rightStatus(vd, sheet):
    'Return right side of status bar.  Overridable.'
    return sheet.formatString(sheet.options.disp_rstatus_fmt)


@VisiData.api
def drawRightStatus(vd, scr, vs):
    'Draw right side of status bar.  Return length displayed.'
    rightx = vs.windowWidth

    ret = 0
    statcolors = [
        (vd.rightStatus(vs), 'color_active_status'),
    ]

    active = vs is vd.activeSheet

    if active:
        statcolors.append((f'{vd.keystrokes} ' or '', 'color_keystrokes'))

    if vs.currentThreads:
        statcolors.insert(0, vd.checkMemoryUsage())
        gerunds = [p.gerund for p in vs.progresses if p.gerund] or ['processing']
        statcolors.insert(1, ('  %s %s…' % (vs.progressPct, gerunds[0]), 'color_working'))

    if active and vd.currentReplay:
        statcolors.insert(0, (vd.replayStatus, 'color_status_replay'))

    for rstatcolor in statcolors:
        if rstatcolor:
            try:
                rstatus, coloropt = rstatcolor
                rstatus = ' '+rstatus
                cattr = colors.get_color(coloropt)
                if scr is vd.winTop:
                    cattr = update_attr(cattr, colors.color_top_status, 0)
                if active:
                    cattr = update_attr(cattr, colors.color_active_status, 0)
                else:
                    cattr = update_attr(cattr, colors.color_inactive_status, 0)
                statuslen = clipdraw(scr, vs.windowHeight-1, rightx, rstatus, cattr.attr, w=vs.windowWidth-1, rtl=True)
                rightx -= statuslen
                ret += statuslen
            except Exception as e:
                vd.exceptionCaught(e)

    if scr:
        curses.doupdate()
    return ret


class StatusSheet(Sheet):
    precious = False
    rowtype = 'statuses'  # rowdef: (priority, args, nrepeats)
    columns = [
        ColumnItem('priority', 0, type=int, width=0),
        ColumnItem('nrepeats', 2, type=int, width=0),
        ColumnItem('args', 1, width=0),
        Column('message', width=50, getter=lambda col,row: composeStatus(row[1], row[2])),
        ColumnItem('source', 3),
    ]
    colorizers = [
        RowColorizer(1, 'color_error', lambda s,c,r,v: r and r[0] == 3),
        RowColorizer(1, 'color_warning', lambda s,c,r,v: r and r[0] in [1,2]),
    ]

    def reload(self):
        self.rows = self.source


@VisiData.property
def statusHistorySheet(vd):
    return StatusSheet("status_history", source=vd.statusHistory[::-1])  # in reverse order


BaseSheet.addCommand('^P', 'open-statuses', 'vd.push(vd.statusHistorySheet)', 'open Status History')

vd.addMenuItems('''
    View > Statuses > open-statuses
''')
