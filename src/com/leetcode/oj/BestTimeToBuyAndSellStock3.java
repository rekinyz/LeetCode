package com.leetcode.oj;



/**
 * Best Time to Buy and Sell Stock III
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. <b>You may complete at most two transactions.</b>
 * 
 * Note: You may not engage in multiple transactions at the same time 
 * (ie, you must sell the stock before you buy again).
 * 
 * @author rekinyz
 */

public class BestTimeToBuyAndSellStock3 {
	
	//O(N) + Space(N)
	public int maxProfit(int[] prices) {
		int len = prices.length;
		int profit = 0;
		int[] left = new int[len];
		int[] right = new int[len];
		int minIdx = 0;
		int maxIdx = len-1;
		if(len>1){
			for(int i=1,j=len-1;i<len;i++,j--){
				if(prices[minIdx] > prices[i-1]) minIdx = i-1;
				if(prices[maxIdx] < prices[j-1]) maxIdx = j-1;
				left[i] = Math.max(left[i-1], prices[i-1]-prices[minIdx]);
				right[j] = Math.max(right[j-1], prices[maxIdx]-prices[j-1]);
			}
			for(int i=0;i<len-1;i++){
				profit = Math.max(profit, right[i+1]+left[i]);
			}
		}
        return profit;
    }

}
