package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	ReverseInteger rti = new ReverseInteger();

	@Test
	public void testReverse0() {
		assertEquals(987654321, reverse(+123456789));
	}

	@Test
	public void testReverse1() {
		assertEquals(-987654321, reverse(-123456789));
	}

	@Test
	public void testReverse2() {
		assertEquals(0, reverse(1000000003)); // overflow
	}

	@Test
	public void testReverse3() {
		assertEquals(0, reverse(Integer.MAX_VALUE)); // overflow
	}

	@Test
	public void testReverse4() {
		assertEquals(0, reverse(Integer.MIN_VALUE)); // overflow
	}

	@Test
	public void testReverse5() {
		assertEquals(321, reverse(123));
	}
	
	@Test
	public void testReverse6() {
		assertEquals(2147483641, reverse(1463847412));
	}

	protected int reverse(int input){
		return rti.reverse(input);
	}
}
