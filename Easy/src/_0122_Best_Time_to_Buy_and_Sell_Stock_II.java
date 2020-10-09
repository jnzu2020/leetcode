public class _0122_Best_Time_to_Buy_and_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for (int i = 1 ; i < prices.length ; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));

        int[] prices2 = {1,2,3,4,5};
        System.out.println(maxProfit(prices2));

        int[] prices3 = {3,7,9,1,3,4,6,8};
        System.out.println(maxProfit(prices3));

        int[] prices4 = {3,7,9,1,3,6,4,6};
        System.out.println(maxProfit(prices4));

        int[] prices5 = {3,7,9,1,3,6,4,2};
        System.out.println(maxProfit(prices5));

        int[] prices6 = {7,6,4,3,1};
        System.out.println(maxProfit(prices6));
    }
}
