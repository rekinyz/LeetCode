package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

	RemoveDuplicatesFromSortedArray rdsa = new RemoveDuplicatesFromSortedArray();

	@Test
	public void testRemoveDuplicates1() {
		int[] input = { 1, 1, 2 };
		assertEquals(removeDuplicates(input), 2);
	}

	@Test
	public void testRemoveDuplicates2() {
		int[] input = { 1, 1, 2, 2, 3, 3, 4 };
		assertEquals(removeDuplicates(input), 4);
	}

	@Test
	public void testRemoveDuplicates3() {
		int[] input = { 1, 2, 2, 2, 2, 2 };
		assertEquals(removeDuplicates(input), 2);
	}

	@Test
	public void testRemoveDuplicates4() {
		int[] input = {};
		assertEquals(removeDuplicates(input), 0);
	}

	@Test
	public void testRemoveDuplicates5() {
		int[] input = { 1 };
		assertEquals(removeDuplicates(input), 1);
	}

	private int removeDuplicates(int[] input) {
		return rdsa.removeDuplicates(input);
	}
}
