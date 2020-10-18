public class _0171_Excel_Sheet_Column_Number {
    public static int titleToNumber(String s) {
        String title = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result = 0;
        int pow = s.length() - 1;
        for (int i = 0 ; i < s.length() ; i++) {
            int num = title.indexOf(s.charAt(i)) + 1;
            result += (num * Math.pow(26, pow));
            pow--;
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "A";
        System.out.println(titleToNumber(str1));

        String str2 = "AB";
        System.out.println(titleToNumber(str2));

        String str3 = "ZY";
        System.out.println(titleToNumber(str3));

        String str4 = "YZ";
        System.out.println(titleToNumber(str4));

        String str5 = "ADT";
        System.out.println(titleToNumber(str5));
    }
}
