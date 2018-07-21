package Programowanie.zaj1;

public class BinarySearch {

    //zakładamy że są posortowane nierosnąco
    public static boolean search(int[] T, int x) {
        int begin = 0;                  //0(1)
        int end = T.length - 1;         //0(1)
        // niech T ma n elementów
        while (begin < end) {           //n/2 iteracji => 0(logn)
            int s = ((begin + end) / 2);
            if (T[s] == x) {
                return true;
            }
            if (x < T[s]){
                begin = s + 1;
            }else //gdy x >= T[s]
            {
                end = s - 1;
            }
        }
        return false;
    }
}
