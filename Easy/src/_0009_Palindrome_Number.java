public class _0009_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else {
            int lengthOfInteger = findTheLengthOfInt(x);
            int reverse = 0;
            int newInt = x;
            int pow = lengthOfInteger - 1;
            for (int i = 0 ; i < lengthOfInteger ; i++) {
                int rest = newInt % 10;
                newInt /= 10;
                reverse += (int) (rest * Math.pow(10, pow));
                pow--;
            }
            return x == reverse;
        }
    }

    /**
     * find the length of a integer
     * @param x A integer
     * @return length The length of a integer
     */
    private static int findTheLengthOfInt(int x) {
        final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999,
                9999999, 99999999, 999999999, Integer.MAX_VALUE };
        for (int i = 0 ; ; i++) {
            if (x <= sizeTable[i]) {
                return i + 1;
            }
        }
    }

    public static void main(String[] args) {
        int test1 = 9;
        System.out.println(isPalindrome(test1));

        int test2 = -121;
        System.out.println(isPalindrome(test2));

        int test3 = 10;
        System.out.println(isPalindrome(test3));
    }
}
