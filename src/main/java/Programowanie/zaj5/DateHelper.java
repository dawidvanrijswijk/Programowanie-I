package Programowanie.zaj5;

import Programowanie.zaj3.InvalidArgumentExeption;

public class DateHelper {

    @Override
    public String toString() {
        return "DateHelper{}";
    }

    public static boolean helper(String length) throws InvalidArgumentExeption {

        int[] tablica = new int[87];
        for (int i = 13; i < 100; i++)
            tablica[i] = i + 1;

        int[] tablica2 = new int[70];
        for (int o = 30; o < 100; o++)
            tablica2[o] = o + 1;



        if (length.length() < 8 || length.substring(4,5).equals(tablica.toString()) || length.substring(6,7).equals(tablica2.toString())){
            return false;
        }else return true;
    }
}
