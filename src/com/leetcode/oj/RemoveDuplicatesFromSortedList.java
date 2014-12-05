package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Remove Duplicates from Sorted List
 * 
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author rekinyz
 *
 */
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode list = head;
		while (head != null && head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return list;
	}

}
