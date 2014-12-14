package com.leetcode.oj;

/**
 * Search in Rotated Sorted Array
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * @author rekinyz
 *
 */
public class SearchInRotatedSortedArray {

	// O(logN)
	public int search(int[] A, int target) {
		return search(A, 0, A.length, target);
	}
	    
    private int search(int[] A, int start, int end, int target){
		int mid = (start + end) / 2;
		int S = A[start];
		int M = A[mid];
		int E = A[end-1];
		
		if(target==M) return mid;
		
		if(end-start>1){
			if(S<=M){
				if(S<=target && target<=M)
					return search(A, start, mid, target);
				else
					return search(A, mid, end, target);
			}else{
				if(M<=target && target<=E)
					return search(A, mid, end, target);
				else
					return search(A, start, mid, target);
			}
		}
		
		return -1;
	}

	// O(N)
	public int search1(int[] A, int target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
