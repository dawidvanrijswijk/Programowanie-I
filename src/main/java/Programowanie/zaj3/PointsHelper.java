package Programowanie.zaj3;

import Programowanie.zaj2.ColorPoint3d;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PointsHelper
{
    //Napisz klasę PointsHelper. Powinna się w niej jedynie znajdować statyczna metoda o następującym nagłówku:
    //public static boolean uniquePoints(ColorPoint3d []points)
    //metoda powinna zwracać true jeśli w tablicy-argumencie metody wszystkie punkty3d są unikatowe,
    // to znaczy nie istnieją takie dwa punkty w tej tablicy że mają takie same wartości x, y, z oraz wartość koloru.
    // W przeciwnym wypadku, metoda powinna zwrócić false.
    //UWAGA: złożoność algorytmu powinna być O(n) i należy to umieć uzasadnić.
    //Np. Jeśli w tablicy znajdują się punkty o wartościach:
    //Wskazówka i bardzo wskazane rozwiązanie: wykorzystaj odpowiednią kolekcję.

    public static boolean uniquePoints(ColorPoint3d[] points)
    {
        Set<ColorPoint3d> point3dSet = new HashSet<>();
        for (ColorPoint3d cp3d: points)
        {
            if(!point3dSet.contains(cp3d))
                point3dSet.add(cp3d);
            else
                return false;
        }
        return true;
    }

    public static Set<ColorPoint3d> convert(ColorPoint3d[] points)
    {
        Set<ColorPoint3d> colorPoint3dSet = new TreeSet<ColorPoint3d>();
        for(ColorPoint3d colorPoint3d: points)
        {
            colorPoint3dSet.add(colorPoint3d);
        }
        return colorPoint3dSet;
    }
}