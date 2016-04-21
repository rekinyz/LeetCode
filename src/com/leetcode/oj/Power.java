package com.leetcode.oj;

/**
 * Implement pow(x, n)
 * Tag: Math, Binary Search
 * @author rekinyz
 *
 */
public class Power {
	public double myPow(double x, int n) {
		double res = x;
		if (n == 0) {
			return 1;
		}
		for (int i = 1; i < n; i++) {
			res = res * x;
		}
		if (n < 0) {
			res = 1 / res;
		}
		return res;
	}
}
