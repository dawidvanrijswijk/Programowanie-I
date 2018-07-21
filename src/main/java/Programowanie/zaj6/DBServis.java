package Programowanie.zaj6;

public class DBServis {

    private DBConnector dbConnector;

    public DBServis(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public int countWord(String tablename, int rowId, String columnName, String word) {
        //w teście z mockowaniem to chcemy pominąć robiąć atrapę
        String val = dbConnector.getContent(tablename,rowId,columnName);
        String[] words = val.split(" ");
        int result = 0;
        for (String el : words) {
            if(el.equals(word)) {
                result++;
            }
        }
        return result;
    }
}
