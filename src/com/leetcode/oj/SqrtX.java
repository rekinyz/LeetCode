package com.leetcode.oj;

/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author rekinyz
 */
public class SqrtX {

	public int sqrt(int x) {
		long low = 0, high = x, mid = (low + high) >> 1;
		while (low <= high) {
			if (mid * mid < x) {
				low = mid + 1;
			} else if (mid * mid > x) {
				high = mid - 1;
			} else {
				return (int) mid;
			}
			mid = (low + high) >> 1;
		}
		return (int) mid;
	}

}
