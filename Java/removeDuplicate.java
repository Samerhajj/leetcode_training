package Java;

public class removeDuplicate {
    /**
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int notOccurence = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[notOccurence] = nums[i];
                notOccurence++;
            }
        }
        return notOccurence;

    }


    public static void main(String[] args) {
        int[] numbers = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(numbers, 3));


    }
}
