package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RemoveDuplicatesFromSortedListTest {

	RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();

	@Test
	public void testDeleteDuplicates0() {
		assertEquals(ListNode.convert(2, 3), deleteDuplicates(2, 3, 3));
	}

	@Test
	public void testDeleteDuplicates1() {
		assertEquals(ListNode.convert(0, 1, 2, 3),
				deleteDuplicates(0, 1, 1, 2, 2, 3, 3));
	}

	@Test
	public void testDeleteDuplicates2() {
		assertEquals(ListNode.convert(1, 2, 3, 4),
				deleteDuplicates(1, 1, 1, 1, 2, 3, 4, 4));
	}

	@Test
	public void testDeleteDuplicates3() {
		assertEquals(ListNode.convert(1, 2, 4, 5, 6, 7),
				deleteDuplicates(1, 2, 4, 5, 6, 7, 7));
	}

	@Test
	public void testDeleteDuplicates4() {
		assertEquals(ListNode.convert(0, 1, 2, 4, 5, 6, 7),
				deleteDuplicates(0, 1, 2, 4, 5, 6, 7));
	}

	@Test
	public void testDeleteDuplicates5() {
		assertEquals(ListNode.convert(2, 3, 4, 5),
				deleteDuplicates(2, 3, 4, 4, 5));
	}

	@Test
	public void testDeleteDuplicates6() {
		assertEquals(ListNode.convert(0), deleteDuplicates(0, 0));
	}

	@Test
	public void testDeleteDuplicates7() {
		assertEquals(ListNode.convert(0, 1), deleteDuplicates(0, 1));
	}

	@Test
	public void testDeleteDuplicates8() {
		assertEquals(ListNode.convert(0, 1), deleteDuplicates(0, 1, 1));
	}

	@Test
	public void testDeleteDuplicates9() {
		assertEquals(ListNode.convert(0, 1, 2, 3, 4),
				deleteDuplicates(0, 1, 2, 2, 3, 4));
	}

	private ListNode deleteDuplicates(int... array) {
		ListNode node = ListNode.convert(array);
		return rdfsl.deleteDuplicates(node);
	}
}
