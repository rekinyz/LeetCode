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
		ListNode inputList = ListNode.convert();
		ListNode expectedList = ListNode.convert();
		int k = 5;
		assertEquals(expectedList, reverseKGroup(inputList, k));
	}

	private ListNode reverseKGroup(ListNode head, int k) {
		return rnkg.reverseKGroup(head, k);
	}

}
