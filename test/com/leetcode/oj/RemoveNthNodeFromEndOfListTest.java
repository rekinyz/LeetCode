package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RemoveNthNodeFromEndOfListTest {

	RemoveNthNodeFromEndOfList rn = new RemoveNthNodeFromEndOfList();

	@Test
	public void testRemoveNthFromEnd1() {
		int[] input = { 1, 2, 3, 4, 5 };
		assertEquals(ListNode.convert( 1, 2, 3, 5 ), removeNthFromEnd(input, 2));
	}
	
	@Test
	public void testRemoveNthFromEnd2() {
		int[] input = { 1, 2 };
		assertEquals(ListNode.convert( 2 ), removeNthFromEnd(input, 2));
	}
	
	@Test
	public void testRemoveNthFromEnd3() {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		assertEquals(ListNode.convert( 1, 3, 4, 5, 6 ), removeNthFromEnd(input, 5));
	}
	
	@Test
	public void testRemoveNthFromEnd4() {
		int[] input = { 1 };
		assertEquals(null, removeNthFromEnd(input, 1));
	}

	private ListNode removeNthFromEnd(int[] input, int n) {
		ListNode head = ListNode.convert(input);
		return rn.removeNthFromEnd(head, n);
	}

}
