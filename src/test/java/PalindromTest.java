import Programowanie.zaj1.Palindrom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromTest {

    @Test
    public void testPalindrom() {
        assertEquals(true, Palindrom.binaryPalindrom(9));
        assertEquals(false, Palindrom.binaryPalindrom(8));
    }
}