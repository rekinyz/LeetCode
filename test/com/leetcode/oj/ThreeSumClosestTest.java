package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSumClosestTest {

	ThreeSumClosest tsc = new ThreeSumClosest();

	@Test
	public void testThreeSumClosest1() {
		int[] num = { -1, 2, 1, -4 };
		int target = 1;
		assertEquals(2, threeSumClosest(num, target)); // -1 + 2 + 1 = 2
	}

	@Test
	public void testThreeSumClosest2() {
		int[] num = { -1, 2, -3, -4, 3 };
		int target = 2;
		assertEquals(2, threeSumClosest(num, target)); // 2 + (-3) + 3 = 2
	}

	@Test
	public void testThreeSumClosest3() {
		int[] num = { -5, -1, 2, 1, -4, 3, 6, -2 };
		int target = 3;
		assertEquals(3, threeSumClosest(num, target)); // -1 + 1 + 3 = 3
	}

	@Test
	public void testThreeSumClosest4() {
		int[] num = { 0, 2, 1, -3 };
		int target = 1;
		assertEquals(0, threeSumClosest(num, target)); // 2 + 1 + (-3) = 0
	}

	@Test
	public void testThreeSumClosest5() {
		int[] num = { 1, 1, -1, -1, 3 };
		int target = -1;
		assertEquals(-1, threeSumClosest(num, target)); // 1 + (-1) + (-1) = -1
	}

	private int threeSumClosest(int[] num, int target) {
		return tsc.threeSumClosest(num, target);
	}

}
