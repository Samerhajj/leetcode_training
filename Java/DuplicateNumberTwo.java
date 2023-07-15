package Java;

import java.util.HashMap;

public class DuplicateNumberTwo {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                if(Math.abs(i-hashMap.get(nums[i]))<=k)
                {
                    return true;
                }
            }
            hashMap.put(nums[i],i);
        }
        return false;

    }


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}
