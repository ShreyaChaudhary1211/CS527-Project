/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.cenc;

import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import org.junit.Assert;
import org.junit.Test;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sannies on 1/9/14.
 */
public class CencSampleListsTest {static class __CLR4_5_2k82k82lvlulr5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String encryptedWorking = "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
            "000000000000000000000000000000000000000000DBF184112EB9111659712BAFCFF2AB249A7A06" +
            "19AAC29E6C1F2B5C4753D588F3142C51C9AF2CF1D92E8937C4FBC18D7AB212DA6951717F955907CA" +
            "D6BCFE086AB884CCFD8FB15E9915DB6AD76B296E4DF75D95D7A723B9FD967BF470B20130B8E0F59B" +
            "A30B8F5952638DE780179C95ABCA7A3453984B8BAB49189FA1A1FB5996872A681256DF43A616C790" +
            "BEF3041122FDF86ACAF3000127D77692B8DD6B44CB6AEEC7D3920932F607A3445CC03A6101E6648B" +
            "E4CF350EC5B1C195B4431779A2AF1877AD1499EE2611D3C8BB48172DCF7367F9F8F40E49AECE2DA7" +
            "44430E6757C6517D4198A9AB74CD0409CD4B8AAA1B98C2DF4A0EA02FCB6383FF34D84F10373CE3B1" +
            "DF6B0D29D1DB0154A3CB05E4D962BB636C1F65181B28CA5B831481E910E8D478497B459A4B940087" +
            "6115BDBDF99A20D799E372977105566FF2818AD6CF03253B42C7961C26A85A6180EAC0736C5A1F0F" +
            "2EC9833180FD82F14B63903F8AB8D006BD91E762AD5117DA4ECC33328E78373E3AC7913A11569983" +
            "E31F75D2A70000000000000000000000000000000000000000000000000000000000000000000000" +
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
            "00000000000000000000000000000000000000000000000000000000000012C39E2DB870BD84029C" +
            "C00D3C123C53CFE967DED22459B413C8784D746C36E06B8C1EA14193C9B7A3652F6168D321939955" +
            "B86816E30E8C3D6CE8980D4E2FB4738CA7A21E14CF08D9E9723A59AF03B2961F8001B4409B66432D" +
            "1DD2BADE4BF4B50392645B6E2BE2FE93A6FD65D18AE60024CBFF010543C2D2E907812FE319A7CA5D" +
            "F6198A830FCB2E09D4D94638E909B0AEA344C6E5EE0C22546CDE272B54332BA83010BC570C738F82" +
            "78DFC4B63FDDAC2FB138ADF70C54606709E2B1035EE961DAF730F099EFA92D5AE4A87386DD54C1DC" +
            "919FE0E3D19C0D591EF9FEE498296D7DD967FE6112FCADABCB54D8F6AFF57C5BF9B032E8F790AD5A" +
            "A25EB003AC143E32E49A6D2D9D40990377A5E7EF76EC00F8D08B48333568505B6DA69B96CDBF7A7E" +
            "70886235FECC83389FC6EEAED3ECEFE4CB941A85C8D5B50A57A0BEB6A62918769ECAB79F9717741D" +
            "0118933E0611DEED910FE7ADD8B95355A9D4C43CD9328A3C585F5973BF16586FB4CFE0F419D56BC0" +
            "0C0BEAE83933ACB83E1DF2DC1B3E14FD5E5352E46EB823C33CF674D6292AAB377520EF22C60D60B1" +
            "7BB73DE3CD78215A52D3EDBDAD96D2B62F953CFF333AE9C221CDD9B498A03F886F761CBBC0C954B7" +
            "A57CFD0181094CFF0F5EBAC1056CF6DC0406D26BF612E2EE748CA2B52863889C81DD4D5419B009A6" +
            "6927B591060A0A4275044F03857138E4F761F1B58B980337BEF2957F1FF2E9B1351D517FB93F01C3" +
            "215EA09090A23EC3BFFC12F48E92101F6FE95C3C117998BA360050448B2753D0584A41F18EA25BCD" +
            "BDAA10DB623FBB53D3DB6F7D028990B411B9B5ECB11F423A9D2A4F8AFFC51E8B0C471545B4A545A7" +
            "0C7D89D42F0DC946A43389A6BF0168F546AC1667F43937DC4893DB329249";

    @Test
    public void test() throws IOException {__CLR4_5_2k82k82lvlulr5i.R.globalSliceStart(getClass().getName(),26210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt3k82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k82k82lvlulr5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k82k82lvlulr5i.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencSampleListsTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt3k82() throws IOException{try{__CLR4_5_2k82k82lvlulr5i.R.inc(26210);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26211);SecretKey secretKey = new SecretKeySpec(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, "AES");

        __CLR4_5_2k82k82lvlulr5i.R.inc(26212);List<Sample> clearSamples = Collections.<Sample>singletonList(
                new SampleImpl(ByteBuffer.wrap(new byte[1230])));

        __CLR4_5_2k82k82lvlulr5i.R.inc(26213);CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_2k82k82lvlulr5i.R.inc(26214);cencSampleAuxiliaryDataFormat.pairs = new CencSampleAuxiliaryDataFormat.Pair[2];
        __CLR4_5_2k82k82lvlulr5i.R.inc(26215);cencSampleAuxiliaryDataFormat.pairs[0] = cencSampleAuxiliaryDataFormat.createPair(101, 384);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26216);cencSampleAuxiliaryDataFormat.pairs[1] = cencSampleAuxiliaryDataFormat.createPair(105, 640);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26217);cencSampleAuxiliaryDataFormat.iv = new byte[16];


        __CLR4_5_2k82k82lvlulr5i.R.inc(26218);CencEncryptingSampleList cencSamples =
                new CencEncryptingSampleList(
                        secretKey, clearSamples,
                        Collections.singletonList(cencSampleAuxiliaryDataFormat));

        __CLR4_5_2k82k82lvlulr5i.R.inc(26219);Assert.assertEquals(1, cencSamples.size());
        __CLR4_5_2k82k82lvlulr5i.R.inc(26220);Sample encSample = cencSamples.get(0);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26221);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2k82k82lvlulr5i.R.inc(26222);encSample.writeTo(Channels.newChannel(baos));
        __CLR4_5_2k82k82lvlulr5i.R.inc(26223);Assert.assertEquals(encryptedWorking, Hex.encodeHex(baos.toByteArray()));
        __CLR4_5_2k82k82lvlulr5i.R.inc(26224);Assert.assertEquals(encryptedWorking, Hex.encodeHex(encSample.asByteBuffer().array()));


    }finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}

    @Test
    public void testMultipleKeysCencSubSample() throws IOException {__CLR4_5_2k82k82lvlulr5i.R.globalSliceStart(getClass().getName(),26225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21yz3vgk8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k82k82lvlulr5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k82k82lvlulr5i.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencSampleListsTest.testMultipleKeysCencSubSample",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21yz3vgk8h() throws IOException{try{__CLR4_5_2k82k82lvlulr5i.R.inc(26225);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26226);testMultipleKeys("cenc", true);
    }finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}

    @Test
    public void testMultipleKeysCbc1SubSample() throws IOException {__CLR4_5_2k82k82lvlulr5i.R.globalSliceStart(getClass().getName(),26227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6hk32k8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k82k82lvlulr5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k82k82lvlulr5i.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencSampleListsTest.testMultipleKeysCbc1SubSample",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6hk32k8j() throws IOException{try{__CLR4_5_2k82k82lvlulr5i.R.inc(26227);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26228);testMultipleKeys("cbc1", true);
    }finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}

    @Test
    public void testMultipleKeysCencFull() throws IOException {__CLR4_5_2k82k82lvlulr5i.R.globalSliceStart(getClass().getName(),26229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297y003k8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k82k82lvlulr5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k82k82lvlulr5i.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencSampleListsTest.testMultipleKeysCencFull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297y003k8l() throws IOException{try{__CLR4_5_2k82k82lvlulr5i.R.inc(26229);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26230);testMultipleKeys("cenc", false);
    }finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}

    @Test
    public void testMultipleKeysCbc1Full() throws IOException {__CLR4_5_2k82k82lvlulr5i.R.globalSliceStart(getClass().getName(),26231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2huei2vk8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k82k82lvlulr5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k82k82lvlulr5i.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencSampleListsTest.testMultipleKeysCbc1Full",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2huei2vk8n() throws IOException{try{__CLR4_5_2k82k82lvlulr5i.R.inc(26231);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26232);testMultipleKeys("cbc1", false);
    }finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}

    public void testMultipleKeys(String encAlgo, boolean subSampleEncryption) throws IOException {try{__CLR4_5_2k82k82lvlulr5i.R.inc(26233);

        __CLR4_5_2k82k82lvlulr5i.R.inc(26234);SecretKey cek1 = new SecretKeySpec(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, "AES");
        __CLR4_5_2k82k82lvlulr5i.R.inc(26235);SecretKey cek2 = new SecretKeySpec(new byte[]{2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, "AES");

        __CLR4_5_2k82k82lvlulr5i.R.inc(26236);RangeStartMap<Integer, SecretKey> keys = new RangeStartMap<Integer, SecretKey>();
        __CLR4_5_2k82k82lvlulr5i.R.inc(26237);keys.put(0, cek1);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26238);keys.put(3, null);
        __CLR4_5_2k82k82lvlulr5i.R.inc(26239);keys.put(5, cek2);


        __CLR4_5_2k82k82lvlulr5i.R.inc(26240);List<Sample> clearSamples = Arrays.<Sample>asList(
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230])),
                new SampleImpl(ByteBuffer.wrap(new byte[1230]))
        );


        __CLR4_5_2k82k82lvlulr5i.R.inc(26241);CencSampleAuxiliaryDataFormat cencAuxDef = new CencSampleAuxiliaryDataFormat();

        __CLR4_5_2k82k82lvlulr5i.R.inc(26242);if ((((subSampleEncryption)&&(__CLR4_5_2k82k82lvlulr5i.R.iget(26243)!=0|true))||(__CLR4_5_2k82k82lvlulr5i.R.iget(26244)==0&false))) {{
            __CLR4_5_2k82k82lvlulr5i.R.inc(26245);cencAuxDef.pairs = new CencSampleAuxiliaryDataFormat.Pair[2];
            __CLR4_5_2k82k82lvlulr5i.R.inc(26246);cencAuxDef.pairs[0] = cencAuxDef.createPair(101, 384);
            __CLR4_5_2k82k82lvlulr5i.R.inc(26247);cencAuxDef.pairs[1] = cencAuxDef.createPair(105, 640);
        }
        }__CLR4_5_2k82k82lvlulr5i.R.inc(26248);cencAuxDef.iv = new byte[16];

        __CLR4_5_2k82k82lvlulr5i.R.inc(26249);CencSampleAuxiliaryDataFormat cencAuxPlain = new CencSampleAuxiliaryDataFormat();

        __CLR4_5_2k82k82lvlulr5i.R.inc(26250);List<CencSampleAuxiliaryDataFormat> auxInfos = Arrays.asList(
                cencAuxDef, cencAuxDef, cencAuxDef,
                cencAuxPlain, cencAuxPlain,
                cencAuxDef, cencAuxDef, cencAuxDef, cencAuxDef);


        __CLR4_5_2k82k82lvlulr5i.R.inc(26251);CencEncryptingSampleList cencSamples =
                new CencEncryptingSampleList(
                        keys, clearSamples, auxInfos, encAlgo);

        __CLR4_5_2k82k82lvlulr5i.R.inc(26252);Assert.assertEquals(9, cencSamples.size());
        __CLR4_5_2k82k82lvlulr5i.R.inc(26253);for (int i = 0; (((i < cencSamples.size())&&(__CLR4_5_2k82k82lvlulr5i.R.iget(26254)!=0|true))||(__CLR4_5_2k82k82lvlulr5i.R.iget(26255)==0&false)); i++) {{

            __CLR4_5_2k82k82lvlulr5i.R.inc(26256);CencDecryptingSampleList dec = new CencDecryptingSampleList(
                    new RangeStartMap<Integer, SecretKey>(0, keys.get(i)),
                    Collections.singletonList(cencSamples.get(i)),
                    Collections.singletonList(auxInfos.get(i)), encAlgo);

            __CLR4_5_2k82k82lvlulr5i.R.inc(26257);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2k82k82lvlulr5i.R.inc(26258);dec.get(0).writeTo(Channels.newChannel(baos));
            __CLR4_5_2k82k82lvlulr5i.R.inc(26259);Assert.assertArrayEquals("Sample " + i + " can not be reconstructed", new byte[1230], baos.toByteArray());
        }

        }__CLR4_5_2k82k82lvlulr5i.R.inc(26260);CencDecryptingSampleList decryptingSampleList = new CencDecryptingSampleList(
                keys,
                cencSamples,
                auxInfos,
                encAlgo);

        __CLR4_5_2k82k82lvlulr5i.R.inc(26261);for (int i = 0; (((i < cencSamples.size())&&(__CLR4_5_2k82k82lvlulr5i.R.iget(26262)!=0|true))||(__CLR4_5_2k82k82lvlulr5i.R.iget(26263)==0&false)); i++) {{
            __CLR4_5_2k82k82lvlulr5i.R.inc(26264);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_2k82k82lvlulr5i.R.inc(26265);decryptingSampleList.get(i).writeTo(Channels.newChannel(baos));
            __CLR4_5_2k82k82lvlulr5i.R.inc(26266);Assert.assertArrayEquals("Sample " + i + " can not be reconstructed", new byte[1230], baos.toByteArray());
        }


    }}finally{__CLR4_5_2k82k82lvlulr5i.R.flushNeeded();}}
}
