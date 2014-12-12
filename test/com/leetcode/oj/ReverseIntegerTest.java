package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	ReverseInteger rti = new ReverseInteger();

	@Test
	public void testReverse0() {
		assertEquals(reverse(+123456789), 987654321);
	}

	@Test
	public void testReverse1() {
		assertEquals(reverse(-123456789), -987654321);
	}

	@Test
	public void testReverse2() {
		assertEquals(reverse(1000000003), 0); // overflow
	}

	@Test
	public void testReverse3() {
		assertEquals(reverse(Integer.MAX_VALUE), 0); // overflow
	}

	@Test
	public void testReverse4() {
		assertEquals(reverse(Integer.MIN_VALUE), 0); // overflow
	}

	@Test
	public void testReverse5() {
		assertEquals(reverse(123), 321);
	}
	
	@Test
	public void testReverse6() {
		assertEquals(reverse(1463847412), 2147483641);
	}

	private int reverse(int input){
		return rti.reverse(input);
	}
}
