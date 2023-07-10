package Java;

public class Digits {

    /**
     * Input: num = 38
     * Output: 2
     * Explanation: The process is
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2
     * Since 2 has only one digit, return it;
     */
    public static int addDigits(int num) {
        int num2=0;
      if(num/10==0){
          return num;
      }
      while(num!=0){

          int modulo = num%10;
          num2+=modulo;
          num/=10;
      }

      return addDigits(num2);
    }

    public static int digitalRoot(int num){
        if(num==0) {
            return 0;
        }
        else{
            /**
             * we use digital root function
             * 1 + ((n-1) mod( b-1 ) where b is base
             * we are working with decimal numbers so base 10
             */
            return 1+((num-1)%9);
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(digitalRoot(39));
    }
}
