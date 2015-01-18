package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Remove Nth Node From End of List
 * 
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * For example,
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5.
 * 
 * Note: Given n will always be valid. Try to do this in one pass.
 * 
 * @author rekinyz
 */
public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p1 = head;
		ListNode p2 = head;
		for (int i = 0; i < n; i++) {
			p1 = p1.next;
		}
		if(p1 == null){
			return p2.next;
		}
		while (p1.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		p2.next = p2.next.next;
		return head;
	}
	
}
