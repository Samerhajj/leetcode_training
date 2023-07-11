package Java;

public class validPalindrome {

    public static boolean isPalindrome(String s) {
        s=s.trim().replaceAll( "[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
       String reverse = sb.reverse().toString();
        if(reverse.equals((s))){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String test = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(test));
    }
}
