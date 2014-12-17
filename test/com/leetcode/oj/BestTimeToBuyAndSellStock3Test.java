package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestTimeToBuyAndSellStock3Test {

	BestTimeToBuyAndSellStock3 stock = new BestTimeToBuyAndSellStock3();

	@Test
	public void testMaxProfit1() {
		int[] input = { 3, 2, 2, 6, 5, 0, 3 }; // 7 = 6-2 + 3-0
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit2() {
		int[] input = { 6, 1, 1, 3, 2, 4, 7 }; // 7 = 7-2 + 3-1
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit3() {
		int[] input = { 8, 1, 3, 2, 4, 7, 7 }; // 7 = 3-1 + 7-2
		assertEquals(7, maxProfit(input));
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
		int[] input = { 3, 3, 5, 0, 0, 3, 1, 4 }; // 6 = 4-0 + 5-3
		assertEquals(6, maxProfit(input));
	}

	@Test
	public void testMaxProfit8() {
		int[] input = { 1, 2, 4 }; // 3 = 4-1
		assertEquals(3, maxProfit(input));
	}

	@Test
	public void testMaxProfit9() {
		int[] input = { 6, 1, 3, 2, 4, 7 }; // 7 = 3-1 + 7-2
		assertEquals(7, maxProfit(input));
	}

	@Test
	public void testMaxProfit10() {
		int[] input = { 1 }; // 0
		assertEquals(0, maxProfit(input));
	}

	@Test
	public void testMaxProfit11() {
		int[] input = { 2, 1 }; // 0
		assertEquals(0, maxProfit(input));
	}

	@Test
	public void testMaxProfit12() {
		int[] input = { 2, 1, 4, 5, 2, 9, 7 }; // 11 = 5-1 + 9-2
		assertEquals(11, maxProfit(input));
	}

	@Test
	public void testMaxProfit13() {
		int[] input = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 }; // 13 = 7-1 + 9-2
		assertEquals(13, maxProfit(input));
	}
	
	private int maxProfit(int[] input){
		return stock.maxProfit(input);
	}
}
