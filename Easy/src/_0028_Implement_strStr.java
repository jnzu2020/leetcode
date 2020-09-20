public class _0028_Implement_strStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        } else {
            return haystack.indexOf(needle);
        }
    }

    public static void main(String[] args) {
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println(strStr(haystack1, needle1));

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println(strStr(haystack2, needle2));
    }
}
