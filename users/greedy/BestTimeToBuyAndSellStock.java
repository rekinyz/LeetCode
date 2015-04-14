package greedy;

import com.leetcode.oj.BestTimeToBuyAndSellStockTest;

public class BestTimeToBuyAndSellStock extends BestTimeToBuyAndSellStockTest {
    @Override
    protected int maxProfit(int[] input) {
        if (input.length < 2) return 0;
        int low = input[0];
        int profit = 0;
        for (int i = 1; i < input.length; ++i) {
            profit = Math.max(profit, input[i] - low);
            low = Math.min(low, input[i]);
        }
        return profit;
    }
}
