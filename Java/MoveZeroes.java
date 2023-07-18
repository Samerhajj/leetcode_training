package Java;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if(nums.length==1){
            System.out.println(nums[0]);
        }
        int index=0;
        int zeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            else{
                zeroes++;
            }

        }
        for(int i=nums.length-zeroes;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args){
        int[] nums=new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }

    }
