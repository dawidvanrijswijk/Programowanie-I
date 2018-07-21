package Programowanie.zaj4;

public class SimpleClockDemo {

    public static void main(String[] args) {

        SimpleClock simpleClock = new SimpleClock();
        new Thread(simpleClock).start();
    }
}
