public class _0263_Ugly_Number {
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int num1 = 6;
        System.out.println(isUgly(num1));

        int num2 = 8;
        System.out.println(isUgly(num2));

        int num3 = 14;
        System.out.println(isUgly(num3));
    }
}
