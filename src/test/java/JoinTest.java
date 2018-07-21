import Programowanie.zaj2.Join;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JoinTest {

    @Test
    public void testJoin() {
        List<String> list = Arrays.asList("Dog", "theory", "wolf", "computer");
        String result = Join.join(list,4,7);
        assertEquals("theory wolf ", result);
    }
}