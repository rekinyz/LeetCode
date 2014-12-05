package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 *  Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *  
 *  Follow up:
 *  Can you solve it without using extra space? 
 *   
 * 	@author rekinyz
 */
public class LinkedListCycle2 {

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {// determine the circle 
				fast=head; //reset the fast
				while(fast!=slow){
					fast = fast.next;
			        slow = slow.next;
				}
				return fast;
			}
		}
		return null;
    }
	
}
