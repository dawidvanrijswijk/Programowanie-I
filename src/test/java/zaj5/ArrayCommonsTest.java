package zaj5;

import Programowanie.zaj3.InvalidArgumentExeption;
import Programowanie.zaj5.ArrayCommons;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assume.assumeTrue;

public class ArrayCommonsTest {

//
//    public void testRemoveAndReverse() {
//        List<Integer> list = Arrays.asList(2, 3, 1, 2);
//        List<Integer> res = ArrayCommons.removeAndReverse(list,2);
//        assertThat(res).contains(3,1).doesNotContain(2);
//        assertThat((res).get(0).isEqualTo(1);
//        assertThat((res).get(1).isEqualTo(3);
//    }
    @Test
    public void testReplaceCorrectArgs() {
        try {
            Integer[] arr = new Integer[]{2,3,1,0,5};

            ArrayCommons.replace(arr, 2,4,-1);
            assertTrue(arr[2].equals(-1) && arr[2].equals(-1) && arr[4].equals(-1));
            ArrayCommons.replace(new Integer[]{1}, 0,0,-1);
        } catch (InvalidArgumentExeption e) {
            fail();
        }
    }

    @Test(expected = InvalidArgumentExeption.class)
    public void testReplaceIncorrectArgs2() throws InvalidArgumentExeption {
        ArrayCommons.replace(null, -2,4,-1);
    }

    @Test
    public void testReplaceIncerrectArgs() {
        boolean q = false;
        try {
            Integer[] arr = new Integer[]{2,3,1,0,5};
            ArrayCommons.replace(arr,-2,4,-1);
            fail();
        } catch (InvalidArgumentExeption e) {
           q = true;
        }

        assertTrue(q);
    }
    @Test
    public void testReverseSumCorrect() throws InvalidArgumentExeption {

        Double[] result = ArrayCommons.reverseSum(new Double[]{2.0, 1.0, -3.5}, new Double[]{2.0, 1.0, 3.0});
        assertEquals((Double) (-0.5), result[0]);
        assertEquals((Double) (4.0), result[2]);
        assertTrue(result.length == 3);
    }

    @Test
    public void testReverseSumIncorrect() {
        boolean q = true;
        try {
            ArrayCommons.reverseSum(null, null);
            q = false;
        } catch (InvalidArgumentExeption e) {
        }
        assertTrue(q);
    }

    @Test
    public void testListHelper() {

    }
}