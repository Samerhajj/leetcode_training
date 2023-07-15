package Java;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if(n==0)
        {
            return false;
        }
        while(n!=0){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else if (n==1){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
        System.out.println(isUgly(0));
    }
}
