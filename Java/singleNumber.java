package Java;

public class singleNumber {

    public static int singleNumber(int[] nums) {
        int single=nums[0];
        for (int i=1;i<nums.length;i++){
            single^=nums[i];
        }
        return single;
    }


    public static void main(String [] args){


        int[] nums=new int[]{2,2,1,3,3,-3,-3};
        System.out.println(singleNumber(nums));
    }
}
