package com.leetcode.oj;


/**
 *  Maximum Product Subarray
 * 
 *  Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *  
 *  For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6. 
 * 
 * @author rekinyz
 */
public class MaximumProductSubarray {
	
	//TODO O(N²) -> O(N)
	public int maxProduct(int[] A) {
	    int max=A[0],tmp;
	    for(int i=0; i<A.length; i++){
	        tmp=A[i];
	        for(int j=i+1; j<A.length; j++){
	            tmp*=A[j];
	            max=Math.max(max, tmp);
	        }
        	max=Math.max(max, A[i]);
	    }
	    return max;
	}
	
}
