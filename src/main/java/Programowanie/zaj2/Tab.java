package Programowanie.zaj2;

public class Tab {

    public static Integer findIndex(Integer[]T) {
        if(T.length==0) return -1;

        for (int i = 0; i < T.length; i++)
        {
            if(T[i].equals(Integer.valueOf(i)))
                return i;
        }
        return -1;
    }
}