import Programowanie.zaj3.StringHelper;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.fail;

public class SortTest {

    @Test
    public void testSort() {
        char[]t = {'f', 'e', 'c', 'b', 'b', 'c', 'a', 'a', 'b'};
        StringHelper.sortChars(t);
        System.out.println(Arrays.toString(t));
        for (int i = 0; i < t.length - 1; i++) {
            int asci1 = (int)t[i];
            int asci2 = (int)t[i + 1];
            if (asci1 > asci2) {
                fail();
            }
        }
    }
}
