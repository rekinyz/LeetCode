package com.leetcode.oj;

/**
 * Implement pow(x, n)
 * Tag: Math, Binary Search
 * @author rekinyz
 *
 */
public class Power {
	public double myPow(double x, int n) {
		long m = Math.abs((long) n);
		double res = 1.0;
		for (double y = x; m != 0; m >>= 1) {
			if ((m & 1) == 1) {
				res *= y;
			}
			y *= y;
		}
		return n < 0 ? 1.0 / res : res;
	}

	//it will compute the correct result, but the performance is very very bad for some extreme cases
	public double myPow0(double x, int n) {
		double res = 1.0;
		for (int i = 0; i < Math.abs((long) n); i++) {
			res *= x;
		}
		if (n <= 0) {
			res = 1.0 / res;
		}
		return res;
	}
}
