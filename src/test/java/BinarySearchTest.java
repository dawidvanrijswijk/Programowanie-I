import Programowanie.zaj1.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BinarySearchTest {

    @Test
    public void testSearch(){
        int t[] = {100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};
        boolean q = BinarySearch.search(t, 9);
        assertTrue(q);

        int t2[] = {100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};
        boolean p = BinarySearch.search(t2, 25);
        assertTrue(p);
    }
}
