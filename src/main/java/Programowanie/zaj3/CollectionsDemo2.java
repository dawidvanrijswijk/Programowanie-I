package Programowanie.zaj3;

import Programowanie.zaj2.Vector3D;

import java.util.*;

public class CollectionsDemo2 {

    private static class Pair<T, U>
    {
        protected T val1;
        protected U val2;

        public Pair(T val1, U val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

        public T getVal1() {
            return val1;
        }

        public void setVal1(T val1) {
            this.val1 = val1;
        }

        public U getVal2() {
            return val2;
        }

        public void setVal2(U val2) {
            this.val2 = val2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(val1, pair.val1) &&
                    Objects.equals(val2, pair.val2);
        }

        @Override
        public int hashCode() {

            return Objects.hash(val1, val2);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "val1=" + val1 +
                    ", val2=" + val2 +
                    '}';
        }

        public static void main(String[] args) {

            Pair<Integer, Integer> integerIntegerPair = new Pair<>(2, 4);
            Pair<Double, Double> integerIntegerPair2 = new Pair<>(1.2, 4.5);
            Pair<String, String> integerIntegerPair3 = new Pair<>("Dawid", "Ania");

            Set<Vector3D.Vector3d<Double>> set = new HashSet<>();
            set.add(new Vector3D.Vector3d<>(1.0,2.0,3.0));
            set.add(new Vector3D.Vector3d<>(-1.0,2.0,3.0));
            set.add(new Vector3D.Vector3d<>(1.0,2.0,3.0));
            System.out.println(set.size());

            List<Integer> list2 = new ArrayList<>();
            list2.add(2);
            list2.add(1);
            list2.add(3);
            list2.add(4);
            list2.add(2);
            Collections.sort(list2);
            System.out.println(list2);
            double []nums = {9.2, -10.3, 0.01,9.2};
            Arrays.sort(nums); //sortowanie O(nlog(n))
            System.out.println(Arrays.toString(nums));
        }
    }
}
