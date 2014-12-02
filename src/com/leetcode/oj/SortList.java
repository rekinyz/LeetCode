package com.leetcode.oj;

import com.leetcode.oj.util.ListNode;

/**
 * Sort List
 * 
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * @author rekinyz
 *
 */
public class SortList {
	
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		
		int len=0;
		ListNode p = head;
		while(p.next!=null){
			len++;
			p=p.next;
		}
		
		int mid=0;
		p=head;
		while(mid!=len/2){
			mid++;
			p=p.next;
		}
		ListNode r=p.next;
		p.next=null;
		
        return mergeList(sortList(head),sortList(r));
    }
	
	private ListNode mergeList(ListNode l, ListNode r){
		ListNode head = null;
		if(l.val<=r.val){
			head = l;
			l=l.next;
		}else{
			head = r;
			r=r.next;
		}
		head.next = null;
		
		ListNode p=head;
		while(l!=null && r!=null){
			if(l.val<=r.val){
				p.next = l;
				l=l.next;
			}else{
				p.next = r;
				r=r.next;
			}
			p=p.next;
		}
		
		if(l==null){
			p.next = r;
		}else{
			p.next = l;
		}
		
		return head;
	}
	
}
