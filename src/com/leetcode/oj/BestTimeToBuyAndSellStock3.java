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
		int[] left = new int[len+1];
		int[] right = new int[len+1];
		int minIdx = 0;
		int maxIdx = len-1;
		if(len>1){
			for(int i=1;i<len;i++){
				if(prices[minIdx] > prices[i-1]){
					minIdx = i-1;
				}
				left[i] = Math.max(left[i-1], prices[i-1]-prices[minIdx]);
			}
			
	        for(int i=len-1; i>0; i--){
	        	if(prices[maxIdx] < prices[i-1]){
	        		maxIdx = i-1;
	        	}
	        	right[i] = Math.max(right[i+1], prices[maxIdx]-prices[i-1]);
	        }
			
			for(int i=0;i<len-1;i++){
				profit = Math.max(profit, right[i+1]+left[i]);
			}
		}
        return profit;
    }

}
