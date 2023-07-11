package Java;

public class climbStairs {

    public static int climbStairs(int n) {
      if(n==1){
          return 1;
      }
      int first_step=1;
      int second_step=2;
      for(int i=3;i<=n;i++){
          int third=first_step+second_step;
          first_step=second_step;
          second_step=third;
      }
      return second_step;
    }
    public static void main(String[] args){
        System.out.println(climbStairs(5));
}

}
