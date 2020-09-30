package uber;

import com.leetcode.oj.BestTimeToBuyAndSellStockTest;
/*
 * page 190 12.3
 */
public class BestTimeToBuyAndSellStock extends BestTimeToBuyAndSellStockTest{

    @Override
    protected int maxProfit(int[] input) {
        if (input.length == 0) return 0;
        int profit = 0;
        int min = input[0];
        for (int i = 1; i < input.length; ++i){
            profit = Math.max(profit, input[i] - min);
            min = Math.min(min, input[i]);
        }
        return profit;
    }
}
