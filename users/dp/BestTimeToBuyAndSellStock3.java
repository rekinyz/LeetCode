package dp;

import org.junit.Test;

import com.leetcode.oj.BestTimeToBuyAndSellStock3Test;
/*
 * https://gist.github.com/soulmachine
 * 这个允许找2次交易
 * 设状态f(i)，表示区间[0, i](0<=  i <= n-1) 的最大利润，状态g(i)，表示区间[i, n-1]的最大利润，
 * 则最终答案为max f=max(f(i) + g(i))
 */
public class BestTimeToBuyAndSellStock3 extends BestTimeToBuyAndSellStock3Test {
    @Override
    protected int maxProfit(int[] a){
        if (a.length < 2) return 0;
        int[] f = new int[a.length];
        int[] g = new int[a.length];
        int valley = a[0];
        for (int i = 1; i < a.length; ++i) {
            valley = Math.min(valley, a[i]);
            f[i] = Math.max(f[i-1], a[i]-valley);
        }
        int peek = a[a.length-1];
        for (int i = a.length-2; i>= 0; --i) {
            peek = Math.max(peek, a[i]);
            g[i] = Math.max(g[i+1], peek-a[i]);
        }
        int max = 0;
        for (int i = 0; i < a.length; ++i) {
            max = Math.max(max, f[i] + g[i]);
        }
        return max;
    }
    
    /*  You may complete at most k transactions.
     *  dp[i, j]
     *    - `i` represents the number of transactions we've done so far. ( 0 <= i <= k )
     *    - `j` represents the number of days so far. ( 0 <= j <= prices.size() )
     *  
     *  So, we have the initialization as below:
     *
     *  dp[0, j] = 0; // 0 <= j <= prices.size() 
     *  dp[i, 0] = 0; // 0 <= i <= k
     *  
     *  And the iteration logic as below:
     *  
     *  dp[i, j] = max ( 
     *               dp[i, j-1], // same times transactions, but one days before.    
     *               dp[i-1, j-1] + p[j]-p[j-1]
     *               dp[i-1, j] )
     *               
     */
    // allow K transaction
    public static int run4(int[] a, int k) {
        int n = a.length;
        if (n<=0) return 0;
        if (k > n/2) {
            int sum = 0;
            for (int i = 1; i < n; ++i) {
                sum += Math.max(a[i] - a[i-1], 0);
            }
            return sum;
        }
        int[][] dp = new int[k+1][n];

        for (int i = 1; i<=k; ++i) {
            for(int j = 1; j <n; ++j) {
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-1] + a[j] - a[j-1]);
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
            }
        }
        return dp[k][n-1];
    }
    @Test
    public void test() {
        
    }
}
