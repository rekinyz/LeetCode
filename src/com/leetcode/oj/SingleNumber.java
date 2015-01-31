package com.leetcode.oj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Single Number
 *
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author rekinyz
 */
public class SingleNumber {

	//O(N) time, O(1) space
	public int singleNumber(int[] A) {
		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}

	//O(N) time,  O(N) space
	public int singleNumber1(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (set.contains(a)) {
				set.remove(a);
			} else {
				set.add(a);
			}
		}
		return set.iterator().next();
	}
	
	//O(N+NlogN) time, O(N+1) space
	public int singleNumber2(int[] A) {
		Arrays.sort(A);
		Stack<Integer> stack = new Stack<>();
		for (int a : A) {
			if(stack.isEmpty()||stack.peek()!=a){
				stack.push(a);
			}else{
				stack.pop();
			}
		}
		return stack.pop();
	}
	
}
