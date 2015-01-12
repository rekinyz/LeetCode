package com.leetcode.oj;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {

	MergeSortedArray msa = new MergeSortedArray();

	@Test
	public void testMergeTwoLists1() {
		int[] A = { 0, 1, 2, 0, 0, 0, 0, 0, 0 };
		int[] B = { 2, 3, 4, 4, 5, 6 };
		int[] res = { 0, 1, 2, 2, 3, 4, 4, 5, 6 };
		assertArrayEquals(res, merge(A, 3, B, B.length));
	}

	@Test
	public void testMergeTwoLists2() {
		int[] A = { 5, 6, 7, 8, 0, 0, 0, 0 };
		int[] B = { 1, 2, 3, 4 };
		int[] res = { 1, 2, 3, 4, 5, 6, 7, 8 };
		assertArrayEquals(res, merge(A, 4, B, B.length));
	}

	@Test
	public void testMergeTwoLists3() {
		int[] A = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] B = {};
		int[] res = { 0, 1, 2, 3, 4, 5, 6, 7 };
		assertArrayEquals(res, merge(A, 8, B, B.length));
	}

	@Test
	public void testMergeTwoLists4() {
		int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] B = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] res = { 0, 1, 2, 3, 4, 5, 6, 7 };
		assertArrayEquals(res, merge(A, 0, B, B.length));
	}

	@Test
	public void testMergeTwoLists5() {
		int[] A = {};
		int[] B = {};
		int[] res = {};
		assertArrayEquals(res, merge(A, 0, B, B.length));
	}

	private int[] merge(int[] A, int m, int[] B, int n) {
		msa.merge(A, m, B, n);
		return A;
	}
}
