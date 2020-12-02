public class _0415_Add_Strings {
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int carry = 0;
        while (index1 >= 0 || index2 >= 0) {
            int number1 = 0;
            int number2 = 0;
            if (index1 >= 0) {
                number1 = getInt(num1.charAt(index1));
            }
            if (index2 >= 0) {
                number2 = getInt(num2.charAt(index2));
            }
            int result = (number1 + number2 + carry) % 10;
            carry = (number1 + number2 + carry) / 10;
            stringBuilder.append(result);
            index1--;
            index2--;
        }
        if (carry != 0) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

    private static int getInt(char c) {
        int value;
        switch (c) {
            case '1':
                value = 1;
                break;
            case '2':
                value = 2;
                break;
            case '3':
                value = 3;
                break;
            case '4':
                value = 4;
                break;
            case '5':
                value = 5;
                break;
            case '6':
                value = 6;
                break;
            case '7':
                value = 7;
                break;
            case '8':
                value = 8;
                break;
            case '9':
                value = 9;
                break;
            default:
                value = 0;
        }
        return value;
    }

    public static void main(String[] args) {
        String num1 = "23";
        String num2 = "29";
        System.out.println(addStrings(num1, num2));

        String num3 = "2";
        String num4 = "29";
        System.out.println(addStrings(num3, num4));
    }
}
