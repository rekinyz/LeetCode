package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {

	SearchInsertPosition sip = new SearchInsertPosition();

	@Test
	public void testSearchInsert0() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(2, searchInsert(input, 5));
	}

	@Test
	public void testSearchInsert1() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(1, searchInsert(input, 2));
	}

	@Test
	public void testSearchInsert2() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(4, searchInsert(input, 7));
	}

	@Test
	public void testSearchInsert3() {
		int[] input = { 1, 3, 5, 6 };
		assertEquals(0, searchInsert(input, 0));
	}

	@Test
	public void testSearchInsert4() {
		int[] input = { 1, 3, 5, 6, 8, 12, 13, 14, 30, 76 };
		assertEquals(8, searchInsert(input, 25));
	}

	@Test
	public void testSearchInsert5() {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
						23, 24, 25,	26, 27, 28, 29, 30, 31, 32,	33, 34, 35, 36, 37, 38, 39, 40, 76 };
		assertEquals(40, searchInsert(input, 41));
	}
	
	protected int searchInsert(int[] A, int target){
		return sip.searchInsert(A, target);
	}

}
