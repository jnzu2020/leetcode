public class _0168_Excel_Sheet_Column_Title {
    public static String convertToTitle(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        int quotient = n / 26;
        int rest = n % 26;
        if (rest == 0) {
            rest = 26;
            quotient--;
        }
        result.insert(0, str.charAt(rest - 1));
        while (quotient != 0) {
            rest = quotient % 26;
            quotient = quotient / 26;
            if (rest == 0) {
                rest = 26;
                quotient--;
            }
            result.insert(0, str.charAt(rest - 1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int n1 = 1;
        System.out.println(convertToTitle(n1));

        int n2 = 28;
        System.out.println(convertToTitle(n2));

        int n3 = 701;
        System.out.println(convertToTitle(n3));

        int n4 = 676;
        System.out.println(convertToTitle(n4));

        int n5 = 800;
        System.out.println(convertToTitle(n5));
    }
}
