package Programowanie.zaj4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    private int account = 0;
    public final static Logger logger = Logger.getLogger(Account.class.getName());

    //sekcja krytyczna to fragment w którym dwa wątki mogą "działać" jednocześnie
    public void increment() {
        logger.log(Level.INFO, "thread started changing acount...");

        //opuszczamy semafor
        synchronized (this) {
            int temp = account;
            temp++;
            account = temp;
        }
        //zwolnienie semafora
        logger.log(Level.INFO, "account has been changed");
    }

    public int getAccount() {
        return account;
    }
}
