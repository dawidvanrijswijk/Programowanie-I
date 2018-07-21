import Programowanie.zaj3.SortAlgs;
import org.junit.Test;

import java.util.Arrays;

public class SortAlgsTest {

    @Test
    public void testInsert() {
        int []tab = {3,2,2,1,0,4,3,0};
        SortAlgs.insert(tab);
        System.out.println(Arrays.toString(tab));
        int []tab2 = {3,2,2,1,0,4,3,0};
        SortAlgs.insert(tab2);
        System.out.println(Arrays.toString(tab2));
    }
}
