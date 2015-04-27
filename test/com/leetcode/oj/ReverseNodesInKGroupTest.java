package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class ReverseNodesInKGroupTest {

	ReverseNodesInKGroup rnkg = new ReverseNodesInKGroup();

	@Test
	public void testReverseKGroup1() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4);
		ListNode expectedList = ListNode.convert(2, 1, 4, 3);
		int k = 2;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}

	@Test
	public void testReverseKGroup2() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4);
		ListNode expectedList = ListNode.convert(3, 2, 1, 4);
		int k = 3;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}

	@Test
	public void testReverseKGroup3() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4);
		ListNode expectedList = ListNode.convert(4, 3, 2, 1);
		int k = 4;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}

	@Test
	public void testReverseKGroup4() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4, 5, 6, 7);
		ListNode expectedList = ListNode.convert(4, 3, 2, 1, 5, 6, 7);
		int k = 4;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}

	@Test
	public void testReverseKGroup5() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode expectedList = ListNode.convert(4, 3, 2, 1, 8, 7, 6, 5, 9);
		int k = 4;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}
	
	@Test
	public void testReverseKGroup6() {
		int k = 5;
		assertEquals(null, reverseKGroup(null, k));
	}
	
	@Test
	public void testReverseLinkedList1() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode expectedList = ListNode.convert(9, 8, 7, 6, 5, 4, 3, 2, 1);
		int k = 9;
		assertEquals(expectedList, reverseLinkedList(inputList, null, k));
	}
	
	@Test
	public void testReverseLinkedList2() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode expectedList = ListNode.convert(5, 4, 3, 2, 1, 6, 7, 8, 9);
		ListNode tail = ListNode.convert(6, 7, 8, 9);
		int k = 5;
		assertEquals(expectedList, reverseLinkedList(inputList, tail, k));
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		return rnkg.reverseKGroup(head, k);
	}
	
	public ListNode reverseLinkedList(ListNode head, ListNode tail, int count) {
		return rnkg.reverseLinkedList(head, tail, count);
	}

}
