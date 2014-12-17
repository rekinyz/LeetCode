package com.leetcode.oj;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {

	TwoSum ts = new TwoSum();

	@Test
	public void testTwoSum0() {
		int[] input = { 2, 7, 11, 15 };
		int[] output = { 1, 2 };
		assertArrayEquals(output, twoSum(input, 9));
	}

	@Test
	public void testTwoSum1() {
		int[] input = { 2, 7, 11, 15, 10, 23, 72 };
		int[] output = { 2, 7 };
		assertArrayEquals(output, twoSum(input, 79));
	}

	@Test
	public void testTwoSum2() {
		int[] input = { 3, 2, 4 };
		int[] output = { 2, 3 };
		assertArrayEquals(output, twoSum(input, 6));
	}

	@Test
	public void testTwoSum3() {
		int[] input = { 0, 4, 3, 0 };
		int[] output = { 1, 4 };
		assertArrayEquals(output, twoSum(input, 0));
	}
	
	private int[] twoSum(int[] numbers, int target){
		return ts.twoSum(numbers, target);
	}
	
}
