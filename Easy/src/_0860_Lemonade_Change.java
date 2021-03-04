public class _0860_Lemonade_Change {
    public static boolean lemonadeChange(int[] bills) {
        int billOfFive = 0;
        int billOfTen = 0;
        for (int bill : bills) {
            if (bill == 5) {
                billOfFive++;
            } else if (bill == 10) {
                if (billOfFive == 0) {
                    return false;
                } else {
                    billOfFive--;
                    billOfTen++;
                }
            } else {
                if (billOfFive != 0 && billOfTen != 0) {
                    billOfFive--;
                    billOfTen--;
                } else if (billOfFive >= 3) {
                    billOfFive -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills1));

        int[] bills2 = {5, 5, 10};
        System.out.println(lemonadeChange(bills2));

        int[] bills3 = {10, 10};
        System.out.println(lemonadeChange(bills3));

        int[] bills4 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills4));
    }
}
