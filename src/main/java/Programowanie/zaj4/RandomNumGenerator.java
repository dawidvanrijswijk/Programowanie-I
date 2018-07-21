package Programowanie.zaj4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumGenerator extends Thread {

    private Set<Integer> set;
    private int n;

    public RandomNumGenerator(Set<Integer> set, int n) {
        this.set = set;
        this.n = n;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (set.size() < n) {
            int num = rand.nextInt(20) + 1;
            set.add(num);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        RandomNumGenerator rng = new RandomNumGenerator(set,10);
        rng.start();
        try {
            rng.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(set.toString());
    }
}