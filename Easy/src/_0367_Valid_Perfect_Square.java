public class _0367_Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        if (num == 1) {
            return true;
        }

        long left = 1;
        long right = num;
        while (left <= right) {
            long middle = left + (long)Math.floor((right - left) / 2.0);
            if (middle * middle == num) {
                return true;
            } else if (middle * middle < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num1 = 16;
        System.out.println(isPerfectSquare(num1));

        int num2 = 14;
        System.out.println(isPerfectSquare(num2));

        int num3 = 808201;
        System.out.println(isPerfectSquare(num3));
    }
}
