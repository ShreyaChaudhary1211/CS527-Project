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
public class MetaDataTool {public static class __CLR4_5_2109109lvluo1jc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,1675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public static final boolean DEBUG = true;
	public static void main(String[] args) {try{__CLR4_5_2109109lvluo1jc.R.inc(1305);
		__CLR4_5_2109109lvluo1jc.R.inc(1306);if( (((args.length != 7 && args.length != 1 )&&(__CLR4_5_2109109lvluo1jc.R.iget(1307)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1308)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1309);System.err.println( "Usage: java -jar metaDatTool.jar <inputFile> <outputFile> <title> <createDate> <userRating> <; separated tags> <gps coordinates>" );
			__CLR4_5_2109109lvluo1jc.R.inc(1310);System.err.println( "  Use * for any value to keep the existing value, use an empty value to delete the current value" );
			__CLR4_5_2109109lvluo1jc.R.inc(1311);System.err.println( "  Example: java -jar metaDataTool.jar myFile.mp4 newFile.mp4 \"New Title\" \"*\" 5 \"myTag 1;myTag 2\" \"\"" );
			__CLR4_5_2109109lvluo1jc.R.inc(1312);System.err.println( "  This would retitle it, leave the create date alone, set the rating to 5 stars, " );
			__CLR4_5_2109109lvluo1jc.R.inc(1313);System.err.println( "  replace any tags with 'myTag 1' and 'myTag 2' and delete the existing GPS coordinates" );
			__CLR4_5_2109109lvluo1jc.R.inc(1314);System.err.println( "Other usage: java -jar metaDataToo.jar <inputFile>" );
			__CLR4_5_2109109lvluo1jc.R.inc(1315);System.err.println( "  Prints a dump of all tags in the file" );
			__CLR4_5_2109109lvluo1jc.R.inc(1316);System.exit( 1 );
		}
		
		}__CLR4_5_2109109lvluo1jc.R.inc(1317);if( (((args.length == 1 )&&(__CLR4_5_2109109lvluo1jc.R.iget(1318)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1319)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1320);MetaDataTool mdt;
			__CLR4_5_2109109lvluo1jc.R.inc(1321);try {
				__CLR4_5_2109109lvluo1jc.R.inc(1322);mdt = new MetaDataTool( args[0] );
				__CLR4_5_2109109lvluo1jc.R.inc(1323);mdt.dumpBoxes();
				__CLR4_5_2109109lvluo1jc.R.inc(1324);System.exit( 0 );
			} catch (IOException e) {
				__CLR4_5_2109109lvluo1jc.R.inc(1325);e.printStackTrace();
			}
		}
		
		}__CLR4_5_2109109lvluo1jc.R.inc(1326);int i = 0;
		__CLR4_5_2109109lvluo1jc.R.inc(1327);String inFile = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1328);String outFile = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1329);String title = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1330);String createDate = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1331);String userRating = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1332);String tags = args[i++];
		__CLR4_5_2109109lvluo1jc.R.inc(1333);String gpsCoords = args[i++];
		
		__CLR4_5_2109109lvluo1jc.R.inc(1334);try {
			__CLR4_5_2109109lvluo1jc.R.inc(1335);System.out.println( "================= BEFORE ===================" );
			__CLR4_5_2109109lvluo1jc.R.inc(1336);MetaDataTool mdt = new MetaDataTool( inFile );
			__CLR4_5_2109109lvluo1jc.R.inc(1337);mdt.dumpBoxes();
			__CLR4_5_2109109lvluo1jc.R.inc(1338);if( (((!"*".equals( title ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1339)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1340)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1341);mdt.setTitle( title );
			}
			}__CLR4_5_2109109lvluo1jc.R.inc(1342);if( (((!"*".equals( createDate ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1343)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1344)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1345);Date inputDate = parseDate( createDate );
				__CLR4_5_2109109lvluo1jc.R.inc(1346);mdt.setMediaCreateDate( inputDate );
				__CLR4_5_2109109lvluo1jc.R.inc(1347);mdt.setMediaModificationDate( inputDate );
			}
			}__CLR4_5_2109109lvluo1jc.R.inc(1348);if( (((!"*".equals( userRating ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1349)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1350)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1351);if( ((("".equals( userRating ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1352)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1353)==0&false))) {{
					__CLR4_5_2109109lvluo1jc.R.inc(1354);mdt.removeWindowsMediaTag( WM_RATING_TAG );
				}
				}else {{
					__CLR4_5_2109109lvluo1jc.R.inc(1355);mdt.setWindowsMediaRating( Integer.valueOf( userRating ) );
				}
			}}
			}__CLR4_5_2109109lvluo1jc.R.inc(1356);if( (((!"*".equals( tags ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1357)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1358)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1359);if( ((("".equals( tags ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1360)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1361)==0&false))) {{
					__CLR4_5_2109109lvluo1jc.R.inc(1362);mdt.removeWindowsMediaTag( WM_TAGS_TAG );
				}
				}else {{
					__CLR4_5_2109109lvluo1jc.R.inc(1363);String tagsAr[] = tags.split( ";" );
					__CLR4_5_2109109lvluo1jc.R.inc(1364);mdt.setWindowsMediaTags( tagsAr );
				}
			}}
			}__CLR4_5_2109109lvluo1jc.R.inc(1365);if( (((!"*".equals( gpsCoords ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1366)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1367)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1368);mdt.setGpsCoordinates( gpsCoords );
			}
			}__CLR4_5_2109109lvluo1jc.R.inc(1369);mdt.writeMp4( outFile );
			__CLR4_5_2109109lvluo1jc.R.inc(1370);if( (((DEBUG )&&(__CLR4_5_2109109lvluo1jc.R.iget(1371)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1372)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1373);mdt = new MetaDataTool( outFile );
				__CLR4_5_2109109lvluo1jc.R.inc(1374);System.out.println( "================= AFTER ===================" );
				__CLR4_5_2109109lvluo1jc.R.inc(1375);mdt.dumpBoxes();
			}
		}}
		catch( Exception e ) {
			__CLR4_5_2109109lvluo1jc.R.inc(1376);e.printStackTrace();
		}
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private long originalUserDataSize = 0;
	private XtraBox xtraBox;
	private UserDataBox userDataBox;
	private MetaBox metaBox;
	private IsoFile isoFile;
	
	public MetaDataTool( String path ) throws IOException {try{__CLR4_5_2109109lvluo1jc.R.inc(1377);
		
		//The source I copied this from created 2 new files, a temp file and a target file
		//I'm not sure this is necessary, but maybe when you make changes it's edited in-place?
		//Anyway, just to be safe I'm keeping it so no operations are done on original file
        __CLR4_5_2109109lvluo1jc.R.inc(1378);File videoFile = new File(path);
        __CLR4_5_2109109lvluo1jc.R.inc(1379);if ((((!videoFile.exists())&&(__CLR4_5_2109109lvluo1jc.R.iget(1380)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1381)==0&false)))
            {__CLR4_5_2109109lvluo1jc.R.inc(1382);throw new FileNotFoundException("File " + path + " not exists");

        }__CLR4_5_2109109lvluo1jc.R.inc(1383);if ((((!videoFile.canWrite())&&(__CLR4_5_2109109lvluo1jc.R.iget(1384)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1385)==0&false)))
            {__CLR4_5_2109109lvluo1jc.R.inc(1386);throw new IllegalStateException("No write permissions to file " + path);

        }__CLR4_5_2109109lvluo1jc.R.inc(1387);File tempFile = File.createTempFile("ChangeMetaData", "");
        __CLR4_5_2109109lvluo1jc.R.inc(1388);FileUtils.copyFile(videoFile, tempFile);
        __CLR4_5_2109109lvluo1jc.R.inc(1389);tempFile.deleteOnExit();

        __CLR4_5_2109109lvluo1jc.R.inc(1390);isoFile = new IsoFile(tempFile.getAbsolutePath());
        __CLR4_5_2109109lvluo1jc.R.inc(1391);userDataBox = Path.getPath(isoFile, "/moov/udta");
        __CLR4_5_2109109lvluo1jc.R.inc(1392);if( (((userDataBox != null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1393)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1394)==0&false))) {{
        	__CLR4_5_2109109lvluo1jc.R.inc(1395);originalUserDataSize = userDataBox.getSize();
        }
        
	}}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public static final String WM_RATING_TAG = "WM/SharedUserRating";
	public static final int WM_RATING_VALS[] = { 0, 1, 25, 50, 75, 99 };
	public void setWindowsMediaRating( int rating ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1396); //0-5
		__CLR4_5_2109109lvluo1jc.R.inc(1397);if( (((rating < 0 || rating > 5 )&&(__CLR4_5_2109109lvluo1jc.R.iget(1398)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1399)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1400);throw new RuntimeException( "Invalid rating, 0-5 only" );
		}
		
		}__CLR4_5_2109109lvluo1jc.R.inc(1401);if( (((rating == 0 )&&(__CLR4_5_2109109lvluo1jc.R.iget(1402)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1403)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1404);removeWindowsMediaTag( WM_RATING_TAG );
		}
		}else {{
			__CLR4_5_2109109lvluo1jc.R.inc(1405);setWindowsMediaLong( WM_RATING_TAG, WM_RATING_VALS[rating] );
		}
	}}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public static final String WM_TAGS_TAG = "WM/Category";
	public void setWindowsMediaTags( String tags[] ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1406);
		__CLR4_5_2109109lvluo1jc.R.inc(1407);if( (((tags == null || tags.length == 0 )&&(__CLR4_5_2109109lvluo1jc.R.iget(1408)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1409)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1410);removeWindowsMediaTag( WM_TAGS_TAG );
		}
		}else {{
			__CLR4_5_2109109lvluo1jc.R.inc(1411);setWindowsMediaStrings( WM_TAGS_TAG, tags );
		}
	}}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private void setMediaDate( Date date, boolean create ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1412);
		__CLR4_5_2109109lvluo1jc.R.inc(1413);List<Box> headers = getBoxes( isoFile, new String[] { MovieHeaderBox.TYPE, MediaHeaderBox.TYPE, TrackHeaderBox.TYPE } );
		__CLR4_5_2109109lvluo1jc.R.inc(1414);boolean set = false;
		__CLR4_5_2109109lvluo1jc.R.inc(1415);for( Box header : headers ) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1416);if( (((header instanceof MediaHeaderBox )&&(__CLR4_5_2109109lvluo1jc.R.iget(1417)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1418)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1419);set = true;
				__CLR4_5_2109109lvluo1jc.R.inc(1420);if( (((create )&&(__CLR4_5_2109109lvluo1jc.R.iget(1421)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1422)==0&false))) {{
					__CLR4_5_2109109lvluo1jc.R.inc(1423);((MediaHeaderBox)header).setCreationTime( date );
				}
				}else {{
					__CLR4_5_2109109lvluo1jc.R.inc(1424);((MediaHeaderBox)header).setModificationTime( date );
				}
			}}
			}else {__CLR4_5_2109109lvluo1jc.R.inc(1425);if( (((header instanceof MovieHeaderBox )&&(__CLR4_5_2109109lvluo1jc.R.iget(1426)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1427)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1428);set = true;
				__CLR4_5_2109109lvluo1jc.R.inc(1429);if( (((create )&&(__CLR4_5_2109109lvluo1jc.R.iget(1430)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1431)==0&false))) {{
					__CLR4_5_2109109lvluo1jc.R.inc(1432);((MovieHeaderBox)header).setCreationTime(date);
				}
				}else {{
					__CLR4_5_2109109lvluo1jc.R.inc(1433);((MovieHeaderBox)header).setModificationTime(date);
				}
			}}
			}else {__CLR4_5_2109109lvluo1jc.R.inc(1434);if( (((header instanceof TrackHeaderBox )&&(__CLR4_5_2109109lvluo1jc.R.iget(1435)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1436)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1437);set = true;
				__CLR4_5_2109109lvluo1jc.R.inc(1438);if( (((create )&&(__CLR4_5_2109109lvluo1jc.R.iget(1439)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1440)==0&false))) {{
					__CLR4_5_2109109lvluo1jc.R.inc(1441);((TrackHeaderBox)header).setCreationTime(date);
				}
				}else {{
					__CLR4_5_2109109lvluo1jc.R.inc(1442);((TrackHeaderBox)header).setModificationTime(date);
				}
				
			}}
		}}}}
		}__CLR4_5_2109109lvluo1jc.R.inc(1443);setWindowsMediaDate( "WM/EncodingTime", date );
		__CLR4_5_2109109lvluo1jc.R.inc(1444);if( (((!set )&&(__CLR4_5_2109109lvluo1jc.R.iget(1445)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1446)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1447);throw new RuntimeException( "Can't yet add MovieHeaderBox or MediaHeaderBox and none were preset to set create and/or modify date" );
		}
	}}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void setGpsCoordinates( String iso6709String ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1448);
		__CLR4_5_2109109lvluo1jc.R.inc(1449);AppleGPSCoordinatesBox coordBox = (AppleGPSCoordinatesBox)getBox( isoFile, AppleGPSCoordinatesBox.TYPE );
		__CLR4_5_2109109lvluo1jc.R.inc(1450);if( (((coordBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1451)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1452)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1453);UserDataBox udb = getUserDataBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1454);coordBox = new AppleGPSCoordinatesBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1455);udb.addBox( coordBox );
		}
		}__CLR4_5_2109109lvluo1jc.R.inc(1456);coordBox.setValue( iso6709String );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void setMediaCreateDate( Date date ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1457);
		__CLR4_5_2109109lvluo1jc.R.inc(1458);setMediaDate( date, true );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	public void setMediaModificationDate( Date date ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1459);
		__CLR4_5_2109109lvluo1jc.R.inc(1460);setMediaDate( date, false );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void setTitle( String title ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1461);
		__CLR4_5_2109109lvluo1jc.R.inc(1462);AppleNameBox titleBox = (AppleNameBox)getBox( isoFile, AppleNameBox.TYPE );
		__CLR4_5_2109109lvluo1jc.R.inc(1463);if( (((titleBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1464)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1465)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1466);AppleItemListBox itemList = getItemListBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1467);titleBox = new AppleNameBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1468);itemList.addBox( titleBox );
		}
		}__CLR4_5_2109109lvluo1jc.R.inc(1469);titleBox.setValue( title );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private AppleItemListBox getItemListBox() {try{__CLR4_5_2109109lvluo1jc.R.inc(1470);
		__CLR4_5_2109109lvluo1jc.R.inc(1471);AppleItemListBox itemList = (AppleItemListBox)getBox( isoFile, AppleItemListBox.TYPE );
		__CLR4_5_2109109lvluo1jc.R.inc(1472);if( (((itemList == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1473)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1474)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1475);MetaBox mb = getMetaBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1476);itemList = new AppleItemListBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1477);mb.addBox( itemList );
		}
		}__CLR4_5_2109109lvluo1jc.R.inc(1478);return itemList;
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	@SuppressWarnings("deprecation")
	public void setMediaModificationDate( String date ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1479);
		__CLR4_5_2109109lvluo1jc.R.inc(1480);setMediaModificationDate( new Date( Date.parse( date ) ) ); //Deprecated, but also the easiest way to do this quickly
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	@SuppressWarnings("deprecation")
	public void setMediaCreateDate( String date ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1481);
		__CLR4_5_2109109lvluo1jc.R.inc(1482);try {
			__CLR4_5_2109109lvluo1jc.R.inc(1483);setMediaCreateDate( new Date( Date.parse( date ) ) ); //Deprecated, but also the easiest way to do this quickly
		} catch( IllegalArgumentException e ) {
			__CLR4_5_2109109lvluo1jc.R.inc(1484);throw new RuntimeException( "Unable to parse date '" + date + "'", e );
		}
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void setWindowsMediaDate( String tagName, Date dateVal ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1485);
		__CLR4_5_2109109lvluo1jc.R.inc(1486);XtraBox xb = getXtraBox();
		__CLR4_5_2109109lvluo1jc.R.inc(1487);xb.setTagValue( tagName, dateVal );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}

	public void setWindowsMediaLong( String tagName, long longVal ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1488);
		__CLR4_5_2109109lvluo1jc.R.inc(1489);XtraBox xb = getXtraBox();
		__CLR4_5_2109109lvluo1jc.R.inc(1490);xb.setTagValue( tagName, longVal );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void setWindowsMediaStrings( String tagName, String values[] ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1491);
		__CLR4_5_2109109lvluo1jc.R.inc(1492);XtraBox xb = getXtraBox();
		__CLR4_5_2109109lvluo1jc.R.inc(1493);xb.setTagValues( tagName, values );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void removeWindowsMediaTag( String tagName ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1494);
		__CLR4_5_2109109lvluo1jc.R.inc(1495);XtraBox xb = getXtraBox();
		__CLR4_5_2109109lvluo1jc.R.inc(1496);xb.removeTag( tagName );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	

	private UserDataBox getUserDataBox() {try{__CLR4_5_2109109lvluo1jc.R.inc(1497);
		__CLR4_5_2109109lvluo1jc.R.inc(1498);if( (((userDataBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1499)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1500)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1501);userDataBox = new UserDataBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1502);isoFile.getMovieBox().addBox( userDataBox );
		}
		}__CLR4_5_2109109lvluo1jc.R.inc(1503);return userDataBox;
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private MetaBox getMetaBox() {try{__CLR4_5_2109109lvluo1jc.R.inc(1504);
		__CLR4_5_2109109lvluo1jc.R.inc(1505);if( (((metaBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1506)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1507)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1508);UserDataBox ud = getUserDataBox();
			__CLR4_5_2109109lvluo1jc.R.inc(1509);metaBox = (MetaBox) getBox( ud, MetaBox.TYPE );
			__CLR4_5_2109109lvluo1jc.R.inc(1510);if( (((metaBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1511)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1512)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1513);metaBox = new MetaBox();
                __CLR4_5_2109109lvluo1jc.R.inc(1514);ud.addBox(metaBox);
			}
		}}
		}__CLR4_5_2109109lvluo1jc.R.inc(1515);return metaBox;
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private XtraBox getXtraBox() {try{__CLR4_5_2109109lvluo1jc.R.inc(1516);
		__CLR4_5_2109109lvluo1jc.R.inc(1517);if( (((xtraBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1518)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1519)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1520);UserDataBox ud = getUserDataBox(); //Create user data box if necessary
			__CLR4_5_2109109lvluo1jc.R.inc(1521);xtraBox = (XtraBox)getBox( ud, XtraBox.TYPE );
			__CLR4_5_2109109lvluo1jc.R.inc(1522);if( (((xtraBox == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1523)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1524)==0&false))) {{
				__CLR4_5_2109109lvluo1jc.R.inc(1525);xtraBox = new XtraBox();
				__CLR4_5_2109109lvluo1jc.R.inc(1526);ud.addBox( xtraBox );
			}
		}}
		}__CLR4_5_2109109lvluo1jc.R.inc(1527);return xtraBox;
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void writeMp4( String filename ) throws IOException {try{__CLR4_5_2109109lvluo1jc.R.inc(1528);
        __CLR4_5_2109109lvluo1jc.R.inc(1529);long finalUserDataSize = 0;
		__CLR4_5_2109109lvluo1jc.R.inc(1530);if( (((userDataBox != null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1531)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1532)==0&false))) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1533);finalUserDataSize = userDataBox.getSize();
		}
        }__CLR4_5_2109109lvluo1jc.R.inc(1534);if ((((needsOffsetCorrection(isoFile))&&(__CLR4_5_2109109lvluo1jc.R.iget(1535)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1536)==0&false))) {{
            __CLR4_5_2109109lvluo1jc.R.inc(1537);correctChunkOffsets(isoFile, finalUserDataSize - originalUserDataSize);
        }
        }__CLR4_5_2109109lvluo1jc.R.inc(1538);FileOutputStream videoFileOutputStream = null;
        __CLR4_5_2109109lvluo1jc.R.inc(1539);try {
	        __CLR4_5_2109109lvluo1jc.R.inc(1540);videoFileOutputStream = new FileOutputStream(filename);
	        __CLR4_5_2109109lvluo1jc.R.inc(1541);isoFile.getBox(videoFileOutputStream.getChannel());
        }
        finally {
        	__CLR4_5_2109109lvluo1jc.R.inc(1542);closeQuietly(isoFile);
        	__CLR4_5_2109109lvluo1jc.R.inc(1543);IOUtils.closeQuietly(videoFileOutputStream);
        }
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private static String getIndentation( int indent ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1544);
		__CLR4_5_2109109lvluo1jc.R.inc(1545);char c[] = new char[indent];
		__CLR4_5_2109109lvluo1jc.R.inc(1546);for( int i = 0; (((i < indent)&&(__CLR4_5_2109109lvluo1jc.R.iget(1547)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1548)==0&false)); i++ ) {{
			__CLR4_5_2109109lvluo1jc.R.inc(1549);c[i] = ' ';
		}
		}__CLR4_5_2109109lvluo1jc.R.inc(1550);return new String( c );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	public void dumpBoxes() {try{__CLR4_5_2109109lvluo1jc.R.inc(1551);
		__CLR4_5_2109109lvluo1jc.R.inc(1552);dumpBoxes( isoFile, 0 );
	}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
	
	private static void dumpBoxes( Container container, int indent ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1553);
		__CLR4_5_2109109lvluo1jc.R.inc(1554);String meInd = getIndentation( indent );
		__CLR4_5_2109109lvluo1jc.R.inc(1555);String subInd = getIndentation( indent + 2 );
		__CLR4_5_2109109lvluo1jc.R.inc(1556);System.out.println( meInd +  container.getClass().getName() );
		__CLR4_5_2109109lvluo1jc.R.inc(1557);for (Box box : container.getBoxes() ) {{
        	__CLR4_5_2109109lvluo1jc.R.inc(1558);if( (((box instanceof Container )&&(__CLR4_5_2109109lvluo1jc.R.iget(1559)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1560)==0&false))) {{
        		__CLR4_5_2109109lvluo1jc.R.inc(1561);dumpBoxes( (Container)box, indent + 2 );
        	}
        	}else {{
        		__CLR4_5_2109109lvluo1jc.R.inc(1562);try {
	        		__CLR4_5_2109109lvluo1jc.R.inc(1563);if( (((box instanceof UnknownBox )&&(__CLR4_5_2109109lvluo1jc.R.iget(1564)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1565)==0&false))) {{
	        			__CLR4_5_2109109lvluo1jc.R.inc(1566);System.out.println( subInd + box.getClass().getName() + "[" + box.getSize() + "/" + box.getType() + "]:" + box.toString() );
	        		}
		        	}else {__CLR4_5_2109109lvluo1jc.R.inc(1567);if( (((box instanceof Utf8AppleDataBox )&&(__CLR4_5_2109109lvluo1jc.R.iget(1568)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1569)==0&false))) {{
	        			__CLR4_5_2109109lvluo1jc.R.inc(1570);System.out.println( subInd + box.getClass().getName() + ": " + box.getType() + ": " + box.toString() + ": " + ((Utf8AppleDataBox)box).getValue() );
		        	}
		        	}else {{
	        			__CLR4_5_2109109lvluo1jc.R.inc(1571);System.out.println( subInd + box.getClass().getName() + ": " + box.getType() + "[" + box.getSize() + "]: " + box.toString() );
		        	}
        		}}}
        		catch( Exception e ) {
        			__CLR4_5_2109109lvluo1jc.R.inc(1572);System.err.println( "Error parsing " + box.getClass().getSimpleName() + " box: " + e );
        			__CLR4_5_2109109lvluo1jc.R.inc(1573);e.printStackTrace( System.err );
        		}
    		}
        }}
	}}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}

    public static boolean needsOffsetCorrection(IsoFile isoFile) {try{__CLR4_5_2109109lvluo1jc.R.inc(1574);

        __CLR4_5_2109109lvluo1jc.R.inc(1575);if ((((Path.getPaths(isoFile, "mdat").size() > 1)&&(__CLR4_5_2109109lvluo1jc.R.iget(1576)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1577)==0&false))) {{
            __CLR4_5_2109109lvluo1jc.R.inc(1578);throw new RuntimeException("There might be the weird case that a file has two mdats. One before" +
                    " moov and one after moov. That would need special handling therefore I just throw an " +
                    "exception here. ");
        }

        }__CLR4_5_2109109lvluo1jc.R.inc(1579);if ((((Path.getPaths(isoFile, "moof").size() > 0)&&(__CLR4_5_2109109lvluo1jc.R.iget(1580)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1581)==0&false))) {{
            __CLR4_5_2109109lvluo1jc.R.inc(1582);throw new RuntimeException("Fragmented MP4 files need correction, too. (But I would need to look where)");
        }

        }__CLR4_5_2109109lvluo1jc.R.inc(1583);for (Box box : isoFile.getBoxes()) {{
            __CLR4_5_2109109lvluo1jc.R.inc(1584);if (((("mdat".equals(box.getType()))&&(__CLR4_5_2109109lvluo1jc.R.iget(1585)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1586)==0&false))) {{
                __CLR4_5_2109109lvluo1jc.R.inc(1587);return false;
            }
            }__CLR4_5_2109109lvluo1jc.R.inc(1588);if (((("moov".equals(box.getType()))&&(__CLR4_5_2109109lvluo1jc.R.iget(1589)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1590)==0&false))) {{
                __CLR4_5_2109109lvluo1jc.R.inc(1591);return true;
            }
        }}
        }__CLR4_5_2109109lvluo1jc.R.inc(1592);throw new RuntimeException("Hmmm - shouldn't happen");
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}

    private static void correctChunkOffsets(IsoFile tempIsoFile, long correction) {try{__CLR4_5_2109109lvluo1jc.R.inc(1593);
        __CLR4_5_2109109lvluo1jc.R.inc(1594);List<Box> chunkOffsetBoxes = Path.getPaths(tempIsoFile, "/moov[0]/trak/mdia[0]/minf[0]/stbl[0]/stco[0]");
        __CLR4_5_2109109lvluo1jc.R.inc(1595);for (Box chunkOffsetBox : chunkOffsetBoxes) {{

            __CLR4_5_2109109lvluo1jc.R.inc(1596);LinkedList<Box> stblChildren = new LinkedList<Box>(chunkOffsetBox.getParent().getBoxes());
            __CLR4_5_2109109lvluo1jc.R.inc(1597);stblChildren.remove(chunkOffsetBox);

            __CLR4_5_2109109lvluo1jc.R.inc(1598);long[] cOffsets = ((ChunkOffsetBox) chunkOffsetBox).getChunkOffsets();
            __CLR4_5_2109109lvluo1jc.R.inc(1599);for (int i = 0; (((i < cOffsets.length)&&(__CLR4_5_2109109lvluo1jc.R.iget(1600)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1601)==0&false)); i++) {{
                __CLR4_5_2109109lvluo1jc.R.inc(1602);cOffsets[i] += correction;
            }

            }__CLR4_5_2109109lvluo1jc.R.inc(1603);StaticChunkOffsetBox cob = new StaticChunkOffsetBox();
            __CLR4_5_2109109lvluo1jc.R.inc(1604);cob.setChunkOffsets(cOffsets);
            __CLR4_5_2109109lvluo1jc.R.inc(1605);stblChildren.add(cob);
            __CLR4_5_2109109lvluo1jc.R.inc(1606);chunkOffsetBox.getParent().setBoxes(stblChildren);
        }
    }}finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    public static void deleteQuietly( File f ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1607);
    	__CLR4_5_2109109lvluo1jc.R.inc(1608);try {
    		__CLR4_5_2109109lvluo1jc.R.inc(1609);f.delete();
    	}
    	catch( Exception ioe ) {
    		//ignore
    	}
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    public static void closeQuietly(IsoFile input) {try{__CLR4_5_2109109lvluo1jc.R.inc(1610);
        __CLR4_5_2109109lvluo1jc.R.inc(1611);try {
            __CLR4_5_2109109lvluo1jc.R.inc(1612);if ((((input != null)&&(__CLR4_5_2109109lvluo1jc.R.iget(1613)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1614)==0&false))) {{
                __CLR4_5_2109109lvluo1jc.R.inc(1615);input.close();
            }
        }} catch (IOException ioe) {
            // ignore
        }
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    public static Box getBox( Container outer, String type ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1616);
    	__CLR4_5_2109109lvluo1jc.R.inc(1617);List<Box> list = getBoxes( outer, new String[] { type } );
    	__CLR4_5_2109109lvluo1jc.R.inc(1618);return list.get( 0 );
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    public static List<Box> getBoxes( Container outer, String types[], List<Box> list ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1619);
		__CLR4_5_2109109lvluo1jc.R.inc(1620);for (Box box : outer.getBoxes() ) {{
        	__CLR4_5_2109109lvluo1jc.R.inc(1621);for( int i = 0; (((i < types.length)&&(__CLR4_5_2109109lvluo1jc.R.iget(1622)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1623)==0&false)); i++ ) {{
        		__CLR4_5_2109109lvluo1jc.R.inc(1624);if( (((box.getType().equals( types[i] ) )&&(__CLR4_5_2109109lvluo1jc.R.iget(1625)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1626)==0&false))) {{
        			__CLR4_5_2109109lvluo1jc.R.inc(1627);list.add( box );
        		}
        	}}
			}__CLR4_5_2109109lvluo1jc.R.inc(1628);if( (((box instanceof Container )&&(__CLR4_5_2109109lvluo1jc.R.iget(1629)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1630)==0&false))) {{
        		__CLR4_5_2109109lvluo1jc.R.inc(1631);getBoxes( (Container)box, types, list );
        	}
		}}
		}__CLR4_5_2109109lvluo1jc.R.inc(1632);return list;
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    
    public static List<Box> getBoxes( Container outer, String types[] ) {try{__CLR4_5_2109109lvluo1jc.R.inc(1633);
		__CLR4_5_2109109lvluo1jc.R.inc(1634);List<Box> list = new ArrayList<Box>();
    	__CLR4_5_2109109lvluo1jc.R.inc(1635);return getBoxes( outer, types, list );
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    	
    

    //http://stackoverflow.com/questions/3389348/parse-any-date-in-java
    private static final HashMap<String, String> DATE_FORMAT_REGEXPS = new HashMap<String, String>() { {try{__CLR4_5_2109109lvluo1jc.R.inc(1636);
        __CLR4_5_2109109lvluo1jc.R.inc(1637);put("^\\d{8}$", "yyyyMMdd");
        __CLR4_5_2109109lvluo1jc.R.inc(1638);put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
        __CLR4_5_2109109lvluo1jc.R.inc(1639);put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
        __CLR4_5_2109109lvluo1jc.R.inc(1640);put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
        __CLR4_5_2109109lvluo1jc.R.inc(1641);put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
        __CLR4_5_2109109lvluo1jc.R.inc(1642);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
        __CLR4_5_2109109lvluo1jc.R.inc(1643);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
        __CLR4_5_2109109lvluo1jc.R.inc(1644);put("^\\d{12}$", "yyyyMMddHHmm");
        __CLR4_5_2109109lvluo1jc.R.inc(1645);put("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
        __CLR4_5_2109109lvluo1jc.R.inc(1646);put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1647);put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1648);put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1649);put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1650);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1651);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
        __CLR4_5_2109109lvluo1jc.R.inc(1652);put("^\\d{14}$", "yyyyMMddHHmmss");
        __CLR4_5_2109109lvluo1jc.R.inc(1653);put("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
        __CLR4_5_2109109lvluo1jc.R.inc(1654);put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
        __CLR4_5_2109109lvluo1jc.R.inc(1655);put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
        __CLR4_5_2109109lvluo1jc.R.inc(1656);put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
        __CLR4_5_2109109lvluo1jc.R.inc(1657);put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
        __CLR4_5_2109109lvluo1jc.R.inc(1658);put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
        __CLR4_5_2109109lvluo1jc.R.inc(1659);put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}} };
    
    public static String determineDateFormat(String dateString) {try{__CLR4_5_2109109lvluo1jc.R.inc(1660);
        __CLR4_5_2109109lvluo1jc.R.inc(1661);for (String regexp : DATE_FORMAT_REGEXPS.keySet()) {{
            __CLR4_5_2109109lvluo1jc.R.inc(1662);if ((((dateString.toLowerCase().matches(regexp))&&(__CLR4_5_2109109lvluo1jc.R.iget(1663)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1664)==0&false))) {{
                __CLR4_5_2109109lvluo1jc.R.inc(1665);return DATE_FORMAT_REGEXPS.get(regexp);
            }
        }}
        }__CLR4_5_2109109lvluo1jc.R.inc(1666);return null; // Unknown format.
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    
    public static Date parseDate( String dateString ) throws ParseException {try{__CLR4_5_2109109lvluo1jc.R.inc(1667);
    	__CLR4_5_2109109lvluo1jc.R.inc(1668);String formatString = determineDateFormat( dateString );
    	__CLR4_5_2109109lvluo1jc.R.inc(1669);if( (((formatString == null )&&(__CLR4_5_2109109lvluo1jc.R.iget(1670)!=0|true))||(__CLR4_5_2109109lvluo1jc.R.iget(1671)==0&false))) {{
    		__CLR4_5_2109109lvluo1jc.R.inc(1672);return null;
    	}
    	}__CLR4_5_2109109lvluo1jc.R.inc(1673);SimpleDateFormat sdf = new SimpleDateFormat( formatString );
    	__CLR4_5_2109109lvluo1jc.R.inc(1674);return sdf.parse( dateString );
    }finally{__CLR4_5_2109109lvluo1jc.R.flushNeeded();}}
    
}
