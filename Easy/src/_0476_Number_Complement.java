public class _0476_Number_Complement {
    public static int findComplement(int num) {
        String strOfNum = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < strOfNum.length() ; i++) {
            if (strOfNum.charAt(i) == '0') {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(findComplement(num1));

        int num2 = 1;
        System.out.println(findComplement(num2));
    }
}
