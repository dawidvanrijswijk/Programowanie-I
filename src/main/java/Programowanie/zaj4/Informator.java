package Programowanie.zaj4;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Informator implements Runnable {

    private Long id;
    private int n; //tyle razy wątek wypisze o sobie informacje
    private final static Logger logger = Logger.getLogger(Informator.class.getName());
    private final Random rand = new Random();

    public Informator(Long id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++)
            logger.log(Level.INFO, String.format("Teraz działa wątek nr %d", id));

        try {
            Thread.sleep(200 + rand.nextInt(501));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
