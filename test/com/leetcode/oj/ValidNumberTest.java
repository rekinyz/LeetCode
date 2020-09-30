package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class ValidNumberTest {

	protected abstract boolean isNumber(String s);

	@Test
	public void TestIsNumber1() {
		String s = ".2e81";
        assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber2() {
		String s = "0";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber3() {
		String s = " 0.1 ";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber4() {
		String s = "46.e3";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber5() {
		String s = "1.";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber6() {
		String s = ".1";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber7() {
		String s = "1.431e7";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber8() {
		String s = "-1.";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber9() {
		String s = " 0057e+6";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber10() {
		String s = "10E2";
		assertTrue(isNumber(s));
	}

	@Test
	public void TestIsNumber11() {
		String s = "e";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber12() {
		String s = ".";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber13() {
		String s = "abc";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber14() {
		String s = "1 a";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber15() {
		String s = "1e.";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber16() {
		String s = " ";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber17() {
		String s = "e9";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber18() {
		String s = "0e";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber19() {
		String s = "-.";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber20() {
		String s = "+";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber21() {
		String s = "..2";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber22() {
		String s = ".e1";
		assertFalse(isNumber(s));
	}

	@Test
	public void TestIsNumber23() {
		String s = ".e.1";
		assertFalse(isNumber(s));
	}

}
