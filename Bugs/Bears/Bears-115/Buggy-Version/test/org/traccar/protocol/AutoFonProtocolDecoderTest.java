package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;


public class AutoFonProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        AutoFonProtocolDecoder decoder = new AutoFonProtocolDecoder(new AutoFonProtocol());

        verifyNull(decoder, binary(
                "10556103592310314825728F"));

        verifyPosition(decoder, binary(
                "02080000251848470afa010262daa690013aa4046da83745f8812560df010001126a"));

        verifyPosition(decoder, binary(
                "111E00000000000000000100007101010B0C020302010B0C0005A053FFFFFFFF02010B0C00276047FFFFFFFF1F5600FA000176F218C7850C0B0B0C203A033DBD46035783EF009E00320014FFFF45"));

        //verifyPosition(decoder, binary(
        //        "12060000007501010B0C00089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF02007601010B0C00269CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF4A007601010B0C01089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF04007501010B0C01269CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF80007601010B0C02089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFFA6007501010B0C02231F5600FA000176F218C70000000000000000000000000000000000000003E7FFFF9629"));

        verifyNull(decoder, binary(
                "41035151305289931441139602662095148807"));

        verifyNull(decoder, binary(
                "41032125656985547543619173484002123481"));

        verifyPosition(decoder, binary(
                "023E00001E004D411EFA01772F185285009C48041F1E366C2961380F26B10B00911C"),
                position("2010-01-27 04:00:08.000", true, 54.73838, 56.10343));

        verifyPosition(decoder, binary(
                "023E00001E004D411EFA01772F185285009C48041F1E366C2961380F26B10B00911C"));

    }

}
