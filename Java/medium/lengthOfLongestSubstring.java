package Java.medium;

import java.util.HashMap;

public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] array = s.toCharArray();
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(array[i])) {
                start = Math.max(hashMap.get(array[i]) + 1, start);
            }
            hashMap.put(array[i], i);
            maxLen = Math.max(i - start + 1, maxLen);
        }
            return maxLen;
        }

public static void main(String[] args){

        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
