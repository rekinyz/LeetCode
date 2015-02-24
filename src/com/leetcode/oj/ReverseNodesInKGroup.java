package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Reverse Nodes In K-Group
 * 
 * Given a linked list, reverse the nodes of a linked list k at a time and
 * return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end
 * should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1->2->3->4->5 For k = 2, you should
 * return: 2->1->4->3->5 For k = 3, you should return: 3->2->1->4->5
 * 
 * @author rekinyz
 */
public class ReverseNodesInKGroup {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode p = head;
		int count = k;
		while (p != null && count != 0) {
			p = p.next;
			count--;
		}
		if (count == 0) {
			p = reverseKGroup(p, k);
			while (count++ < k) {
				ListNode next = head.next;
				head.next = p;
				p = head;
				head = next;
			}
			head = p;
		}
		return head;
	}

	// more understandable version
	public ListNode reverseKGroup1(ListNode head, int k) {
		ListNode p = head;
		int count = k;
		while (p != null && count != 0) {
			p = p.next;
			count--;
		}
		if (count == 0) {
			p = reverseKGroup(p, k);
			head = reverseLinkedList(head, p, k);
		}
		return head;
	}

	public ListNode reverseLinkedList(ListNode head, ListNode res, int count) {
		while (head != null && count-- != 0) {
			ListNode next = head.next;
			head.next = res;
			res = head;
			head = next;
		}
		return res;
	}

}
