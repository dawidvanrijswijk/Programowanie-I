package zaj5;

import Programowanie.zaj3.StringHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertJDemo {

    @Test
    public void test() {
        String result = StringHelper.reverse("test");
        assertTrue(result.equals("tset"));
        String sss = "tset";
        assertEquals(sss, result);

        //można zrobić to bardziej czytelnie i z większymi możliwościami
        assertThat(result).isEqualTo("tset");

        List<String> list = Arrays.asList("abc", "www", "hhh", "test1", "zzz");
        assertTrue(list.contains("www") && list.contains("abc") && list.contains("test1"));

        //odpowiednik używając AssertJ
        assertThat(list).contains("www", "abc", "test1", "zzz");

        String str = "123abcjviodfjviWWWW";
        assertThat(str).startsWith("123").endsWith("WWWW").containsIgnoringCase("JVI");
    }
}
