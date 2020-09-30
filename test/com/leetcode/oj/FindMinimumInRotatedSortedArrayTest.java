package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindMinimumInRotatedSortedArrayTest {

	FindMinimumInRotatedSortedArray sa = new FindMinimumInRotatedSortedArray();

	@Test
	public void testFindMin0() {
		int[] num = { 7, 0, 1, 2, 3, 4, 5, 6 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin1() {
		int[] num = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin2() {
		int[] num = { 1, 2, 4, 5, 6, 7, 0 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin3() {
		int[] num = { 0, 1, 2, 4, 5, 6, 7 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin4() {
		int[] num = { 2, 3, 4, 0, 1 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin5() {
		int[] num = { 0 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin6() {
		int[] num = { 3, 0, 2 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin7() {
		int[] num = { 3, 0 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin8() {
		int[] num = { 5, 6, 7, 0, 1, 2, 3, 4 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin9() {
		int[] num = { 2, 3, 0 };
		assertEquals(0, findMin(num));
	}

	@Test
	public void testFindMin10() {
		int[] num = { 0, 1 };
		assertEquals(0, findMin(num));
	}
	
	protected int findMin(int[] num){
		return sa.findMin(num);
	}
}
