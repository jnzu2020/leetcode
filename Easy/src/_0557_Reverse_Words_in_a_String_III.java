public class _0557_Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            stringBuilder.append(temp.reverse()).append(" ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
