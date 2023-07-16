package Java;

public class sumOfSquares {

    public static int sumOfSquares(int[] nums) {
        int length=nums.length;
        int sum =0;
        for(int i=1;i<=length;i++){
            if(length%i ==0){
                sum+=nums[i-1] * nums[i-1];

            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        System.out.println(sumOfSquares(nums));

    }
}
