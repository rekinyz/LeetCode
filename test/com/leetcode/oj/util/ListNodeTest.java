package com.leetcode.oj.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ListNodeTest {

	@Test
	public void testCircle1() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		assertEquals(detectCycle(array, 3).val, 2);
	}

	@Test
	public void testCircle2() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		assertEquals(detectCycle(array, 2).val, 1);
	}

	@Test
	public void testCircle3() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		assertEquals(detectCycle(array, 1).val, 0);
	}

	@Test
	public void testConvert1() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		assertEquals(ListNode.convert(array).toList(), Arrays.asList(0, 1, 2, 3, 4, 5, 6));
	}

	@Test
	public void testConvert2() {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		ListNode converted = ListNode.convert(array);
		if(converted!=null){
			converted = converted.next;
		}
		assertEquals(converted.val, 1);
	}

	@Test
	public void testConvert3() {
		int[] array = {};
		ListNode converted = ListNode.convert(array);
		assertEquals(converted, null);
	}
	
	private ListNode detectCycle(int[] input, int n) {
		ListNode head = ListNode.cycle(input, n);
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {// determine the cycle
				fast = head; // reset the fast
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}
}
