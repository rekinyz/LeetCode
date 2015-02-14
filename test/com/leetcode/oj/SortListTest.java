package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class SortListTest {

	SortList sl = new SortList();

	@Test
	public void testSortList0() {
		assertEquals(ListNode.convert(0, 1, 2, 3, 5, 6, 7),
				sortList(0, 1, 3, 2, 5, 7, 6));
	}

	@Test
	public void testSortList1() {
		assertEquals(ListNode.convert(1, 2, 3, 4, 4, 4, 5, 6),
				sortList(1, 2, 3, 4, 6, 5, 4, 4));
	}

	@Test
	public void testSortList2() {
		assertEquals(ListNode.convert(0, 1, 2, 3, 4, 5, 6, 7),
				sortList(7, 6, 5, 4, 3, 2, 1, 0));
	}

	@Test
	public void testSortList3() {
		assertEquals(ListNode.convert(1, 2, 3, 4), sortList(4, 2, 1, 3));
	}

	@Test
	public void testSortList4() {
		assertEquals(ListNode.convert(), null);
	}

	private ListNode sortList(int... array) {
		ListNode node = ListNode.convert(array);
		return sl.sortList(node);
	}
}
