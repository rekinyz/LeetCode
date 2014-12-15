package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class LinkedListCycleTest {

	LinkedListCycle linkedList = new LinkedListCycle();

	@Test
	public void testHasCycle0() {
		int[] input = { 0, 1, 1, 2, 2, 3, 3 };
		assertFalse(hasCycle(input));
	}

	@Test
	public void testHasCycle1() {
		int[] input = { 1, 1, 1, 1, 2, 3, 4, 4 };
		assertFalse(hasCycle(input));
	}

	@Test
	public void testHasCycle2() {
		int[] input = { 1, 2, 4, 5, 6, 7, 7 };
		assertFalse(hasCycle(input));
	}

	@Test
	public void testHasCycle3() {
		int[] input = { 0, 1, 2, 4, 5, 6, 7 };
		assertTrue(hasCycle(input, 2));
	}

	@Test
	public void testHasCycle4() {
		int[] input = { 2, 3, 4, 4, 5 };
		assertTrue(hasCycle(input, 3));
	}

	@Test
	public void testHasCycle5() {
		int[] input = { 3, 2, 0, -4 };
		assertTrue(hasCycle(input, 4));
	}

	private boolean hasCycle(int[] input) {
		ListNode list = ListNode.convert(input);
		return linkedList.hasCycle(list);
	}

	private boolean hasCycle(int[] input, int n) {
		ListNode list = ListNode.cycle(input, n);
		return linkedList.hasCycle(list);
	}
	
}
