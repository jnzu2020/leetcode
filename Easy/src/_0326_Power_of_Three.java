public class _0326_Power_of_Three {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        int pow = 0;
        while (Math.pow(3, pow) <= n) {
            if (Math.pow(3, pow) == n) {
                return true;
            }
            pow++;
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 27;
        System.out.println(isPowerOfThree(n1));

        int n2 = 0;
        System.out.println(isPowerOfThree(n2));

        int n3 = 9;
        System.out.println(isPowerOfThree(n3));

        int n4 = 45;
        System.out.println(isPowerOfThree(n4));
    }
}
