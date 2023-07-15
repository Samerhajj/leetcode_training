package Java;

import java.util.Arrays;

public class reverse {
    public static void reverseString(char[] s) {
        int j = 0;
        char d;
        for (int i = s.length - 1; i >= 0; i--) {
            if (j < i) {
                d = s[j];
                s[j] = s[i];
                s[i] = d;
                j++;

            }

        }  System.out.println(s);
    }
    public static void main(String[] args){
       char[] st = new char[]{'h','e','l','l','o'};
        reverseString(st);
    }
}
