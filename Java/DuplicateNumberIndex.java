package Java;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateNumberIndex {

    /**
     *
     * loop through array
     * check if hashmap contains the key value of nums[i]
     * if it contains. return true for duplicate
     * if not add to hashmap and loop again
     * O(n)
     * @param nums
     * @return index of duplicate numbers
     * @return -1 if no duplicate number
     */
    public static int[] containsDuplicate(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{-1};
    }


    public static void main(String [] args){
        int[] numbers={0,1,2,3,0};
        System.out.println(Arrays.toString(containsDuplicate(numbers)));
    }
}
