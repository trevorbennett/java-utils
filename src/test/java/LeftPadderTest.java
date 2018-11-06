import org.junit.jupiter.api.Test;
import padding.LeftPadder;

import static org.junit.Assert.assertEquals;

public class LeftPadderTest {

    @Test
    public void testFixedPadding(){
        LeftPadder padder = new LeftPadder();
        String output = padder.padFixed(12345);
        assertEquals("00000000000012345",output);
    }

    @Test
    public void testFixedStringPadding(){
        LeftPadder padder = new LeftPadder();
        String output = padder.padFixedString("12345");
        assertEquals("00000000000012345",output);
    }

}
