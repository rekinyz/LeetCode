package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

	BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

	@Test
	public void testMaxProfit1() {
		int[] input = { 3, 2, 2, 6, 5, 0, 3 }; // 4 = 6-2
		assertEquals(4, maxProfit(input));
	}

	@Test
	public void testMaxProfit2() {
		int[] input = { 6, 1, 1, 3, 2, 4, 7 }; // 6 = 7-1
		assertEquals(6, maxProfit(input));
	}

	@Test
	public void testMaxProfit3() {
		int[] input = { 8, 1, 3, 2, 4, 7, 7 }; // 6 = 7-1
		assertEquals(6, maxProfit(input));
	}

	@Test
	public void testMaxProfit4() {
		int[] input = { 8, 9, 7, 6, 4, 1, 1 }; // 1 = 9-8
		assertEquals(1, maxProfit(input));
	}

	@Test
	public void testMaxProfit5() {
		int[] input = {}; // 0
		assertEquals(0, maxProfit(input));
	}

	@Test
	public void testMaxProfit6() {
		int[] input = { 1, 2 }; // 1
		assertEquals(1, maxProfit(input));
	}

	@Test
	public void testMaxProfit7() {
		int[] input = { 3, 3, 5, 0, 0, 3, 1, 4 }; // 4 = 4-0
		assertEquals(4, maxProfit(input));
	}

	@Test
	public void testMaxProfit8() {
		int[] input = { 1, 2, 4 }; // 3 = 4-1
		assertEquals(3, maxProfit(input));
	}

	@Test
	public void testMaxProfit9() {
		int[] input = { 6, 1, 3, 2, 4, 7 }; // 6 = 7-1
		assertEquals(6, maxProfit(input));
	}

	protected int maxProfit(int[] input) {
		return stock.maxProfit(input);
	}
}
