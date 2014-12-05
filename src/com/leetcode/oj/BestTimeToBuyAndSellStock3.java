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
	
	//TODO not solved
	public int maxProfit(int[] prices) {
		int len = prices.length;
		int profit = 0;
		if(len>1){
			for(int breakIdx=1; breakIdx<len-1; breakIdx++){
				int profit1 = 0;
				int profit2 = 0;
				int minIdx = 0;
				for(int i=0;i<breakIdx;i++){
					if(prices[minIdx] > prices[i]){
						minIdx = i;
					}
					profit1 = Math.max(profit1, prices[i]-prices[minIdx]);
				}
				minIdx = breakIdx;
		        for(int i=minIdx; i<len; i++){
		        	if(prices[minIdx] > prices[i]){
		        		minIdx = i;
		        	}
		        	profit2 = Math.max(profit2, prices[i]-prices[minIdx]);
		        }
		        profit = Math.max(profit, profit1+profit2);
			}
			
			int minIdx = 0;
			for(int i=0;i<len;i++){
				if(prices[minIdx] > prices[i]){
					minIdx = i;
				}
				profit = Math.max(profit, prices[i]-prices[minIdx]);
			}
		}
        return profit;
    }

}
