package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class MergeKSortedListsTest {

	MergeKSortedLists mksl = new MergeKSortedLists();

	@Test
	public void testMergeKSortedLists0() {
		assertEquals(null, mksl.mergeKLists(null));
	}
	
	@Test
	public void testMergeKSortedLists1() {
		ListNode n1 = ListNode.convert();
		ListNode expectedList = ListNode.convert();
		
		assertEquals(expectedList, mergeKLists(n1));
	}
	
	@Test
	public void testMergeKSortedLists2() {
		ListNode n1 = ListNode.convert();
		ListNode n2 = ListNode.convert();
		ListNode expectedList = ListNode.convert();

		assertEquals(expectedList, mergeKLists(n1, n2));
	}

	@Test
	public void testMergeKSortedLists3() {
		ListNode n1 = ListNode.convert(1);
		ListNode n2 = ListNode.convert(2);
		ListNode expectedList = ListNode.convert(1, 2);

		assertEquals(expectedList, mergeKLists(n1, n2));
	}

	@Test
	public void testMergeKSortedLists4() {
		ListNode n1 = ListNode.convert(0, 3, 6, 7, 8);
		ListNode n2 = ListNode.convert(1, 2, 3, 5, 6, 7);
		ListNode n3 = ListNode.convert(0, 3, 4, 9);
		ListNode expectedList = ListNode.convert(0, 0, 1, 2, 3, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9);

		assertEquals(expectedList, mergeKLists(n1, n2, n3));
	}

	@Test
	public void testMergeKSortedLists5() {
		ListNode n1 = ListNode.convert(0, 3, 6);
		ListNode n2 = ListNode.convert(1, 2, 4);
		ListNode n3 = ListNode.convert(5, 9);
		ListNode n4 = ListNode.convert(7, 8);
		ListNode n5 = ListNode.convert();
		ListNode expectedList = ListNode.convert(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		assertEquals(expectedList, mergeKLists(n1, n2, n3, n4, n5));
	}

	private ListNode mergeKLists(ListNode... node) {
		List<ListNode> lists = Arrays.asList(node);
		return mksl.mergeKLists(lists);
	}

}
