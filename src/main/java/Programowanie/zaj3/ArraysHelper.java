package Programowanie.zaj3;

import java.util.List;

public class ArraysHelper {

    //final static int version = 1;

    //typy generyczne dotyczą tylko typów obiektowych
    //zwraca ilość wystąpień obiektu obj w liście list
    public static <T> int counter(List<T> list, T obj) {
        int res = 0;
        for (T el : list) {
            if (obj.equals(el)) {
                res++;
            }
        }
        return res;
    }

    public static <T extends Comparable> T min(List<T> list) throws Exception {
        //list.get(0).compareTo();
        if (list == null || list.size() == 0){
            throw new InvalidArgumentExeption("Invalid argument");
        }

        T min = list.get(0); //kandydat na minimum
        for (int i = 1; i < list.size(); i++){
            T el = list.get(i);
            if (el.compareTo(min) < 0){
                min = el;
            }
        }
        return min;
    }
}

