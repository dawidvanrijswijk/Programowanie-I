package Programowanie.zaj4;

public class SimpleClock implements Runnable {

    @Override
    public void run() {
        int seconds = 1;
        int minutes = 0;

        while(true) {
            if (seconds % 60 == 0) {
                minutes++;
                System.out.println(minutes + " min");
                seconds = 1;
            } else {
                System.out.println(seconds + " sec");
                seconds++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
