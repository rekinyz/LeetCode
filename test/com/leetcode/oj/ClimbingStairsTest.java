package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClimbingStairsTest {

	ClimbingStairs cs = new ClimbingStairs();

	@Test
	public void testClimbStairs1() {
		assertEquals(1, climbStairs(1)); // {1}
	}

	@Test
	public void testClimbStairs2() {
		assertEquals(2, climbStairs(2)); // {1,1} {2}
	}

	@Test
	public void testClimbStairs3() {
		assertEquals(3, climbStairs(3)); // {1,1,1} {1,2} {2,1}
	}

	@Test
	public void testClimbStairs4() {
		assertEquals(5, climbStairs(4)); // {1,1,1,1} {1,1,2} {1,2,1} {2,1,1} {2,2}
	}

	@Test
	public void testClimbStairs5() {
		assertEquals(8, climbStairs(5)); // {1,1,1,1,1} {1,1,1,2} {1,1,2,1} {1,2,1,1} {2,1,1,1} {1,2,2} {2,1,2} {2,2,1}
	}

	@Test
	public void testClimbStairs6() {
		assertEquals(13, climbStairs(6)); // {1,1,1,1,1,1} {1,1,1,1,2} {1,1,1,2,1} {1,1,2,1,1} {1,2,1,1,1} {2,1,1,1,1} {1,1,2,2} {1,2,1,2} {2,1,1,2} {2,1,2,1} {2,2,1,1} {1,2,2,1} {2,2,2}
	}

	@Test
	public void testClimbStairs7() {
		assertEquals(1134903170, climbStairs(44));
	}

	@Test
	public void testClimbStairs8() {
		assertEquals(1134903170, climbStairs(44));
	}
	
	private int climbStairs(int input){
		return cs.climbStairs(input); 
	}

}
