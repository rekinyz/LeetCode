package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class MergeTwoSortedListsTest {

	MergeTwoSortedLists tmsl = new MergeTwoSortedLists();

	@Test
	public void testMergeTwoLists1() {
		int[] a1 = { 0, 1, 2 };
		int[] a2 = { 2, 3, 4, 4, 5, 6 };
		assertEquals( ListNode.convert(0, 1, 2, 2, 3, 4, 4, 5, 6), mergeTwoLists(a1, a2));
	}

	@Test
	public void testMergeTwoLists2() {
		int[] a1 = { 5, 6, 7, 8 };
		int[] a2 = { 1, 2, 3, 4 };
		assertEquals( ListNode.convert(1, 2, 3, 4, 5, 6, 7, 8), mergeTwoLists(a1, a2));
	}

	@Test
	public void testMergeTwoLists3() {
		int[] a1 = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] a2 = {};
		assertEquals( ListNode.convert(0, 1, 2, 3, 4, 5, 6, 7), mergeTwoLists(a1, a2));
	}

	@Test
	public void testMergeTwoLists4() {
		int[] a1 = {};
		int[] a2 = {};
		assertEquals(null, mergeTwoLists(a1, a2));
	}

	protected ListNode mergeTwoLists(int[] a1, int[] a2) {
		ListNode l1 = ListNode.convert(a1);
		ListNode l2 = ListNode.convert(a2);
		return tmsl.mergeTwoLists(l1, l2);
	}
}
