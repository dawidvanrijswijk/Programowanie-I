package zaj5;

import Programowanie.zaj6.StringCommons;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCommonsTest {

    @Test
    public void testPalindrom() {
        String test1 = "kajak";
        assertThat(StringCommons.isPalindrom(test1)).isTrue();

        String test2 = "ww";
        assertThat(StringCommons.isPalindrom(test2)).isTrue();

        String test3 = "abcd";
        assertThat(StringCommons.isPalindrom(test3)).isFalse();
    }

    @Test
    public void testChangePairs() {
        String test1 = "abcde";
        assertThat(StringCommons.changePairs(test1)).isEqualTo("badce");

        String test2 = "abcdef";
        assertThat(StringCommons.changePairs(test2)).isEqualTo("badcfe");

        String test3 = " ";
        assertThat(StringCommons.changePairs(test3)).isEqualTo(" ");

        String test4 = "a";
        assertThat(StringCommons.changePairs(test4)).isEqualTo("a");

        String test5 = "be";
        assertThat(StringCommons.changePairs(test5)).isEqualTo("eb");

    }
}