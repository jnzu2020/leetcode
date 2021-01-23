public class _0680_Valid_Palindrome_II {
    public static boolean validPalindrome(String s) {
        for (int i = 0 ; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                String str1 = s.substring(0, i);
                String str2 = s.substring(i + 1);
                String newStr1 = str1 + str2;
                String str3 = s.substring(0, s.length() - 1 - i);
                String str4 = s.substring(s.length() - i);
                String newStr2 = str3 + str4;
                return isPalindrome(newStr1) || isPalindrome(newStr2);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0 ; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aba";
        System.out.println(validPalindrome(s1));

        String s2 = "abca";
        System.out.println(validPalindrome(s2));

        String s3 = "abcaa";
        System.out.println(validPalindrome(s3));

        String s4 = "cbbcc";
        System.out.println(validPalindrome(s4));
    }
}
