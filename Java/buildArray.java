package Java;

import java.util.Arrays;

public class buildArray {
    public static int[] buildArray(int[] nums) {
        int[] newArray=new int[nums.length*2];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=nums[i%nums.length];
        }
        return newArray;
    }

    public static void main(String [] args){
        int[] s = new int[]{1,2,1};
        System.out.println(Arrays.toString(buildArray(s)));

    }
}
