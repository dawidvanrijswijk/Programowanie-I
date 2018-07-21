package Programowanie.zaj4;

import java.util.Random;

public class NumbersWriter extends Thread {

    public NumbersWriter(String name){
        super(name);
    }

    @Override
    public void run() {

        final Random rand = new Random();
        int n = 1;
        boolean q = true;

        while (true) {
            if (q) {
                System.out.println(String.format("%s: liczba %d jest nieparzysta", super.getName(), n));
            } else {
                System.out.println(String.format("%s: liczba %d jest parzysta", super.getName(), n));
            }
            n++;
            q =!q;
            try {
                Thread.sleep(1 + rand.nextInt(2)*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
