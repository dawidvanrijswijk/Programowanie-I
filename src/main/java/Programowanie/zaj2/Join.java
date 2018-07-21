package Programowanie.zaj2;

import java.util.List;

public class Join {

    public static String join(List<String> words, int wordLengthMin, int wordLengthMax) {

        StringBuilder sb = new StringBuilder();
        words.forEach(word -> {
            if (word.length() >= wordLengthMin && word.length() <= wordLengthMax) {
                sb.append(word).append(" ");
            }
        });
        return sb.toString();
    }
}