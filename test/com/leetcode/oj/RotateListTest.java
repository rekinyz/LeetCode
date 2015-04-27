package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RotateListTest {

	RotateList rl = new RotateList();

	@Test
	public void testRotateList1() {
		int[] array = { 1, 2, 3, 4, 5 };
		assertEquals(ListNode.convert(4, 5, 1, 2, 3), rotateRight(array, 2));
	}

	@Test
	public void testRotateList2() {
		int[] array = { 1, 2, 4, 4, 5, 2 };
		assertEquals(ListNode.convert(4, 5, 2, 1, 2, 4), rotateRight(array, 3));
	}

	@Test
	public void testRotateList3() {
		int[] array = { 1, 2 };
		assertEquals(ListNode.convert(1, 2), rotateRight(array, 2));
	}

	@Test
	public void testRotateList4() {
		int[] array = { 1 };
		assertEquals(ListNode.convert(1), rotateRight(array, 0));
	}

	@Test
	public void testRotateList5() {
		int[] array = { 1, 2, 4, 4, 5, 2 };
		assertEquals(ListNode.convert(2, 1, 2, 4, 4, 5), rotateRight(array, 1));
	}

	@Test
	public void testRotateList6() {
		int[] array = {};
		assertEquals(null, rotateRight(array, 1));
	}

	@Test
	public void testRotateList7() {
		int[] array = { 1 };
		assertEquals(ListNode.convert(1), rotateRight(array, 1));
	}

	public ListNode rotateRight(int[] array, int n) {
		ListNode input = ListNode.convert(array);
		return rl.rotateRight(input, n);
	}

}
