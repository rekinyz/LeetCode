package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class SwapNodesInPairsTest {

	SwapNodesInPairs snip = new SwapNodesInPairs();

	@Test
	public void testSwapPairs1() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4);
		ListNode expectedList = ListNode.convert(2, 1, 4, 3);
		assertEquals(expectedList, swapPairs(inputList));
	}

	@Test
	public void testSwapPairs2() {
		ListNode inputList = ListNode.convert(1, 2, 3, 4, 5);
		ListNode expectedList = ListNode.convert(2, 1, 4, 3, 5);
		assertEquals(expectedList, swapPairs(inputList));
	}

	@Test
	public void testSwapPairs3() {
		ListNode inputList = ListNode.convert(-1, 2, 3, 4, 5, 6);
		ListNode expectedList = ListNode.convert(2, -1, 4, 3, 6, 5);
		assertEquals(expectedList, swapPairs(inputList));
	}

	@Test
	public void testSwapPairs4() {
		ListNode inputList = ListNode.convert();
		ListNode expectedList = ListNode.convert();
		assertEquals(expectedList, swapPairs(inputList));
	}

	@Test
	public void testSwapPairs5() {
		ListNode inputList = ListNode.convert(0);
		ListNode expectedList = ListNode.convert(0);
		assertEquals(expectedList, swapPairs(inputList));
	}
	
	@Test
	public void testSwapPairs6() {
		ListNode inputList = null;
		ListNode expectedList = null;
		assertEquals(expectedList, swapPairs(inputList));
	}

	public ListNode swapPairs(ListNode head) {
		return snip.swapPairs(head);
	}

}
