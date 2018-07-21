package Programowanie.zaj4;

public class InformatorDemo {

    public static void main(String[] args) {
        final int NUF_OF_THREADS = 20;

        for (int i = 1; i <= NUF_OF_THREADS; i++){
            Informator inf = new Informator(new Long(i), i * 2);

            Thread th = new Thread(inf);
            th.start();

        }
    }
}
