import java.util.Arrays;

public class _0066_Plus_One {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        boolean carry = false;
        if (digits[digits.length - 1] == 10) {
            digits[digits.length - 1] = 0;
            carry = true;
        }
        int index = digits.length - 2;
        while (carry && (index >= 0)) {
            digits[index] += 1;
            if (digits[index] != 10) {
                carry = false;
            } else {
                digits[index] = 0;
                index--;
            }
        }
        if (carry) {
            int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1)));

        int[] digits2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digits2)));

        int[] digits3 = {0};
        System.out.println(Arrays.toString(plusOne(digits3)));

        int[] digits4 = {1, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits4)));

        int[] digits5 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits5)));

        int[] digits6 = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits6)));
    }
}
