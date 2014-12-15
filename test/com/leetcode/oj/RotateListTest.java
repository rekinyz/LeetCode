package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RotateListTest {

	RotateList rl = new RotateList();

	@Test
	public void testRotateList1() {
		int[] array = { 1, 2, 3, 4, 5 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 2).toList(), Arrays.asList(4, 5, 1, 2, 3));
	}

	@Test
	public void testRotateList2() {
		int[] array = { 1, 2, 4, 4, 5, 2 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 3).toList(), Arrays.asList(4, 5, 2, 1, 2, 4));
	}

	@Test
	public void testRotateList3() {
		int[] array = { 1, 2 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 2).toList(), Arrays.asList(1, 2));
	}

	@Test
	public void testRotateList4() {
		int[] array = { 1 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 0).toList(), Arrays.asList(1));
	}

	@Test
	public void testRotateList5() {
		int[] array = { 1, 2, 4, 4, 5, 2 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 1).toList(), Arrays.asList(2, 1, 2, 4, 4, 5));
	}

	@Test
	public void testRotateList6() {
		int[] array = {};
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 1), null);
	}

	@Test
	public void testRotateList7() {
		int[] array = { 1 };
		ListNode input = ListNode.convert(array);
		assertEquals(rotateRight(input, 1).toList(), Arrays.asList(1));
	}

	private ListNode rotateRight(ListNode head, int n) {
		return rl.rotateRight(head, n);
	}

}
