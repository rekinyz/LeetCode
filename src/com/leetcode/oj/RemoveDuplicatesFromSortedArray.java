package com.leetcode.oj;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array
 * 
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * @author z001raxe
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] A) {
		int count = 0;
		int len = A.length;
		if (len < 2) {
			return len;
		}
		for (int i = 1; i < len; ++i) {
			if (A[i] == A[i - 1]) {
				count++;
			} else {
				A[i - count] = A[i];
			}
		}
		return len -= count;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray rdsa = new RemoveDuplicatesFromSortedArray();

		int[] input1 = { 1, 1, 2 };

		System.out.println(rdsa.removeDuplicates(input1)); // 2
		System.out.println(Arrays.toString(input1)); // [1,2]

	}

}
