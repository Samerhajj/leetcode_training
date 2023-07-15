package Java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int length=nums.length;
        int counter=1;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<length;i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else{
                hashMap.put(nums[i],counter);
            }
        }
       for (Map.Entry<Integer,Integer> entry:hashMap.entrySet())
       {
           if(entry.getValue().equals(Collections.max(hashMap.values()))){
               return entry.getKey();
           }
       }

return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
