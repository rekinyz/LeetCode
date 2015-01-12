package com.leetcode.oj;

/**
 * Merge Sorted Array Given two sorted integer arrays A and B, merge B into A as
 * one sorted array.
 * 
 * Note: You may assume that A has enough space (size that is greater or equal
 * to m + n) to hold additional elements from B. The number of elements
 * initialized in A and B are m and n respectively.
 * 
 * @author rekinyz
 */
public class MergeSortedArray {

	public void merge(int A[], int m, int B[], int n) {
		while (m + n > 0) {
			if(n < 1){
				return;
			}else if (m < 1 || A[m - 1] < B[n - 1]) {
				A[m + n - 1] = B[n - 1];
				n--;
			}else {
				A[m + n - 1] = A[m - 1];
				m--;
			}
		}
	}

}
