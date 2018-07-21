package Programowanie.zaj6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringArrayCommons {
    public static String arrayString(String[] words) {
        Set<String> set = new TreeSet<>();
        for (String el : words) {
            set.add(el);
        }

        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append("_");
        }
        if (sb.length() >= 1) {
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return sb.toString();
    }
}