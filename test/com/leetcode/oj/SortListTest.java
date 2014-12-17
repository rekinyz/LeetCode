package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class SortListTest {

	SortList sl = new SortList();

	@Test
	public void testSortList0() {
		int[] array = { 0, 1, 3, 2, 5, 7, 6 };
		assertEquals(Arrays.asList(0, 1, 2, 3, 5, 6, 7), sortList(array).toList());
	}

	@Test
	public void testSortList1() {
		int[] array = { 1, 2, 3, 4, 6, 5, 4, 4 };
		assertEquals(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6), sortList(array).toList());
	}

	@Test
	public void testSortList2() {
		int[] array = { 7, 6, 5, 4, 3, 2, 1, 0 };
		assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7), sortList(array).toList());
	}

	@Test
	public void testSortList3() {
		int[] array = { 4, 2, 1, 3 };
		assertEquals(Arrays.asList(1, 2, 3, 4), sortList(array).toList());
	}

	@Test
	public void testSortList4() {
		int[] array = {};
		assertEquals(sortList(array), null);
	}

	private ListNode sortList(int[] array) {
		ListNode node = ListNode.convert(array);
		return sl.sortList(node);
	}
}
