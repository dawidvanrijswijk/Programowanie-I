package Programowanie.zaj6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnector {

    public static void main(String[] args) {

        String ss = "abc xyz ww";
        ss.split(" ");
    }

    private final static Logger logger = Logger.getLogger(DBConnector.class.getName());

    public String getContent(String tableName, int rowId, String columnName) {

        logger.log(Level.INFO, "Reading data from table " + tableName);

        //w teście jednostkowym z mockowaniem zamiast uzyskania tej wartości, przygotujemy atrape - jakiś inny tekst
        return "this is the content aaa bbb test wwww 123 hhh"; //symulacja wydobycia danych z bazy

    }
}
