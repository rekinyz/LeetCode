package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStock2Test {

	BestTimeToBuyAndSellStock2 stock = new BestTimeToBuyAndSellStock2();

	@Test
	public void testMaxProfit1() {
		int[] input = { 3, 2, 2, 6, 5, 0, 3 }; // 7 = 6-2 + 3-0
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit2() {
		int[] input = { 6, 1, 1, 3, 2, 4, 7 }; // 7 = 3-1 + 4-2 + 7-4
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit3() {
		int[] input = { 8, 1, 3, 2, 4, 7, 7 }; // 7 = 2-1 + 4-2 + 7-4
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit4() {
		int[] input = { 8, 9, 7, 6, 4, 1, 1 }; // 1
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
		int[] input = { 3, 3, 5, 0, 0, 3, 1, 4 }; // 8 = 5-3 + 3-0 + 4-1
		assertEquals(8, maxProfit(input));
	}

	@Test
	public void testMaxProfit8() {
		int[] input = { 1, 2, 4 }; // 3 = 4-1
		assertEquals(3, maxProfit(input));
	}

	@Test
	public void testMaxProfit9() {
		int[] input = { 6, 1, 3, 2, 4, 7 }; // 7 = 3-1 + 4-2 + 7-4
		assertEquals(7, maxProfit(input));
	}

	protected int maxProfit(int[] input) {
		return stock.maxProfit(input);
	}
}
