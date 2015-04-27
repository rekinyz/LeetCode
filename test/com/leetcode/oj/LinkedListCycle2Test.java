package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class LinkedListCycle2Test {

	LinkedListCycle2 list = new LinkedListCycle2();

	@Test
	public void testDetectCycle0() {
		int[] input = { 0, 1, 1, 2, 2, 3, 3 };
		assertEquals(null, detectCycle(input));
	}

	@Test
	public void testDetectCycle1() {
		int[] input = { 1, 1, 1, 1, 2, 3, 4, 4 };
		assertEquals(null, detectCycle(input));
	}

	@Test
	public void testDetectCycle2() {
		int[] input = { 1, 2, 4, 5, 6, 7, 7 };
		assertEquals(null, detectCycle(input));
	}

	@Test
	public void testDetectCycle3() {
		int[] input = { 0, 1, 2, 4, 5, 6, 7 };
		assertEquals(1, detectCycle(input, 2).val);
	}

	@Test
	public void testDetectCycle4() {
		int[] input = { 2, 3, 4, 4, 5 };
		assertEquals(4, detectCycle(input, 3).val);
	}

	@Test
	public void testDetectCycle5() {
		int[] input = { 3, 2, 0, -4 };
		assertEquals(3, detectCycle(input, 1).val);
	}

	@Test
	public void testDetectCycle6() {
		int[] input = { 3, 2, 0, -4 };
		assertEquals(-4, detectCycle(input, 4).val);
	}
	
	public ListNode detectCycle(int[] input) {
		ListNode node = ListNode.convert(input);
		return list.detectCycle(node);
	}

	public ListNode detectCycle(int[] input, int n) {
		ListNode node = ListNode.cycle(input, n);
		return list.detectCycle(node);
	}
	
}
