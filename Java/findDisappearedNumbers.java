package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissapearedNumbers = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                continue;
            }
            hashMap.put(nums[i],i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hashMap.containsKey(i)){
                dissapearedNumbers.add(i);
            }
        }
        return dissapearedNumbers;

    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
