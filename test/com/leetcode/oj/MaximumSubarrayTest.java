package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {

	MaximumSubarray ps = new MaximumSubarray();

	@Test
	public void testMaxSubArray0() {
		int[] num = { 2, 3, -2, 4 };
		assertEquals(maxSubArray(num), 7); // 2, 3, -2, 4
	}

	@Test
	public void testMaxSubArray1() {
		int[] num = { 2, 0 };
		assertEquals(maxSubArray(num), 2);
	}

	@Test
	public void testMaxSubArray2() {
		int[] num = { -2 };
		assertEquals(maxSubArray(num), -2);
	}

	@Test
	public void testMaxSubArray3() {
		int[] num = { -2, 3, -4 };
		assertEquals(maxSubArray(num), 3);
	}

	@Test
	public void testMaxSubArray4() {
		int[] num = { 2, -5, -2, -4, 3 };
		assertEquals(maxSubArray(num), 3);
	}

	@Test
	public void testMaxSubArray5() {
		int[] num = { 3, -1, 4 };
		assertEquals(maxSubArray(num), 6); // 3, -1, 4
	}

	@Test
	public void testMaxSubArray6() {
		int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		assertEquals(maxSubArray(num), 6); // 4, −1, 2, 1
	}

	@Test
	public void testMaxSubArray7() {
		int[] num = { -2, 0, -1 };
		assertEquals(maxSubArray(num), 0);
	}

	@Test
	public void testMaxSubArray8() {
		int[] num = { -5, 0, 2 };
		assertEquals(maxSubArray(num), 2); // 0, 2
	}

	@Test
	public void testMaxSubArray9() {
		int[] num = { 6, 3, -10, 0, 2 };
		assertEquals(maxSubArray(num), 9); // 6,3
	}

	@Test
	public void testMaxSubArray10() {
		int[] num = { -1, 2, 2, -3 };
		assertEquals(maxSubArray(num), 4);
	}

	@Test
	public void testMaxSubArray11() {
		int[] num = { -3, 0, 1, -2 };
		assertEquals(maxSubArray(num), 1);
	}

	@Test
	public void testMaxSubArray12() {
		int[] num = { -1, -2, -3 };
		assertEquals(maxSubArray(num), -1);
	}

	private int maxSubArray(int[] array) {
		return ps.maxSubArray(array);
	}
}
