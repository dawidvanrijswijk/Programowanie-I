package Programowanie.zaj3;

public class Fibonacci {

    public static int fib(int N) {
        if (N <= 2) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static int fib2(int N) {
        int f1 = 1;
        int f2 = 1;
        int i = 3;

        while (i<=N){
            int x = f2;
            f2 = f1 + f2;
            f1 = x;
            i++;
        }
        return f2;
    }
}