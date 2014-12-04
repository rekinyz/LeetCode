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
		int profit1 = 0;
		int profit2 = 0;
		if(len>1){
			int minIdx = 0;
			for(int i=0;i<len;i++){
				if(prices[minIdx] > prices[i]){
					minIdx = i;
				}
				profit1 = Math.max(profit1, prices[i]-prices[minIdx]);
			}
			
			int diff = 0;
			minIdx = 0;
			for(int i=0;i<len;i++){
				if(diff<=0 && i<len-1){
					diff = prices[i+1]-prices[i];
					if(diff>0){
						minIdx=i+1;
						i+=2;
						if(i>=len){
							break;
						}
					}
				}
				if(minIdx!=0){
					if(prices[minIdx] > prices[i]){
						minIdx = i;
					}
					profit2 = Math.max(profit2, prices[i]-prices[minIdx]);
				}
			}
			profit2 +=diff;
		}
        return Math.max(profit1, profit2);
    }

}
