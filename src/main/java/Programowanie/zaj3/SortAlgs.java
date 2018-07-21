package Programowanie.zaj3;

public class SortAlgs {
    /*
    insertion sort - sortowanie przez wstawianie
    [2,3,3,1,0,5,4] -> [posortowany niemalejąco ciąg]
         i
     */

    public static void insert(int[]tab){
        int n = tab.length;
        //dla każdego elementu z części nieposortowanej
        for(int i = 1; i < n; i++) {
            //wstawiamy ity element do części posortowanej
            for (int j = i; j > 0; j--){
                if(tab[j-1] > tab[j]) {
                    //zamiana elementów miejscami
                    int temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;

                }
            }
        }
    }
}
