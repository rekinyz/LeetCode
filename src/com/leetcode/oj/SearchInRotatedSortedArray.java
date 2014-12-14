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
	
	//O(N)
	public int search(int[] A, int target) {
		for(int i=0;i<A.length;i++){
			if(A[i]==target){
				return i;
			}
		}
		return -1;
	}

}
