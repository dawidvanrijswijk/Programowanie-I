package Programowanie.zaj1;

public class Palindrom {

    public static boolean binaryPalindrom(int number) {
        String binaryString = Integer.toBinaryString(number);

        for (int i = 0; i < binaryString.length() / 2; i++) {
            if (binaryString.charAt(i) != binaryString.charAt(binaryString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}