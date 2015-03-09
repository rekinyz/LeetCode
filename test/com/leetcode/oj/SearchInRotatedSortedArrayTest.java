package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	SearchInRotatedSortedArray srsa = new SearchInRotatedSortedArray();

	@Test
	public void testSearch1() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(-1, search(array, 3));
	}

	@Test
	public void testSearch2() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(0, search(array, 4));
	}

	@Test
	public void testSearch3() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(4, search(array, 0));
	}

	@Test
	public void testSearch4() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2, 3 };
		assertEquals(7, search(array, 3));
	}

	@Test
	public void testSearch5() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(3, search(array, 3));
	}

	@Test
	public void testSearch6() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		assertEquals(7, search(array, 0));
	}

	@Test
	public void testSearch7() {
		int[] array = { 1, 2 };
		assertEquals(0, search(array, 1));
	}

	@Test
	public void testSearch8() {
		int[] array = { 1, 2 };
		assertEquals(1, search(array, 2));
	}

	@Test
	public void testSearch9() {
		int[] array = { 0 };
		assertEquals(0, search(array, 0));
	}

	@Test
	public void testSearch10() {
		int[] array = { 1, 3, 5 };
		assertEquals(-1, search(array, 4));
	}

	@Test
	public void testSearch11() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(-1, search(array, 8));
	}

	@Test
	public void testSearch13() {
		int[] array = { 9, 0, 2, 7, 8 };
		assertEquals(-1, search(array, 3));
	}

	@Test
	public void testSearch14() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(4, search(array, 0));
	}

	@Test
	public void testSearch15() {
		int[] array = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(1, search(array, 5));
	}

	@Test
	public void testSearch16() {
		int[] array = { 8, 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(6, search(array, 6));
	}

	@Test
	public void testSearch17() {
		int[] array = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
		assertEquals(7, search(array, 9));
	}

	protected int search(int[] A, int target) {
		return srsa.search(A, target);
	}

}
