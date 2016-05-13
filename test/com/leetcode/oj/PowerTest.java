package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerTest {
	Power p = new Power();
	double delta = 0.0000000001;

	@Test
	public void testMyPowy01() {
		double x = 0.0;
		int n = 0;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy02() {
		double x = 0.0;
		int n = 1;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy03() {
		double x = 1.0;
		int n = 0;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy04() {
		double x = 1.0;
		int n = 1;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy05() {
		double x = 2.0;
		int n = -1;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy06() {
		double x = 8.88023;
		int n = 3;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy07() {
		double x = 34.00515;
		int n = -3;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy08() {
		double x = -2.0;
		int n = 31;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy09() {
		double x = 0.00001;
		int n = Integer.MAX_VALUE; //2147483647
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy10() {
		double x = 10000.1;
		int n = Integer.MIN_VALUE; //-2147483648
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy11() {
		double x = Integer.MAX_VALUE;
		int n = -80;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	@Test
	public void testMyPowy12() {
		double x = Integer.MAX_VALUE;
		int n = 20;
		assertEquals(Math.pow(x, n), myPow(x, n), delta);
	}

	private double myPow(double x, int n) {
		return p.myPow0(x, n);
	}
}
