public class _0125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        String reg = "[^0-9a-zA-Z]";
        s = s.replaceAll(reg, "");
        for (int i = 0 , j = s.length() - 1 ; i < s.length() / 2 ; i++ , j--) {
            String temp1 = s.charAt(i) + "";
            String temp2 = s.charAt(j) + "";
            if (!temp1.equalsIgnoreCase(temp2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = "0P";
        System.out.println(isPalindrome(s3));
    }
}
