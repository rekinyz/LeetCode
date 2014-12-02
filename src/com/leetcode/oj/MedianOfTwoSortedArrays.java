package com.leetcode.oj;


/**
 * Median of Two Sorted Arrays
 * 
 * There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. 
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * @author rekinyz
 *
 */
public class MedianOfTwoSortedArrays {

	//TODO: Time complexity is O(m+n), not good enough
	public double findMedianSortedArrays(int A[], int B[]) {
		int lenA = A.length;
		int lenB = B.length;
		int len = lenA+lenB;
	    int[] merged = new int[len];
	    int i=0,j=0;
		for(int k=0;k<len;k++){
			if(i<lenA && j<lenB){
				if(A[i]<=B[j]){
					merged[k]=A[i]; i++;
				}else{
					merged[k]=B[j]; j++;
				}
				continue;
			}
			if(i<lenA){
				merged[k]=A[i]; i++;
			}
			if(j<lenB){
				merged[k]=B[j]; j++;
			}
		}
		
		i=0; j=merged.length-1;
		while(j-i>0){
			i++; j--;
		}
		
		if(j!=i && merged[i]!=merged[j]){
			return (merged[i]+merged[j])/2.0;
		}else{
			return merged[i];
		}
	}

}
