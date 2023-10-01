package Java;

public class problem_557{

    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String str: strs){
            str = new StringBuilder(str).reverse().toString();
            result.append(str + " ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
