package Programowanie.zaj4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    private static int countEmails(String text) {
        final String regExp = "[a-z]+@[a-z]+([.][a-z]=)*";
        Pattern p = Pattern.compile(regExp);
        Matcher matcher = p.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String []parts = "abc#xyz_wwwwww#\n1223".split("[#_]");

        System.out.println(Arrays.toString(parts));

        String text = "vfuvhdf       \nkasia@firma.pl cdc test@abc.aaa.pl";
        System.out.println(countEmails(text));
    }
}
