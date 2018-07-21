package zaj5;

import Programowanie.zaj6.StringArrayCommons;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringArrayCommonsTest {

    @Test
    public void testArrayString() {
        String[] words1 = new String[]{"aaaa", "test", "abc", "test"};
        assertThat(StringArrayCommons.arrayString(words1)).isEqualTo("aaaa_abc_test");

        String[] words2 = new String[]{"aaaa", "test", "abc", "test"};
        assertThat(StringArrayCommons.arrayString(words1)).isEqualTo("aaaa_abc_test");

        String[] words3 = new String[]{"aaaa", "test", "abc", "test"};
        assertThat(StringArrayCommons.arrayString(words1)).isEqualTo("aaaa_abc_test");

        String[] words4 = new String[]{"aaaa", "test", "abc", "test"};
        assertThat(StringArrayCommons.arrayString(words1)).isEqualTo("aaaa_abc_test");
    }
}