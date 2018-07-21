package Programowanie.zaj4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExamples {

    private static void test1(List<Integer>list){
        long timeBefore = System.currentTimeMillis();
        int res = list.stream().
                reduce((x,y) -> x+y).
                get();
        long timeAfter = System.currentTimeMillis();
        long diff = timeAfter-timeBefore;
        System.out.println(String.format("Wynik test1 = %d   w czasie %d", res, diff));
    }

    public static void test2(List<Integer>list){
        long timeBefore = System.currentTimeMillis();
        int res = list.parallelStream().
                reduce((x,y) -> x+y).
                get();
        long timeAfter = System.currentTimeMillis();
        long diff = timeAfter-timeBefore;
        System.out.println(String.format("Wynik test1 = %d   w czasie %d", res, diff));
    }

    public static void f(String s) {
        System.out.println("-----" + s + "-----");
    }

    //np. [0, -1, 0, 2, -3] -> "2 1 0 2 3"
    private static String concatAbs(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        list.stream().
                forEach(x -> sb.append(Math.abs(x) + " "));

        return sb.toString();
    }

    //[abc,xyz,www]
    private static Map<String, Long> counter(List<String>words){
        return words.stream().collect(Collectors.
                groupingBy(Function.identity(),
                Collectors.counting()));
    }

    private static void demo2(){
        System.out.println(counter(Arrays.asList("abc", "xyz", "abc", "www")));
    }

    public static void demo1() {
        List<Integer>nums = new ArrayList<>();
        final Random ran = new Random();
        final int MAX = 100000;
        for (int i = 1; i <= MAX; i++)
        {
            nums.add(ran.nextInt(1000));
        }
        test1(nums);
        test2(nums);

        List<String> words = Arrays.asList("test1", "materia",
                "wwwwwww", "statek", "traktat");

        //chcemy wypisać pierwsze trzy litery (duże) tych słów,które zawierają "te"
        //wynik ma być posortowany leksykograficznie

        //wzorzec projektowt (design pattern) - fluent interface

        words.
                stream().
                filter(w -> w.contains("te")).
                map(s -> s.substring(0,3)).
                map(el -> el.toUpperCase()).
                sorted().
                forEach(el -> {System.out.println(el);}
                );

        List<Integer> vals2 = Arrays.asList(-2, 30, 15, -8, 16);

        vals2.
                stream().
                filter(w -> w < 0).
                map(x -> -x).
                forEach(System.out::println);

        List<String> list = Arrays.asList("2.3", "1.2", "2.3");

        System.out.println(
                list.stream().
                        map(x -> Double.parseDouble(x)).
                        reduce((x, y) -> x + y).
                        get());


    }
}
