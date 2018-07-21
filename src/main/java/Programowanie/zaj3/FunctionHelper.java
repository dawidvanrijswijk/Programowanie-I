package Programowanie.zaj3;

public class FunctionHelper {

    @FunctionalInterface
    public interface FunTemplate {
        public double f(double x); //schemat na postaci funkcji lambda: h->h, x->2*x
    }

    /*   zwraca indeks elementu w vals jesli ten element jest miejscem
    zerowym funkcji f, w.p.w zwraca -1
   zal: vals jest posortowana rosnaco, f jest rosnaca
   np. dla: vals[-2,-1,0,1,2,3], f(x)=x-1   funkcja zero ma zwrocic 3
   stosujemy technike dziel i zwyciezaj
   funkcja zwraca indeks miejsca zerowego
     */
    public static int zero(double []vals, FunTemplate h) {
        //wersja iteracyjna
        int i = 0;
        int j = vals.length-1;
        while(i <= j) {
            int s = (i+j)/2;
            double va = vals[s];
            if(h.f(va) == 0) {
                return s;
            }
            if(va > 0) {
                j = s - 1;
            } else {
                i = s + 1;
            }
        }

        return -1;
    }
}
