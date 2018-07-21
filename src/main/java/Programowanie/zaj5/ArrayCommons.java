package Programowanie.zaj5;

import Programowanie.zaj3.InvalidArgumentExeption;

public class ArrayCommons {


    /*
    [2,3,1,9,0], begin = 2, end = 4, obj = -1 (wartość którą podstawiamy) -> [2,3,-1,-1,-1]
     */
    public static <T> void replace(T[] arr, int begin, int end, T obj)
            throws InvalidArgumentExeption {
        if (arr == null || begin < 0 || end > arr.length - 1 || begin > arr.length - 1) {
            throw new InvalidArgumentExeption("invalid argument");
        }

        for (int i = begin; i <= end; i++) {
            arr[i] = obj;
        }
    }

    public static Double[] reverseSum(Double[] first, Double[] second) throws InvalidArgumentExeption {
        if (first == null || second == null) {
            throw new InvalidArgumentExeption("null array list");
        }

        if (first.length != second.length) {
            throw new InvalidArgumentExeption("arrays are not the same size");
        }

        int n = first.length;
        Double[] result = new Double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[n - 1 - i] = first[i] + second[i];
        }
        return result;
    }
}