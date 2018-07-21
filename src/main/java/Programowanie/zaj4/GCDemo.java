package Programowanie.zaj4;

public class GCDemo {
    private static class Box extends Object {
        private String value;

        public Box(String value) {
            this.value = value;
        }

        @Override
        public void finalize() {
            System.out.println(String.format("Box with value %s is removing by GC", value));
        }
    }

    private static void f() {
        Box box = new Box("box1");
        //box = null;
        //instrukcje
    }

    public static void main(String[] args) {
//        Box box = new Box("box1");
//        box = null;
//
//        System.out.println();
//        System.out.println("Main is working....");

        for (int i = 1; i <= 100000; i++) {
            new Box("s" + i);
        }

    }
}
