package com.leetcode.oj;

/**
 * You are climbing a stair case. It takes n steps to reach to the top. Each
 * time you can either climb 1 or 2 steps. In how many distinct ways can you
 * climb to the top?
 * 
 * @author rekinyz
 */
public class ClimbingStairs {

	// O(N)
	public int climbStairs(int n) {
		int pre1 = 0, pre2 = 1, result = 1;
		for (int i = 0; i < n; i++) {
			result = pre1 + pre2;
			pre1 = pre2;
			pre2 = result;
		}
		return result;
	}

	// O(2^n)
	public int climbStairs1(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return climbStairs(n - 1) + climbStairs(n - 2);
	}

}
