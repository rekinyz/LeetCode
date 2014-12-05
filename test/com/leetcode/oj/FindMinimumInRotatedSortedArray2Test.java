package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinimumInRotatedSortedArray2Test {

	FindMinimumInRotatedSortedArray2 sa2 = new FindMinimumInRotatedSortedArray2();

	@Test
	public void testFindMin1() {
		int[] s = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3 };
		assertEquals(sa2.findMin(s), 1);
	}

	@Test
	public void testFindMin2() {
		int[] s = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		assertEquals(sa2.findMin(s), 1);
	}

	@Test
	public void testFindMin3() {
		int[] s = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1 };
		assertEquals(sa2.findMin(s), 1);
	}

	@Test
	public void testFindMin4() {
		int[] s = { 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6 };
		assertEquals(sa2.findMin(s), 1);
	}

	@Test
	public void testFindMin5() {
		int[] s = { 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6 };
		assertEquals(sa2.findMin1(s), 1);
	}
}
