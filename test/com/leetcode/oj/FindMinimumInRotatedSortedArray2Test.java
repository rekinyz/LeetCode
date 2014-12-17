package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinimumInRotatedSortedArray2Test {

	FindMinimumInRotatedSortedArray2 sa2 = new FindMinimumInRotatedSortedArray2();

	@Test
	public void testFindMin1() {
		int[] s = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3 };
		assertEquals(1, findMin(s));
	}

	@Test
	public void testFindMin2() {
		int[] s = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		assertEquals(1, findMin(s));
	}

	@Test
	public void testFindMin3() {
		int[] s = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1 };
		assertEquals(1, findMin(s));
	}

	@Test
	public void testFindMin4() {
		int[] s = { 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6 };
		assertEquals(1, findMin(s));
	}

	private int findMin(int[] num){
		return sa2.findMin(num);
	}
}
