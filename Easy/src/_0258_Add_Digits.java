public class _0258_Add_Digits {
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (num >= 10) {
            String strOfInt = num + "";
            String[] strArr = strOfInt.split("");
            int sum = 0;
            for (String s : strArr) {
                sum += Integer.parseInt(s);
            }
            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
