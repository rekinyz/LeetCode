package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTwoIntegersTest {
	DivideTwoIntegers dti = new DivideTwoIntegers();

	@Test
	public void testDivide01() {
		int dividend = 0, divisor = 1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide02() {
		int dividend = 1, divisor = 0;
		assertEquals(Integer.MAX_VALUE, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide03() {
		int dividend = 1, divisor = 1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide04() {
		int dividend = 0, divisor = -1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide05() {
		int dividend = 1, divisor = -1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide06() {
		int dividend = -1, divisor = 1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide07() {
		int dividend = -1, divisor = -1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide08() {
		int dividend = -5, divisor = 2;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide09() {
		int dividend = 5, divisor = 2;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide10() {
		int dividend = -5, divisor = -2;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide11() {
		int dividend = 5, divisor = -2;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide12() {
		int dividend = 2, divisor = 5;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide13() {
		int dividend = -2, divisor = 5;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide14() {
		int dividend = 2, divisor = -5;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide15() {
		int dividend = -2, divisor = -5;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide16() {
		int dividend = -20000, divisor = -50000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide17() {
		int dividend = 20000, divisor = -50000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide18() {
		int dividend = 20000, divisor = 50000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide19() {
		int dividend = -50000, divisor = -20000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide20() {
		int dividend = 50000, divisor = -20000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide21() {
		int dividend = 50000, divisor = 20000;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide22() {
		int dividend = Integer.MAX_VALUE, divisor = 1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide23() {
		int dividend = Integer.MAX_VALUE, divisor = -1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide24() {
		int dividend = 1, divisor = Integer.MAX_VALUE; // 2147483647
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide25() {
		int dividend = -1, divisor = Integer.MAX_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide26() {
		int dividend = Integer.MIN_VALUE, divisor = 1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide27() {
		int dividend = Integer.MIN_VALUE, divisor = -1;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide28() {
		int dividend = -1, divisor = Integer.MIN_VALUE; // -2147483648;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide29() {
		int dividend = 1, divisor = Integer.MIN_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide30() {
		int dividend = Integer.MIN_VALUE, divisor = Integer.MIN_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide31() {
		int dividend = Integer.MIN_VALUE, divisor = Integer.MAX_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide32() {
		int dividend = Integer.MAX_VALUE, divisor = Integer.MAX_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}

	@Test
	public void testDivide33() {
		int dividend = Integer.MAX_VALUE, divisor = Integer.MIN_VALUE;
		assertEquals(dividend / divisor, dti.divide(dividend, divisor));
	}
}
