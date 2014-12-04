package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumber2Test {
	
	SingleNumber2 sn = new SingleNumber2();
	
	@Test
	public void testSingleNumber0() {
		int[] input = {1,3,1,2,1,3,4,2,4,3,2,4,5,7,5,5};
		assertEquals(sn.singleNumber(input), 7);
	}
	@Test
	public void testSingleNumber1() {
		int[] input = {1,1,2,1};
		assertEquals(sn.singleNumber(input), 2);
	}
	@Test
	public void testSingleNumber2() {
		int[] input = {1,3,1,2,1,3,4,2,4,3,2,4,5,7,5,5};
		assertEquals(sn.singleNumber1(input), 7);
	}
	@Test
	public void testSingleNumber3() {
		int[] input = {1,1,2,1};
		assertEquals(sn.singleNumber1(input), 2);
	}
	
}