public class _0231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 2 == 1) {
            return false;
        }

        while (n != 2) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 1;
        System.out.println(isPowerOfTwo(n1));

        int n2 = 16;
        System.out.println(isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println(isPowerOfTwo(n3));

        int n4 = 4;
        System.out.println(isPowerOfTwo(n4));

        int n5 = 5;
        System.out.println(isPowerOfTwo(n5));
    }
}
