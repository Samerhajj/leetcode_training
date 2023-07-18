package Java;


import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                nums.add(i);
            }
        }

        return nums;
    }
    private static boolean isSelfDividing(int number) {
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            if (digit == 0 || originalNumber % digit != 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args){
        List<Integer> nums = selfDividingNumbers(1,22);
        for (int x:nums
             ) {
            System.out.println(x);

        }
    }
}
