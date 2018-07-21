package Programowanie.zaj1;

public class Homework1 {

    //wskazowki do zadania domowego nr 1
    public static void main(String[] args) {
        int n = 10;  //1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
        //1010       5: 101
        //dla n = 7: 1*2^2 + 1*2^1 + 1*2^0 -> 111


        while(n > 0) {
            int bit = n%2;  //dostep do bitu

            n=n/2;   //spowoduje to "odciecie" ostatniego bitu
            //uzupelnic
        }  //to ma zlozonosc log(n)

        //drugi sposob uzyskania reprezentacji binarnej
        String bins = Integer.toBinaryString(10);
        System.out.println(bins);
        char c = bins.charAt(0);   //uzyskanie pierwszego znaku napisu
    }
}
