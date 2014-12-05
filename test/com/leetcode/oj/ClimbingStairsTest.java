package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClimbingStairsTest {

	ClimbingStairs cs = new ClimbingStairs();

	@Test
	public void testClimbStairs1() {
		assertEquals(cs.climbStairs(1), 1); // {1}
	}

	@Test
	public void testClimbStairs2() {
		assertEquals(cs.climbStairs(2), 2); // {1,1} {2}
	}

	@Test
	public void testClimbStairs3() {
		assertEquals(cs.climbStairs(3), 3); // {1,1,1} {1,2} {2,1}
	}

	@Test
	public void testClimbStairs4() {
		assertEquals(cs.climbStairs(4), 5); // {1,1,1,1} {1,1,2} {1,2,1} {2,1,1} {2,2}
	}

	@Test
	public void testClimbStairs5() {
		assertEquals(cs.climbStairs(5), 8); // {1,1,1,1,1} {1,1,1,2} {1,1,2,1} {1,2,1,1} {2,1,1,1} {1,2,2} {2,1,2} {2,2,1}
	}

	@Test
	public void testClimbStairs6() {
		assertEquals(cs.climbStairs(6), 13); // {1,1,1,1,1,1} {1,1,1,1,2} {1,1,1,2,1} {1,1,2,1,1} {1,2,1,1,1} {2,1,1,1,1} {1,1,2,2} {1,2,1,2} {2,1,1,2} {2,1,2,1} {2,2,1,1} {1,2,2,1} {2,2,2}
	}

	@Test
	public void testClimbStairs7() {
		assertEquals(cs.climbStairs(44), 1134903170);
	}

	@Test
	public void testClimbStairs8() {
		assertEquals(cs.climbStairs1(44), 1134903170);
	}

}
