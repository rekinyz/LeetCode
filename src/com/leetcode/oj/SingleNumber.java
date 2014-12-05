package com.leetcode.oj;

import java.util.HashSet;
import java.util.Set;

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

	public int singleNumber(int[] A) {
		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}

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
}
