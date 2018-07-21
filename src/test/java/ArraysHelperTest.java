import Programowanie.zaj3.ArraysHelper;
import Programowanie.zaj3.InvalidArgumentExeption;
import Programowanie.zaj3.Person;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArraysHelperTest {

//    @Test
//    public void testCounter(){
//        List<Box<Long>> boxes = Arrays.asList(
//                new Box<Long>(1L);
//                new Box<Long>(-7L);
//                new Box<Long>(1L);
//                new Box<Long>(0L);
//        );
//        int result = ArraysHelper.counter(boxes, new Box<Long>(1L));
//        assertEquals(result, 2);

    @Test
    public void testMin(){
        try {
            Person min = ArraysHelper.min(Arrays.asList(
                    new Person(10L, "aaa@aaa.pl"),
                    new Person(8L, "aaa@dffd.pl"),
                    new Person(9L, "aaa@fdf.pl"),
                    new Person(1L, "aaa@fdfdff.pl")
        ));
            assertEquals(1L, min.getId());
        } catch(InvalidArgumentExeption e){
            fail(); //nie zaliczy testu gdy poleci wyjatek
        }
//        try {ArraysHelper.min(null);
//            {
//                fail();
//            }catch (InvalidArgumentExeption)
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

