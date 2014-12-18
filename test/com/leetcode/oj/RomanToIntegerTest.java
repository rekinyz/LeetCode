package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

	RomanToInteger rti = new RomanToInteger();

	@Test
	public void testRomanToInt1() {
		assertEquals(1, romanToInt("I"));
	}

	@Test
	public void testRomanToInt2() {
		assertEquals(4, romanToInt("IV"));
	}

	@Test
	public void testRomanToInt3() {
		assertEquals(8, romanToInt("VIII"));
	}

	@Test
	public void testRomanToInt4() {
		assertEquals(12, romanToInt("XII"));
	}

	@Test
	public void testRomanToInt5() {
		assertEquals(16, romanToInt("XVI"));
	}

	@Test
	public void testRomanToInt6() {
		assertEquals(19, romanToInt("XIX"));
	}

	@Test
	public void testRomanToInt7() {
		assertEquals(40, romanToInt("XL"));
	}

	@Test
	public void testRomanToInt8() {
		assertEquals(70, romanToInt("LXX"));
	}

	@Test
	public void testRomanToInt9() {
		assertEquals(99, romanToInt("XCIX"));
	}

	@Test
	public void testRomanToInt10() {
		assertEquals(199, romanToInt("CXCIX"));
	}

	@Test
	public void testRomanToInt11() {
		assertEquals(400, romanToInt("CD"));
	}

	@Test
	public void testRomanToInt12() {
		assertEquals(800, romanToInt("DCCC"));
	}

	@Test
	public void testRomanToInt13() {
		assertEquals(1400, romanToInt("MCD"));
	}

	@Test
	public void testRomanToInt14() {
		assertEquals(1437, romanToInt("MCDXXXVII"));
	}

	@Test
	public void testRomanToInt15() {
		assertEquals(1880, romanToInt("MDCCCLXXX"));
	}

	@Test
	public void testRomanToInt16() {
		assertEquals(3333, romanToInt("MMMCCCXXXIII"));
	}
	
	private int romanToInt(String input){
		return rti.romanToInt(input);
	}

}
