public class _0392_Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int indexOfS = 0;
        int indexOfT = 0;
        while (indexOfS < s.length() && indexOfT < t.length()) {
            if (s.charAt(indexOfS) == t.charAt(indexOfT)) {
                indexOfS++;
            }
            indexOfT++;
        }
        return indexOfS == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        System.out.println(isSubsequence(s1, t1));

        String s2 = "axc", t2 = "ahbgdc";
        System.out.println(isSubsequence(s2, t2));
    }
}
