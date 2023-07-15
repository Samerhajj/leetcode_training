package Java;

import java.util.HashMap;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(hashMap.containsKey(i))
            {
                continue;
            }
            else{
               return i;
            }
        }


        return -1;
    }

    public static void main(String[] args){
        int[] nums=new int[]{3,0,1};
        System.out.println(missingNumber(nums));

    }

}
