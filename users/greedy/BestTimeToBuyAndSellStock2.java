package greedy;

import com.leetcode.oj.BestTimeToBuyAndSellStock2Test;

public class BestTimeToBuyAndSellStock2 extends BestTimeToBuyAndSellStock2Test {
    @Override
    protected int maxProfit(int[] a) {
        if (a.length < 2) return 0;
        int sum = 0;
        for (int i = 1; i < a.length; ++i){
            int diff = a[i] - a[i-1];
            if (diff > 0) {
                sum +=diff;
            }
        }
        return sum;
    }
}
