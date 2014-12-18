package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

	SingleNumber sn = new SingleNumber();

	@Test
	public void testSingleNumber0() {
		int[] input = { 1, 1, 2, 3, 4, 3, 2, 4, 7, 5, 5 };
		assertEquals(7, sn.singleNumber(input));
	}

	@Test
	public void testSingleNumber1() {
		int[] input = { 1, 2, 1 };
		assertEquals(2, sn.singleNumber(input));
	}

	@Test
	public void testSingleNumber2() {
		int[] input = { 1, 1, 2, 3, 4, 3, 2, 4, 7, 5, 5 };
		assertEquals(7, sn.singleNumber1(input));
	}

	@Test
	public void testSingleNumber3() {
		int[] input = { 1, 2, 1 };
		assertEquals(2, sn.singleNumber1(input));
	}

}
