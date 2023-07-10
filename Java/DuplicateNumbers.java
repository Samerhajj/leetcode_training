package Java;

import java.util.HashMap;

public class DuplicateNumbers {
    /**
     *
     * loop through array
     * check if hashmap contains the key value of nums[i]
     * if it contains. return true for duplicate
     * if not add to hashmap and loop again
     * O(n)
     * @param nums
     * @return true if duplicate number
     * @return false if no duplicate number
     */
    public static boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                return true;
            }
            hashMap.put(nums[i],i);
        }
        return false;
    }


    public static void main(String [] args){
        int[] numbers={0,1,2,3,4};
        System.out.println(containsDuplicate(numbers));
    }
}
