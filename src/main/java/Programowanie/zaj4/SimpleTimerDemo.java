package Programowanie.zaj4;

public class SimpleTimerDemo {

    public static void main(String[] args) {
        SimpleTimer simpleTimer = new SimpleTimer("timer1");
        simpleTimer.start();

        try {
            simpleTimer.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello kitty");
    }
}
