package Programowanie.zaj4;

import java.util.ArrayList;
import java.util.List;

public class NumbersWriterDemo {

    public static void main(String[]args){
        List<NumbersWriter> threads = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            threads.add(new NumbersWriter("Wątek" + i));
        }

        System.out.println("Main thread is working now...");
        for(NumbersWriter nw : threads){
            nw.start();
        }
    }
}
