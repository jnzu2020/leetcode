import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _0121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
//      1. Solution
//        ArrayList<Integer> profits = new ArrayList<>();
//        for (int i = 0 ; i < prices.length ; i++) {
//            int buyPrice = prices[i];
//            int sellPrice = buyPrice;
//            for (int j = i ; j < prices.length ; j++) {
//                if (sellPrice < prices[j]) {
//                    sellPrice = prices[j];
//                }
//            }
//
//            if (sellPrice > buyPrice) {
//                profits.add(sellPrice - buyPrice);
//            }
//        }
//
//        return profits.size() == 0 ? 0 : Collections.max(profits);
//        2. Solution
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1 ; i < prices.length ; i++) {
            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices1= {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));

        int[] prices2= {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }
}
