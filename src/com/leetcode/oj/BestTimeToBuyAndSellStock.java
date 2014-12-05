package com.leetcode.oj;


/**
 * Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the i-th element is the price of a given stock on day i.
 * If you were <b>only permitted to complete at most one transaction</b> (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 * 
 * @author rekinyz
 */

public class BestTimeToBuyAndSellStock {
	
	public int maxProfit(int[] prices) {
		int len = prices.length;
		int profit = 0;
		if(len!=0){
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
