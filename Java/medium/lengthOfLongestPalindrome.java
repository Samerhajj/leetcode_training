package Java.medium;

import java.util.Arrays;

public class lengthOfLongestPalindrome {

    public static String longestPalindrome(String s) {
        //Manacher's Algorithm
            if (s == null || s.length() == 0) return "";
            char[] expand = expandString(s);

            int[] arr = new int[expand.length];
            //max is the result maxLenght, resC is the result center used for the final substring;
            //r is the boundry
            int c = 0, mirr = 0, r = 0, max = 0, resC = 0;

            for (int i = 1; i < expand.length - 1; i++) {
                mirr = 2 * c - i;

                if (i < r) arr[i] = Math.min(r - i, arr[mirr]);

                while (expand[i + arr[i] + 1] == expand[i - arr[i] - 1]) arr[i]++;

                if (i + arr[i] > r) {
                    c = i;
                    r = i + arr[i];
                }

                if (arr[i] > max) {
                    max = arr[i];
                    resC = i;
                }
            }

            StringBuilder res = new StringBuilder("");
            for (int i = resC - max; i <= resC + max; i++)
                if (expand[i] != '#' && expand[i] != '$' && expand[i] != '@')
                    res.append(expand[i]);

            return res.toString();
        }


        public static char[] expandString (String s){
            StringBuilder sb = new StringBuilder("@#");
            for (char c : s.toCharArray()) {
                sb.append(c);
                sb.append("#");
            }
            return sb.append("$").toString().toCharArray();
        }


        public static void main (String[]args){
            System.out.println(longestPalindrome("cbbd"));
        }

}
