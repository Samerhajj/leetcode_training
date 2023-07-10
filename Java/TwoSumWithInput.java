package Java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumWithInput {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (hashTable.containsKey(compliment)) {
                return new int[]{hashTable.get(compliment), i+1};
            } else {
                hashTable.put(nums[i], i+1);
            }
        }

        return new int[]{-1};
    }


    public static void main(String[] args) {
        int[] test = {2, 7, 11,15};
        System.out.println(Arrays.toString(twoSum(test, 13)));
    }

}
