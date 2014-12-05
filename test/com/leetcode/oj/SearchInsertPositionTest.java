package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {

	SearchInsertPosition array = new SearchInsertPosition();

	@Test
	public void testSearchInsert0() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert(input, 5), 2);
	}

	@Test
	public void testSearchInsert1() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert(input, 2), 1);
	}

	@Test
	public void testSearchInsert2() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert(input, 7), 4);
	}

	@Test
	public void testSearchInsert3() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert(input, 0), 0);
	}

	@Test
	public void testSearchInsert4() {
		int[] input = { 1, 3, 5, 6, 8, 12, 13, 14, 30, 76 };
		assertEquals(array.searchInsert(input, 25), 8);
	}

	@Test
	public void testSearchInsert5() {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
						23, 24, 25,	26, 27, 28, 29, 30, 31, 32,	33, 34, 35, 36, 37, 38, 39, 40, 76 };
		assertEquals(array.searchInsert(input, 41), 40);
	}

	@Test
	public void testSearchInsert6() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert1(input, 7), 4);
	}

	@Test
	public void testSearchInsert7() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(array.searchInsert1(input, 0), 0);
	}

	@Test
	public void testSearchInsert8() {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 
						23, 24, 25, 26, 27, 28, 29, 30, 31, 32,	33, 34, 35, 36, 37, 38, 39, 40, 76 };
		assertEquals(array.searchInsert1(input, 41), 40);
	}

}
