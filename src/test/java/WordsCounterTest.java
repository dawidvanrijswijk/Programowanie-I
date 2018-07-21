import Programowanie.zaj2.WordsCounter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordsCounterTest {

    @Test
    public void testWordsCounter(){
        Double T[] = {-0.01, 2.3, -0.01, 7.8, 2.3, 2.3};
        Map<Double, Integer> q = new HashMap<>();
        q.put(-0.01,2);
        q.put(2.3,3);
        q.put(7.8,1);
        assertEquals(q,WordsCounter.countNumbers(T));
    }
}

