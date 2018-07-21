package Programowanie.zaj3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBasic{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ello");
        Collections.sort(list, (x,y) -> {return -x.compareTo(y); });
        System.out.println(list);
    }
}
