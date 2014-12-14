package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();

	@Test
	public void testSearch1() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(search(array, 3), -1);
	}

	@Test
	public void testSearch2() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(search(array, 4), 0);
	}

	@Test
	public void testSearch3() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(search(array, 0), 4);
	}

	@Test
	public void testSearch4() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(search(array, 3), 7);
	}
	
	@Test
	public void testSearch5() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(search(array, 3), 3);
	}
	
	@Test
	public void testSearch6() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		assertEquals(search(array, 0), 7);
	}
	
	@Test
	public void testSearch7() {
		int[] array = { 1, 2 };
		assertEquals(search(array, 1), 0);
	}
	
	@Test
	public void testSearch8() {
		int[] array = { 1, 2 };
		assertEquals(search(array, 2), 1);
	}

	private int search(int[] A, int target) {
		return srsa.search(A, target);
	}

}
