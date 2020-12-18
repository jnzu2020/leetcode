public class _0504_Base_7 {
    public static String convertToBase7(int num) {
        boolean isNegativ = num < 0;
        num = Math.abs(num);
        int rest = num % 7;
        int quotient = num / 7;
        StringBuilder result = new StringBuilder();
        result.append(rest);
        while (quotient != 0) {
            rest = quotient % 7;
            quotient /= 7;
            result.append(rest);
        }
        String str = result.reverse().toString();
        if (isNegativ) {
            str = "-" + str;
        }
        return str;
    }

    public static void main(String[] args) {
        int num1 = 100;
        System.out.println(convertToBase7(num1));

        int num2 = -7;
        System.out.println(convertToBase7(num2));

        int num3 = 0;
        System.out.println(convertToBase7(num3));
    }
}
