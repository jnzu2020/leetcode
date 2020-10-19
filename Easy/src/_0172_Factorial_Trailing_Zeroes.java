public class _0172_Factorial_Trailing_Zeroes {
    public static int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 0;
        while (n >= 5) {
            result += (n / 5);
            n /= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 3;
        System.out.println(trailingZeroes(n1));

        int n2 = 5;
        System.out.println(trailingZeroes(n2));

        int n3 = 0;
        System.out.println(trailingZeroes(n3));

        int n4 = 7;
        System.out.println(trailingZeroes(n4));

        int n5 = 13;
        System.out.println(trailingZeroes(n5));

        int n6 = 15;
        System.out.println(trailingZeroes(n6));
    }
}
