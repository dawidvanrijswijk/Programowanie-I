package Programowanie.zaj1;

import java.util.Random;

public class IntroduceTask {

    private static int fibRek(int n) {
        if(n <=2) {
            return 1;
        }

        return fibRek(n-1) + fibRek(n-2);
    }

    private static boolean findValue(int []T, int val) {
        for(int x : T) {
            if(x == val) {
                return true;
            }
        }
        return false;
    }

    private static void f(int T[][]) {
        for(int i = 0; i < T.length; i++) {
            for(int j = 0; j < i; j++) {
                int v = T[i][j];
                T[i][j] = T[j][i];
                T[j][i] = v;
            }
        }
    }

    public static boolean isPath(String path) {
        int countx = 0;
        int county = 0;
        for(char c : path.toCharArray()) {
            switch(c) {
                case 'L':
                    countx--;
                    break;
                case 'P':
                    countx++;
                    break;
                case 'G':
                    county--;
                    break;
                case 'D':
                    county++;
                    break;
            }
        }

        return countx == 0 && county == 0;
    }

    public static void main(String[] args) {
        final int n = 100;
        int []T = new int[n];

        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            T[i] = rand.nextInt(200) + 1;
        }

        // boolean result = findValue(T, 99);

        int T2[][] = {{1,2,3},
                {4,5,6},
                {7,8,9} };

        f(T2);

        //wyswietlenie T2
        for(int i = 0; i < T2.length; i++) {
            for(int j = 0; j < T2[i].length; j++) {
                System.out.print(T2[i][j]+ " ");
            }
            System.out.println();
        }

        long timeBefore = System.currentTimeMillis();
        fibRek(30);
        long timeAfter = System.currentTimeMillis();
        long diff = timeAfter - timeBefore;
        System.out.println(diff);

    }
}
