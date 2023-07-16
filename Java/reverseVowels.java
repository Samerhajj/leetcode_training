package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class reverseVowels {

    public static String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!set.contains(arr[left])) {
                left++;
            } else if (!set.contains(arr[right])) {
                right--;
            } else {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args){
        System.out.println(reverseVowels("aA"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("a."));
    }
}
