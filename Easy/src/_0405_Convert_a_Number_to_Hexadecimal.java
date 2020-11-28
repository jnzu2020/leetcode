public class _0405_Convert_a_Number_to_Hexadecimal {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = num; i != 0; i >>>= 4) {
            stringBuilder.append(hex[i & 0xf]);
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int num1 = 26;
        System.out.println(toHex(num1));

        int num2 = -1;
        System.out.println(toHex(num2));
    }
}
