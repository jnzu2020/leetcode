public class _0788_Rotated_Digits {
    public static int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (isGood(i)) {
                result++;
            }
        }
        return result;
    }

    private static boolean isGood(int num) {
        boolean good = false;
        while (num > 0) {
            int digit = num % 10;
            switch (digit) {
                case 0:
                case 1:
                case 8:
                    break;
                case 2:
                case 5:
                case 6:
                case 9:
                    good = true;
                    break;
                case 3:
                case 4:
                case 7:
                    return false;
            }
            num /= 10;
        }
        return good;
    }

    public static void main(String[] args) {
        int input = 10;
        System.out.println(rotatedDigits(input));
    }
}
