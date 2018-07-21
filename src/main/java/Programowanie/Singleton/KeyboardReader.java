package Programowanie.Singleton;

import java.util.Scanner;

public class KeyboardReader {
    private static Scanner scanner = null;

    public static Scanner getInstance() {
        if(scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}