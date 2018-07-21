package Programowanie.zaj2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCounter {

    private static Map<String, Integer> report (String data){
        int val = 6 ^ 5; //110 xor 101 =011 = 3
        String[]T = data.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : T){
            Integer value = result.get(word); //licznik wystąpień słowa
            if (value ==null){
                result.put(word, 1);
                continue;
            }
            //przypadek gdy słowo już wystąpiło
            //operacja dodana pary ma złożoność 0(1)
            result.put(word, value + 1);
        }
        return result;
    }

    @Override
    public String toString() {
        return "WordsCounter{}";
    }

    public WordsCounter() {
    }

    public static Map<Double,Integer> countNumbers (Double[]T){
        Map<Double, Integer> result = new HashMap<>();
        for (Double number : T){
            if (!result.containsKey(number)) {
                result.put(number, 1);
            }
                else {
                    result.put(number,result.get(number) + 1);
                }
            }
        return result;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Map<String, Integer> result = report(line);
        System.out.println(result);
    }
}
