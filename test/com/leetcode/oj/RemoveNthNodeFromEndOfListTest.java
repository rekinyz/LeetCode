package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RemoveNthNodeFromEndOfListTest {

	RemoveNthNodeFromEndOfList rn = new RemoveNthNodeFromEndOfList();

	@Test
	public void testRemoveNthFromEnd1() {
		int[] input = { 1, 2, 3, 4, 5 };
		ListNode head = ListNode.convert(input);
		assertEquals(Arrays.asList( 1, 2, 3, 5 ), removeNthFromEnd(head, 2).toList());
	}
	
	@Test
	public void testRemoveNthFromEnd2() {
		int[] input = { 1, 2 };
		ListNode head = ListNode.convert(input);
		assertEquals(Arrays.asList( 2 ), removeNthFromEnd(head, 2).toList());
	}
	
	@Test
	public void testRemoveNthFromEnd3() {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		ListNode head = ListNode.convert(input);
		assertEquals(Arrays.asList( 1, 3, 4, 5, 6 ), removeNthFromEnd(head, 5).toList());
	}
	
	@Test
	public void testRemoveNthFromEnd4() {
		int[] input = { 1 };
		ListNode head = ListNode.convert(input);
		assertEquals(null, removeNthFromEnd(head, 1));
	}

	private ListNode removeNthFromEnd(ListNode head, int n) {
		return rn.removeNthFromEnd(head, n);
	}

}
