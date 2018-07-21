import Programowanie.zaj1.BinaryGap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    @Test
    public void testSolution(){
        assertEquals(0,BinaryGap.solution(32));
        assertEquals(5,BinaryGap.solution(1042));
        assertEquals(1,BinaryGap.solution(10));
    }
}