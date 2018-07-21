package Programowanie.zaj2;

import java.util.*;

public class CollectionsDemo {

    private static class Box{
        private String name;
        private Integer val;

        public Box(String name, Integer val) {
            this.name = name;
            this.val = val;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return Objects.equals(name, box.name) &&
                    Objects.equals(val, box.val);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, val);
        }
    }


    private static String print(List<?> list){
        StringBuilder result = new StringBuilder();

        list.forEach(x -> result.append(x));

        return result.toString();
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        //String w = words.get(1);
        /* i: 0   1 2 3 .... 9
            s1 s2       s10*/
        words.add("s1");
        words.add("s11");
        System.out.println(print(words));

        List<Double> numbers = new LinkedList<>();
        numbers.add(23.1);
        numbers.add(99.0);
        //Double = numbers.get(1);
        // (prec, 23.1, next) <-> (prev, 99.0, next) -> null
        System.out.println(print(words));

        /*
        Arraylisty używamy gdy jest dużo wywołań metody get(i)
        LinkedListy używamy gdy dominuje usówanie elementów
         */

        HashSet<String> wordSet = new HashSet<>();
        wordSet.add(new String("abd"));
        wordSet.add(new String("abd"));
        System.out.println(wordSet.size());

        Set<Box> set = new HashSet<>();
        set.add(new Box("box1", 10));
        set.add(new Box("box1", 10));
        System.out.println(set.size());

        //słownik (mapa, dictionary)
        Map<String, Integer> map = new HashMap<>();
        map.put("Kasia", 2);
        map.put("Ola", 3);
        //w czasie 0(1) mamy dostęp do wartości pary o zadanym kluczu
        System.out.println(map.get("Ola"));
        System.out.println(map);


    }
    }
