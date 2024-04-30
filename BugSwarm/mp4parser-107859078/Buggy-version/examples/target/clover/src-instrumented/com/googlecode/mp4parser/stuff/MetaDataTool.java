/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.stuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MetaBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.UnknownBox;
import com.coremedia.iso.boxes.UserDataBox;
import com.coremedia.iso.boxes.apple.AppleItemListBox;
import com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox;
import com.googlecode.mp4parser.boxes.apple.AppleNameBox;
import com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import com.googlecode.mp4parser.util.Path;

/**
 * Added by marwatk 3/1/15
 *
 */
public class MetaDataTool {public static class __CLR4_5_210a10alvl9g0x4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public static final boolean DEBUG = true;
	public static void main(String[] args) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1306);
		__CLR4_5_210a10alvl9g0x4.R.inc(1307);if( (((args.length != 7 && args.length != 1 )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1308)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1309)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1310);System.err.println( "Usage: java -jar metaDatTool.jar <inputFile> <outputFile> <title> <createDate> <userRating> <; separated tags> <gps coordinates>" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1311);System.err.println( "  Use * for any value to keep the existing value, use an empty value to delete the current value" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1312);System.err.println( "  Example: java -jar metaDataTool.jar myFile.mp4 newFile.mp4 \"New Title\" \"*\" 5 \"myTag 1;myTag 2\" \"\"" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1313);System.err.println( "  This would retitle it, leave the create date alone, set the rating to 5 stars, " );
			__CLR4_5_210a10alvl9g0x4.R.inc(1314);System.err.println( "  replace any tags with 'myTag 1' and 'myTag 2' and delete the existing GPS coordinates" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1315);System.err.println( "Other usage: java -jar metaDataToo.jar <inputFile>" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1316);System.err.println( "  Prints a dump of all tags in the file" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1317);System.exit( 1 );
		}
		
		}__CLR4_5_210a10alvl9g0x4.R.inc(1318);if( (((args.length == 1 )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1319)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1320)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1321);MetaDataTool mdt;
			__CLR4_5_210a10alvl9g0x4.R.inc(1322);try {
				__CLR4_5_210a10alvl9g0x4.R.inc(1323);mdt = new MetaDataTool( args[0] );
				__CLR4_5_210a10alvl9g0x4.R.inc(1324);mdt.dumpBoxes();
				__CLR4_5_210a10alvl9g0x4.R.inc(1325);System.exit( 0 );
			} catch (IOException e) {
				__CLR4_5_210a10alvl9g0x4.R.inc(1326);e.printStackTrace();
			}
		}
		
		}__CLR4_5_210a10alvl9g0x4.R.inc(1327);int i = 0;
		__CLR4_5_210a10alvl9g0x4.R.inc(1328);String inFile = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1329);String outFile = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1330);String title = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1331);String createDate = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1332);String userRating = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1333);String tags = args[i++];
		__CLR4_5_210a10alvl9g0x4.R.inc(1334);String gpsCoords = args[i++];
		
		__CLR4_5_210a10alvl9g0x4.R.inc(1335);try {
			__CLR4_5_210a10alvl9g0x4.R.inc(1336);System.out.println( "================= BEFORE ===================" );
			__CLR4_5_210a10alvl9g0x4.R.inc(1337);MetaDataTool mdt = new MetaDataTool( inFile );
			__CLR4_5_210a10alvl9g0x4.R.inc(1338);mdt.dumpBoxes();
			__CLR4_5_210a10alvl9g0x4.R.inc(1339);if( (((!"*".equals( title ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1340)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1341)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1342);mdt.setTitle( title );
			}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1343);if( (((!"*".equals( createDate ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1344)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1345)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1346);Date inputDate = parseDate( createDate );
				__CLR4_5_210a10alvl9g0x4.R.inc(1347);mdt.setMediaCreateDate( inputDate );
				__CLR4_5_210a10alvl9g0x4.R.inc(1348);mdt.setMediaModificationDate( inputDate );
			}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1349);if( (((!"*".equals( userRating ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1350)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1351)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1352);if( ((("".equals( userRating ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1353)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1354)==0&false))) {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1355);mdt.removeWindowsMediaTag( WM_RATING_TAG );
				}
				}else {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1356);mdt.setWindowsMediaRating( Integer.valueOf( userRating ) );
				}
			}}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1357);if( (((!"*".equals( tags ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1358)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1359)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1360);if( ((("".equals( tags ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1361)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1362)==0&false))) {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1363);mdt.removeWindowsMediaTag( WM_TAGS_TAG );
				}
				}else {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1364);String tagsAr[] = tags.split( ";" );
					__CLR4_5_210a10alvl9g0x4.R.inc(1365);mdt.setWindowsMediaTags( tagsAr );
				}
			}}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1366);if( (((!"*".equals( gpsCoords ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1367)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1368)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1369);mdt.setGpsCoordinates( gpsCoords );
			}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1370);mdt.writeMp4( outFile );
			__CLR4_5_210a10alvl9g0x4.R.inc(1371);if( (((DEBUG )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1372)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1373)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1374);mdt = new MetaDataTool( outFile );
				__CLR4_5_210a10alvl9g0x4.R.inc(1375);System.out.println( "================= AFTER ===================" );
				__CLR4_5_210a10alvl9g0x4.R.inc(1376);mdt.dumpBoxes();
			}
		}}
		catch( Exception e ) {
			__CLR4_5_210a10alvl9g0x4.R.inc(1377);e.printStackTrace();
		}
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private long originalUserDataSize = 0;
	private XtraBox xtraBox;
	private UserDataBox userDataBox;
	private MetaBox metaBox;
	private IsoFile isoFile;
	
	public MetaDataTool( String path ) throws IOException {try{__CLR4_5_210a10alvl9g0x4.R.inc(1378);
		
		//The source I copied this from created 2 new files, a temp file and a target file
		//I'm not sure this is necessary, but maybe when you make changes it's edited in-place?
		//Anyway, just to be safe I'm keeping it so no operations are done on original file
        __CLR4_5_210a10alvl9g0x4.R.inc(1379);File videoFile = new File(path);
        __CLR4_5_210a10alvl9g0x4.R.inc(1380);if ((((!videoFile.exists())&&(__CLR4_5_210a10alvl9g0x4.R.iget(1381)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1382)==0&false)))
            {__CLR4_5_210a10alvl9g0x4.R.inc(1383);throw new FileNotFoundException("File " + path + " not exists");

        }__CLR4_5_210a10alvl9g0x4.R.inc(1384);if ((((!videoFile.canWrite())&&(__CLR4_5_210a10alvl9g0x4.R.iget(1385)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1386)==0&false)))
            {__CLR4_5_210a10alvl9g0x4.R.inc(1387);throw new IllegalStateException("No write permissions to file " + path);

        }__CLR4_5_210a10alvl9g0x4.R.inc(1388);File tempFile = File.createTempFile("ChangeMetaData", "");
        __CLR4_5_210a10alvl9g0x4.R.inc(1389);FileUtils.copyFile(videoFile, tempFile);
        __CLR4_5_210a10alvl9g0x4.R.inc(1390);tempFile.deleteOnExit();

        __CLR4_5_210a10alvl9g0x4.R.inc(1391);isoFile = new IsoFile(tempFile.getAbsolutePath());
        __CLR4_5_210a10alvl9g0x4.R.inc(1392);userDataBox = Path.getPath(isoFile, "/moov/udta");
        __CLR4_5_210a10alvl9g0x4.R.inc(1393);if( (((userDataBox != null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1394)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1395)==0&false))) {{
        	__CLR4_5_210a10alvl9g0x4.R.inc(1396);originalUserDataSize = userDataBox.getSize();
        }
        
	}}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public static final String WM_RATING_TAG = "WM/SharedUserRating";
	public static final int WM_RATING_VALS[] = { 0, 1, 25, 50, 75, 99 };
	public void setWindowsMediaRating( int rating ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1397); //0-5
		__CLR4_5_210a10alvl9g0x4.R.inc(1398);if( (((rating < 0 || rating > 5 )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1399)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1400)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1401);throw new RuntimeException( "Invalid rating, 0-5 only" );
		}
		
		}__CLR4_5_210a10alvl9g0x4.R.inc(1402);if( (((rating == 0 )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1403)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1404)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1405);removeWindowsMediaTag( WM_RATING_TAG );
		}
		}else {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1406);setWindowsMediaLong( WM_RATING_TAG, WM_RATING_VALS[rating] );
		}
	}}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public static final String WM_TAGS_TAG = "WM/Category";
	public void setWindowsMediaTags( String tags[] ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1407);
		__CLR4_5_210a10alvl9g0x4.R.inc(1408);if( (((tags == null || tags.length == 0 )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1409)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1410)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1411);removeWindowsMediaTag( WM_TAGS_TAG );
		}
		}else {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1412);setWindowsMediaStrings( WM_TAGS_TAG, tags );
		}
	}}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private void setMediaDate( Date date, boolean create ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1413);
		__CLR4_5_210a10alvl9g0x4.R.inc(1414);List<Box> headers = getBoxes( isoFile, new String[] { MovieHeaderBox.TYPE, MediaHeaderBox.TYPE, TrackHeaderBox.TYPE } );
		__CLR4_5_210a10alvl9g0x4.R.inc(1415);boolean set = false;
		__CLR4_5_210a10alvl9g0x4.R.inc(1416);for( Box header : headers ) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1417);if( (((header instanceof MediaHeaderBox )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1418)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1419)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1420);set = true;
				__CLR4_5_210a10alvl9g0x4.R.inc(1421);if( (((create )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1422)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1423)==0&false))) {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1424);((MediaHeaderBox)header).setCreationTime( date );
				}
				}else {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1425);((MediaHeaderBox)header).setModificationTime( date );
				}
			}}
			}else {__CLR4_5_210a10alvl9g0x4.R.inc(1426);if( (((header instanceof MovieHeaderBox )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1427)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1428)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1429);set = true;
				__CLR4_5_210a10alvl9g0x4.R.inc(1430);if( (((create )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1431)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1432)==0&false))) {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1433);((MovieHeaderBox)header).setCreationTime(date);
				}
				}else {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1434);((MovieHeaderBox)header).setModificationTime(date);
				}
			}}
			}else {__CLR4_5_210a10alvl9g0x4.R.inc(1435);if( (((header instanceof TrackHeaderBox )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1436)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1437)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1438);set = true;
				__CLR4_5_210a10alvl9g0x4.R.inc(1439);if( (((create )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1440)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1441)==0&false))) {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1442);((TrackHeaderBox)header).setCreationTime(date);
				}
				}else {{
					__CLR4_5_210a10alvl9g0x4.R.inc(1443);((TrackHeaderBox)header).setModificationTime(date);
				}
				
			}}
		}}}}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1444);setWindowsMediaDate( "WM/EncodingTime", date );
		__CLR4_5_210a10alvl9g0x4.R.inc(1445);if( (((!set )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1446)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1447)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1448);throw new RuntimeException( "Can't yet add MovieHeaderBox or MediaHeaderBox and none were preset to set create and/or modify date" );
		}
	}}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void setGpsCoordinates( String iso6709String ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1449);
		__CLR4_5_210a10alvl9g0x4.R.inc(1450);AppleGPSCoordinatesBox coordBox = (AppleGPSCoordinatesBox)getBox( isoFile, AppleGPSCoordinatesBox.TYPE );
		__CLR4_5_210a10alvl9g0x4.R.inc(1451);if( (((coordBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1452)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1453)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1454);UserDataBox udb = getUserDataBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1455);coordBox = new AppleGPSCoordinatesBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1456);udb.addBox( coordBox );
		}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1457);coordBox.setValue( iso6709String );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void setMediaCreateDate( Date date ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1458);
		__CLR4_5_210a10alvl9g0x4.R.inc(1459);setMediaDate( date, true );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	public void setMediaModificationDate( Date date ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1460);
		__CLR4_5_210a10alvl9g0x4.R.inc(1461);setMediaDate( date, false );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void setTitle( String title ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1462);
		__CLR4_5_210a10alvl9g0x4.R.inc(1463);AppleNameBox titleBox = (AppleNameBox)getBox( isoFile, AppleNameBox.TYPE );
		__CLR4_5_210a10alvl9g0x4.R.inc(1464);if( (((titleBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1465)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1466)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1467);AppleItemListBox itemList = getItemListBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1468);titleBox = new AppleNameBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1469);itemList.addBox( titleBox );
		}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1470);titleBox.setValue( title );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private AppleItemListBox getItemListBox() {try{__CLR4_5_210a10alvl9g0x4.R.inc(1471);
		__CLR4_5_210a10alvl9g0x4.R.inc(1472);AppleItemListBox itemList = (AppleItemListBox)getBox( isoFile, AppleItemListBox.TYPE );
		__CLR4_5_210a10alvl9g0x4.R.inc(1473);if( (((itemList == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1474)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1475)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1476);MetaBox mb = getMetaBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1477);itemList = new AppleItemListBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1478);mb.addBox( itemList );
		}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1479);return itemList;
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	@SuppressWarnings("deprecation")
	public void setMediaModificationDate( String date ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1480);
		__CLR4_5_210a10alvl9g0x4.R.inc(1481);setMediaModificationDate( new Date( Date.parse( date ) ) ); //Deprecated, but also the easiest way to do this quickly
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	@SuppressWarnings("deprecation")
	public void setMediaCreateDate( String date ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1482);
		__CLR4_5_210a10alvl9g0x4.R.inc(1483);try {
			__CLR4_5_210a10alvl9g0x4.R.inc(1484);setMediaCreateDate( new Date( Date.parse( date ) ) ); //Deprecated, but also the easiest way to do this quickly
		} catch( IllegalArgumentException e ) {
			__CLR4_5_210a10alvl9g0x4.R.inc(1485);throw new RuntimeException( "Unable to parse date '" + date + "'", e );
		}
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void setWindowsMediaDate( String tagName, Date dateVal ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1486);
		__CLR4_5_210a10alvl9g0x4.R.inc(1487);XtraBox xb = getXtraBox();
		__CLR4_5_210a10alvl9g0x4.R.inc(1488);xb.setTagValue( tagName, dateVal );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}

	public void setWindowsMediaLong( String tagName, long longVal ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1489);
		__CLR4_5_210a10alvl9g0x4.R.inc(1490);XtraBox xb = getXtraBox();
		__CLR4_5_210a10alvl9g0x4.R.inc(1491);xb.setTagValue( tagName, longVal );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void setWindowsMediaStrings( String tagName, String values[] ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1492);
		__CLR4_5_210a10alvl9g0x4.R.inc(1493);XtraBox xb = getXtraBox();
		__CLR4_5_210a10alvl9g0x4.R.inc(1494);xb.setTagValues( tagName, values );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void removeWindowsMediaTag( String tagName ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1495);
		__CLR4_5_210a10alvl9g0x4.R.inc(1496);XtraBox xb = getXtraBox();
		__CLR4_5_210a10alvl9g0x4.R.inc(1497);xb.removeTag( tagName );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	

	private UserDataBox getUserDataBox() {try{__CLR4_5_210a10alvl9g0x4.R.inc(1498);
		__CLR4_5_210a10alvl9g0x4.R.inc(1499);if( (((userDataBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1500)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1501)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1502);userDataBox = new UserDataBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1503);isoFile.getMovieBox().addBox( userDataBox );
		}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1504);return userDataBox;
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private MetaBox getMetaBox() {try{__CLR4_5_210a10alvl9g0x4.R.inc(1505);
		__CLR4_5_210a10alvl9g0x4.R.inc(1506);if( (((metaBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1507)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1508)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1509);UserDataBox ud = getUserDataBox();
			__CLR4_5_210a10alvl9g0x4.R.inc(1510);metaBox = (MetaBox) getBox( ud, MetaBox.TYPE );
			__CLR4_5_210a10alvl9g0x4.R.inc(1511);if( (((metaBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1512)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1513)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1514);metaBox = new MetaBox();
                __CLR4_5_210a10alvl9g0x4.R.inc(1515);ud.addBox(metaBox);
			}
		}}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1516);return metaBox;
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private XtraBox getXtraBox() {try{__CLR4_5_210a10alvl9g0x4.R.inc(1517);
		__CLR4_5_210a10alvl9g0x4.R.inc(1518);if( (((xtraBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1519)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1520)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1521);UserDataBox ud = getUserDataBox(); //Create user data box if necessary
			__CLR4_5_210a10alvl9g0x4.R.inc(1522);xtraBox = (XtraBox)getBox( ud, XtraBox.TYPE );
			__CLR4_5_210a10alvl9g0x4.R.inc(1523);if( (((xtraBox == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1524)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1525)==0&false))) {{
				__CLR4_5_210a10alvl9g0x4.R.inc(1526);xtraBox = new XtraBox();
				__CLR4_5_210a10alvl9g0x4.R.inc(1527);ud.addBox( xtraBox );
			}
		}}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1528);return xtraBox;
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void writeMp4( String filename ) throws IOException {try{__CLR4_5_210a10alvl9g0x4.R.inc(1529);
        __CLR4_5_210a10alvl9g0x4.R.inc(1530);long finalUserDataSize = 0;
		__CLR4_5_210a10alvl9g0x4.R.inc(1531);if( (((userDataBox != null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1532)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1533)==0&false))) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1534);finalUserDataSize = userDataBox.getSize();
		}
        }__CLR4_5_210a10alvl9g0x4.R.inc(1535);if ((((needsOffsetCorrection(isoFile))&&(__CLR4_5_210a10alvl9g0x4.R.iget(1536)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1537)==0&false))) {{
            __CLR4_5_210a10alvl9g0x4.R.inc(1538);correctChunkOffsets(isoFile, finalUserDataSize - originalUserDataSize);
        }
        }__CLR4_5_210a10alvl9g0x4.R.inc(1539);FileOutputStream videoFileOutputStream = null;
        __CLR4_5_210a10alvl9g0x4.R.inc(1540);try {
	        __CLR4_5_210a10alvl9g0x4.R.inc(1541);videoFileOutputStream = new FileOutputStream(filename);
	        __CLR4_5_210a10alvl9g0x4.R.inc(1542);isoFile.getBox(videoFileOutputStream.getChannel());
        }
        finally {
        	__CLR4_5_210a10alvl9g0x4.R.inc(1543);closeQuietly(isoFile);
        	__CLR4_5_210a10alvl9g0x4.R.inc(1544);IOUtils.closeQuietly(videoFileOutputStream);
        }
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private static String getIndentation( int indent ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1545);
		__CLR4_5_210a10alvl9g0x4.R.inc(1546);char c[] = new char[indent];
		__CLR4_5_210a10alvl9g0x4.R.inc(1547);for( int i = 0; (((i < indent)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1548)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1549)==0&false)); i++ ) {{
			__CLR4_5_210a10alvl9g0x4.R.inc(1550);c[i] = ' ';
		}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1551);return new String( c );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	public void dumpBoxes() {try{__CLR4_5_210a10alvl9g0x4.R.inc(1552);
		__CLR4_5_210a10alvl9g0x4.R.inc(1553);dumpBoxes( isoFile, 0 );
	}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
	
	private static void dumpBoxes( Container container, int indent ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1554);
		__CLR4_5_210a10alvl9g0x4.R.inc(1555);String meInd = getIndentation( indent );
		__CLR4_5_210a10alvl9g0x4.R.inc(1556);String subInd = getIndentation( indent + 2 );
		__CLR4_5_210a10alvl9g0x4.R.inc(1557);System.out.println( meInd +  container.getClass().getName() );
		__CLR4_5_210a10alvl9g0x4.R.inc(1558);for (Box box : container.getBoxes() ) {{
        	__CLR4_5_210a10alvl9g0x4.R.inc(1559);if( (((box instanceof Container )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1560)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1561)==0&false))) {{
        		__CLR4_5_210a10alvl9g0x4.R.inc(1562);dumpBoxes( (Container)box, indent + 2 );
        	}
        	}else {{
        		__CLR4_5_210a10alvl9g0x4.R.inc(1563);try {
	        		__CLR4_5_210a10alvl9g0x4.R.inc(1564);if( (((box instanceof UnknownBox )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1565)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1566)==0&false))) {{
	        			__CLR4_5_210a10alvl9g0x4.R.inc(1567);System.out.println( subInd + box.getClass().getName() + "[" + box.getSize() + "/" + box.getType() + "]:" + box.toString() );
	        		}
		        	}else {__CLR4_5_210a10alvl9g0x4.R.inc(1568);if( (((box instanceof Utf8AppleDataBox )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1569)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1570)==0&false))) {{
	        			__CLR4_5_210a10alvl9g0x4.R.inc(1571);System.out.println( subInd + box.getClass().getName() + ": " + box.getType() + ": " + box.toString() + ": " + ((Utf8AppleDataBox)box).getValue() );
		        	}
		        	}else {{
	        			__CLR4_5_210a10alvl9g0x4.R.inc(1572);System.out.println( subInd + box.getClass().getName() + ": " + box.getType() + "[" + box.getSize() + "]: " + box.toString() );
		        	}
        		}}}
        		catch( Exception e ) {
        			__CLR4_5_210a10alvl9g0x4.R.inc(1573);System.err.println( "Error parsing " + box.getClass().getSimpleName() + " box: " + e );
        			__CLR4_5_210a10alvl9g0x4.R.inc(1574);e.printStackTrace( System.err );
        		}
    		}
        }}
	}}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}

    public static boolean needsOffsetCorrection(IsoFile isoFile) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1575);

        __CLR4_5_210a10alvl9g0x4.R.inc(1576);if ((((Path.getPaths(isoFile, "mdat").size() > 1)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1577)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1578)==0&false))) {{
            __CLR4_5_210a10alvl9g0x4.R.inc(1579);throw new RuntimeException("There might be the weird case that a file has two mdats. One before" +
                    " moov and one after moov. That would need special handling therefore I just throw an " +
                    "exception here. ");
        }

        }__CLR4_5_210a10alvl9g0x4.R.inc(1580);if ((((Path.getPaths(isoFile, "moof").size() > 0)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1581)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1582)==0&false))) {{
            __CLR4_5_210a10alvl9g0x4.R.inc(1583);throw new RuntimeException("Fragmented MP4 files need correction, too. (But I would need to look where)");
        }

        }__CLR4_5_210a10alvl9g0x4.R.inc(1584);for (Box box : isoFile.getBoxes()) {{
            __CLR4_5_210a10alvl9g0x4.R.inc(1585);if (((("mdat".equals(box.getType()))&&(__CLR4_5_210a10alvl9g0x4.R.iget(1586)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1587)==0&false))) {{
                __CLR4_5_210a10alvl9g0x4.R.inc(1588);return false;
            }
            }__CLR4_5_210a10alvl9g0x4.R.inc(1589);if (((("moov".equals(box.getType()))&&(__CLR4_5_210a10alvl9g0x4.R.iget(1590)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1591)==0&false))) {{
                __CLR4_5_210a10alvl9g0x4.R.inc(1592);return true;
            }
        }}
        }__CLR4_5_210a10alvl9g0x4.R.inc(1593);throw new RuntimeException("Hmmm - shouldn't happen");
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}

    private static void correctChunkOffsets(IsoFile tempIsoFile, long correction) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1594);
        __CLR4_5_210a10alvl9g0x4.R.inc(1595);List<Box> chunkOffsetBoxes = Path.getPaths(tempIsoFile, "/moov[0]/trak/mdia[0]/minf[0]/stbl[0]/stco[0]");
        __CLR4_5_210a10alvl9g0x4.R.inc(1596);for (Box chunkOffsetBox : chunkOffsetBoxes) {{

            __CLR4_5_210a10alvl9g0x4.R.inc(1597);LinkedList<Box> stblChildren = new LinkedList<Box>(chunkOffsetBox.getParent().getBoxes());
            __CLR4_5_210a10alvl9g0x4.R.inc(1598);stblChildren.remove(chunkOffsetBox);

            __CLR4_5_210a10alvl9g0x4.R.inc(1599);long[] cOffsets = ((ChunkOffsetBox) chunkOffsetBox).getChunkOffsets();
            __CLR4_5_210a10alvl9g0x4.R.inc(1600);for (int i = 0; (((i < cOffsets.length)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1601)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1602)==0&false)); i++) {{
                __CLR4_5_210a10alvl9g0x4.R.inc(1603);cOffsets[i] += correction;
            }

            }__CLR4_5_210a10alvl9g0x4.R.inc(1604);StaticChunkOffsetBox cob = new StaticChunkOffsetBox();
            __CLR4_5_210a10alvl9g0x4.R.inc(1605);cob.setChunkOffsets(cOffsets);
            __CLR4_5_210a10alvl9g0x4.R.inc(1606);stblChildren.add(cob);
            __CLR4_5_210a10alvl9g0x4.R.inc(1607);chunkOffsetBox.getParent().setBoxes(stblChildren);
        }
    }}finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    public static void deleteQuietly( File f ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1608);
    	__CLR4_5_210a10alvl9g0x4.R.inc(1609);try {
    		__CLR4_5_210a10alvl9g0x4.R.inc(1610);f.delete();
    	}
    	catch( Exception ioe ) {
    		//ignore
    	}
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    public static void closeQuietly(IsoFile input) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1611);
        __CLR4_5_210a10alvl9g0x4.R.inc(1612);try {
            __CLR4_5_210a10alvl9g0x4.R.inc(1613);if ((((input != null)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1614)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1615)==0&false))) {{
                __CLR4_5_210a10alvl9g0x4.R.inc(1616);input.close();
            }
        }} catch (IOException ioe) {
            // ignore
        }
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    public static Box getBox( Container outer, String type ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1617);
    	__CLR4_5_210a10alvl9g0x4.R.inc(1618);List<Box> list = getBoxes( outer, new String[] { type } );
    	__CLR4_5_210a10alvl9g0x4.R.inc(1619);return list.get( 0 );
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    public static List<Box> getBoxes( Container outer, String types[], List<Box> list ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1620);
		__CLR4_5_210a10alvl9g0x4.R.inc(1621);for (Box box : outer.getBoxes() ) {{
        	__CLR4_5_210a10alvl9g0x4.R.inc(1622);for( int i = 0; (((i < types.length)&&(__CLR4_5_210a10alvl9g0x4.R.iget(1623)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1624)==0&false)); i++ ) {{
        		__CLR4_5_210a10alvl9g0x4.R.inc(1625);if( (((box.getType().equals( types[i] ) )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1626)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1627)==0&false))) {{
        			__CLR4_5_210a10alvl9g0x4.R.inc(1628);list.add( box );
        		}
        	}}
			}__CLR4_5_210a10alvl9g0x4.R.inc(1629);if( (((box instanceof Container )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1630)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1631)==0&false))) {{
        		__CLR4_5_210a10alvl9g0x4.R.inc(1632);getBoxes( (Container)box, types, list );
        	}
		}}
		}__CLR4_5_210a10alvl9g0x4.R.inc(1633);return list;
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    
    public static List<Box> getBoxes( Container outer, String types[] ) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1634);
		__CLR4_5_210a10alvl9g0x4.R.inc(1635);List<Box> list = new ArrayList<Box>();
    	__CLR4_5_210a10alvl9g0x4.R.inc(1636);return getBoxes( outer, types, list );
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    	
    

    //http://stackoverflow.com/questions/3389348/parse-any-date-in-java
    private static final HashMap<String, String> DATE_FORMAT_REGEXPS = new HashMap<String, String>() { {try{__CLR4_5_210a10alvl9g0x4.R.inc(1637);
        __CLR4_5_210a10alvl9g0x4.R.inc(1638);put("^\\d{8}$", "yyyyMMdd");
        __CLR4_5_210a10alvl9g0x4.R.inc(1639);put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
        __CLR4_5_210a10alvl9g0x4.R.inc(1640);put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
        __CLR4_5_210a10alvl9g0x4.R.inc(1641);put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
        __CLR4_5_210a10alvl9g0x4.R.inc(1642);put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
        __CLR4_5_210a10alvl9g0x4.R.inc(1643);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
        __CLR4_5_210a10alvl9g0x4.R.inc(1644);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
        __CLR4_5_210a10alvl9g0x4.R.inc(1645);put("^\\d{12}$", "yyyyMMddHHmm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1646);put("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1647);put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1648);put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1649);put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1650);put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1651);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1652);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
        __CLR4_5_210a10alvl9g0x4.R.inc(1653);put("^\\d{14}$", "yyyyMMddHHmmss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1654);put("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1655);put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1656);put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1657);put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1658);put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1659);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
        __CLR4_5_210a10alvl9g0x4.R.inc(1660);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}} };
    
    public static String determineDateFormat(String dateString) {try{__CLR4_5_210a10alvl9g0x4.R.inc(1661);
        __CLR4_5_210a10alvl9g0x4.R.inc(1662);for (String regexp : DATE_FORMAT_REGEXPS.keySet()) {{
            __CLR4_5_210a10alvl9g0x4.R.inc(1663);if ((((dateString.toLowerCase().matches(regexp))&&(__CLR4_5_210a10alvl9g0x4.R.iget(1664)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1665)==0&false))) {{
                __CLR4_5_210a10alvl9g0x4.R.inc(1666);return DATE_FORMAT_REGEXPS.get(regexp);
            }
        }}
        }__CLR4_5_210a10alvl9g0x4.R.inc(1667);return null; // Unknown format.
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    
    public static Date parseDate( String dateString ) throws ParseException {try{__CLR4_5_210a10alvl9g0x4.R.inc(1668);
    	__CLR4_5_210a10alvl9g0x4.R.inc(1669);String formatString = determineDateFormat( dateString );
    	__CLR4_5_210a10alvl9g0x4.R.inc(1670);if( (((formatString == null )&&(__CLR4_5_210a10alvl9g0x4.R.iget(1671)!=0|true))||(__CLR4_5_210a10alvl9g0x4.R.iget(1672)==0&false))) {{
    		__CLR4_5_210a10alvl9g0x4.R.inc(1673);return null;
    	}
    	}__CLR4_5_210a10alvl9g0x4.R.inc(1674);SimpleDateFormat sdf = new SimpleDateFormat( formatString );
    	__CLR4_5_210a10alvl9g0x4.R.inc(1675);return sdf.parse( dateString );
    }finally{__CLR4_5_210a10alvl9g0x4.R.flushNeeded();}}
    
}
