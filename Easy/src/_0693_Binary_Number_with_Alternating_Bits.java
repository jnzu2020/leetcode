public class _0693_Binary_Number_with_Alternating_Bits {
    public static boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        for (int i = 0 ; i < str.length() - 1 ; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(hasAlternatingBits(n1));

        int n2 = 7;
        System.out.println(hasAlternatingBits(n2));

        int n3 = 11;
        System.out.println(hasAlternatingBits(n3));

        int n4 = 10;
        System.out.println(hasAlternatingBits(n4));

        int n5 = 3;
        System.out.println(hasAlternatingBits(n5));
    }
}
