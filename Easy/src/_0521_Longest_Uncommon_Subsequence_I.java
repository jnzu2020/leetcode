public class _0521_Longest_Uncommon_Subsequence_I {
    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        if (a.length() == b.length()) {
            return a.length();
        } else {
            return Math.max(a.length(), b.length());
        }
    }

    public static void main(String[] args) {
        String a1 = "aba", b1 = "cdc";
        System.out.println(findLUSlength(a1, b1));

        String a2 = "aaa", b2 = "bbb";
        System.out.println(findLUSlength(a2, b2));

        String a3 = "aaa", b3 = "aaa";
        System.out.println(findLUSlength(a3, b3));
    }
}
