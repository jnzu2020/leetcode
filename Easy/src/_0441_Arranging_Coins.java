public class _0441_Arranging_Coins {
    public static int arrangeCoins(int n) {
        long sum = 0;
        int i = 1;
        while (sum < n) {
            sum += (i++);
        }
        if (sum == n) {
            return i - 1;
        } else {
            return i - 2;
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(arrangeCoins(n1));

        int n2 = 8;
        System.out.println(arrangeCoins(n2));

        int n3 = 10;
        System.out.println(arrangeCoins(n3));

        int n4 = 2147483647;
        System.out.println(arrangeCoins(n4));
    }
}
