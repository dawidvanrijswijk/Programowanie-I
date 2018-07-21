package zaj5;

import Programowanie.zaj6.NumbersCommos;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumbersCommonsTest {

    @Test
    public void testMinPositive() {
        Double[] numbers1 = new Double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        assertThat(NumbersCommos.minPositive(Arrays.asList(numbers1))).isEqualTo(1.0);

        Double[] numbers2 = new Double[]{0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        assertThat(NumbersCommos.minPositive(Arrays.asList(numbers2))).isEqualTo(1.0);

        Double[] numbers3 = new Double[]{-1.0,0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
        assertThat(NumbersCommos.minPositive(Arrays.asList(numbers3))).isEqualTo(1.0);

        Double[] numbers4 = new Double[]{};
        assertThat(NumbersCommos.minPositive(Arrays.asList(numbers4))).isEqualTo(null);
    }
}
