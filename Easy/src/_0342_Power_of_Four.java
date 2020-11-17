public class _0342_Power_of_Four {
    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        int pow = 0;
        while (Math.pow(4, pow) <= n) {
            if (Math.pow(4, pow) == n) {
                return true;
            }
            pow++;
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 16;
        System.out.println(isPowerOfFour(n1));

        int n2 = 5;
        System.out.println(isPowerOfFour(n2));

        int n3 = 1;
        System.out.println(isPowerOfFour(n3));
    }
}
