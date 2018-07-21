package Programowanie.zaj6;

public class StringCommons {
    /*
    abcdef
    012345

    abc
    012

    ab
    01
     */
    public static String changePairs(String test1) {
        StringBuilder sb = new StringBuilder();
        int size = test1.length();

        for (int i = 0; i <= size - 2; i += 2) {
            sb.append(test1.charAt(i + 1)).append(test1.charAt(i));
        }

        if (size % 2 == 1) {
            sb.append(test1.charAt(size - 1));
        }
        return sb.toString();
    }

    public static boolean isPalindrom(String test1){
        int i = 0;
        int j = test1.length() - 1;
        while(i < j){
            if (test1.charAt(i) != test1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}