package com.leetcode.oj;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT. Subscribe to see which companies asked
 * this question
 *
 * @author rekinyz
 */
public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int res = Integer.MAX_VALUE;
		if (divisor != 0) {
			res = (int) div(Math.abs((long) dividend), Math.abs((long) divisor), 0);
			if (dividend > 0 ^ divisor > 0) {
				res = 0 - res;
			}
		}
		return res;
	}

	private long div(long x, long y, int sum) {
		long oy = y, res = sum, i = 1;
		sum = 1;
		while (x >= y) {
			if (x < y << 1) {
				return res + div(x - y, oy, sum);
			} else {
				y <<= 1;
				sum = 1 << i++;
			}
		}
		return res;
	}

}
