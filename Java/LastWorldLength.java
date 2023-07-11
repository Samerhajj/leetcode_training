package Java;

public class LastWorldLength {
    /**
     * Take input as string. return last word length from string
     * @param s
     * @return length of last word length from the string
     */
    public static int lengthOfLastWord(String s) {
        String test = s.trim().replaceAll("\\s+"," ");
        String[] parts =test.split(" ");
        return parts[parts.length-1].length();

    }

    public static void main(String[] args){
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
