package Programowanie.zaj2;

import java.util.Objects;

public class ColorPoint3d implements Comparable<ColorPoint3d>{

    //Napisz klasę ColorPoint3d z polami: trzy współrzędne x, y, z typu Double oraz zmienna odpowiedniego typu,
    // zawierająca informację o kolorze. Kolor może być tylko jedną z trzech wartości: czerwony, zielony, niebieski.
    // Dodaj odpowiedni konstruktor, oraz metody, aby była możliwa realizacja następującego zadania:

    Double x;
    Double y;
    Double z;
    Color color;

    public ColorPoint3d(Double x, Double y, Double z, Color color)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    @Override
    public int compareTo(ColorPoint3d point)
    {
        if(countPoints3dDistance(point)>countPoints3dDistance(this))
        {
            return -1;
        }
        else if(countPoints3dDistance(point)<countPoints3dDistance(this))
        {
            return 1;
        }

        return 0;
    }

    private Double countPoints3dDistance(ColorPoint3d point)
    {
        return countDistance(point.x,point.y,point.z);
    }

    private Double countDistance(Double x, Double y, Double z)
    {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public enum Color
    {
        RED,
        GREEN,
        BLUE
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ColorPoint3d)) return false;
        ColorPoint3d that = (ColorPoint3d) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(z, that.z) &&
                color == that.color;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(x, y, z, color);
    }
}