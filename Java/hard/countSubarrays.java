package Java.hard;

import java.util.Arrays;

public class countSubarrays {
    public static int countSubarrays(int[] nums, int k) {
    nums= Arrays.stream(nums).sorted().toArray();
    int length = nums.length;
    if(length%2==0)
    {

        return nums[length/2 -1];
    }
        return nums[length/2];


    }
    public static void main(String[] args){

        int[] nums = new int[]{3,2,1,4,5};
        System.out.println(countSubarrays(nums,4));

    }
}
