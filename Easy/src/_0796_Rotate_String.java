public class _0796_Rotate_String {
    public static boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else {
            String newA = A + A;
            return newA.contains(B);
        }
    }

    public static void main(String[] args) {
        String A1 = "abcde", B1 = "cdeab";
        System.out.println(rotateString(A1, B1));

        String A2 = "abcde", B2 = "abced";
        System.out.println(rotateString(A2, B2));
    }
}
