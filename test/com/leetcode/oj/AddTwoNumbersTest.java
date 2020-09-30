package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class AddTwoNumbersTest {

	AddTwoNumbers atn = new AddTwoNumbers();

	@Test
	public void testAddTwoNumbers1() {
		int[] a1 = { 2, 4, 3 };
		int[] a2 = { 2, 4, 3 };
		assertEquals(ListNode.convert(4, 8, 6), addTwoNumbers(a1, a2));
	}

	@Test
	public void testAddTwoNumbers2() {
		int[] a1 = { 5, 6, 4 };
		int[] a2 = { 2, 4, 3 };
		assertEquals(ListNode.convert(7, 0, 8), addTwoNumbers(a1, a2));
	}

	@Test
	public void testAddTwoNumbers3() {
		int[] a1 = { 5, 6, 4 };
		int[] a2 = { 5, 6, 4 };
		assertEquals(ListNode.convert(0, 3, 9), addTwoNumbers(a1, a2));
	}

	@Test
	public void testAddTwoNumbers4() {
		int[] a1 = { 5, 6, 4 };
		int[] a2 = { 5, 6, 4, 1 };
		assertEquals(ListNode.convert(0, 3, 9, 1), addTwoNumbers(a1, a2));
	}

	@Test
	public void testAddTwoNumbers5() {
		int[] a1 = { 5 };
		int[] a2 = { 5 };
		assertEquals(ListNode.convert(0, 1), addTwoNumbers(a1, a2));
	}

	public ListNode addTwoNumbers(int[] a1, int[] a2) {
		ListNode l1 = ListNode.convert(a1);
		ListNode l2 = ListNode.convert(a2);
		return atn.addTwoNumbers(l1, l2);
	}

}
