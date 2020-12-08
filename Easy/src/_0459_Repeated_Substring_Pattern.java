public class _0459_Repeated_Substring_Pattern {
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i <= s.length() / 3; i++) {
            String newStr = s + s.substring(0, i);
            String left = newStr.substring(0, newStr.length() / 2);
            String right = newStr.substring(newStr.length() / 2);
            if (left.equals(right))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abab";
        System.out.println(repeatedSubstringPattern(s1));

        String s2 = "aba";
        System.out.println(repeatedSubstringPattern(s2));

        String s3 = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s3));

        String s4 = "abcabcabc";
        System.out.println(repeatedSubstringPattern(s4));
    }
}
