
public class Decode {
    public static String decodeString(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c != ']') {
                stack.append(c);
            } else {
                StringBuilder sub_str = new StringBuilder();
                while(stack.charAt(stack.length() - 1) != '[') {
                    sub_str.insert(0, stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                stack.deleteCharAt(stack.length() - 1);

                StringBuilder multiplier = new StringBuilder();
                while(stack.length() > 0 && Character.isDigit(stack.charAt(stack.length() - 1))) {
                    multiplier.insert(0, stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }

                for(int i = 0; i < Integer.parseInt(multiplier.toString()); i++) {
                    stack.append(sub_str);
                }
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        System.out.println( decodeString("3[a2[c]]"));
        //Output: "accaccacc"
        System.out.println( decodeString("3[a]2[bc]"));
        //Output: "aaabcbc"
    }

}
