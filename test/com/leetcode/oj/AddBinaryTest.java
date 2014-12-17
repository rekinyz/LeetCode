package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {

	AddBinary ab = new AddBinary();

	@Test
	public void testAddBinary1() {
		String a = "11";
		String b = "1";
		assertEquals("100", addBinary(a, b));
	}

	@Test
	public void testAddBinary2() {
		String a = "11";
		String b = "110";
		assertEquals("1001", addBinary(a, b));
	}
	
	@Test
	public void testAddBinary3() {
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "1";
		assertEquals("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001110", addBinary(a, b));
	}
	
	@Test
	public void testAddBinary4() {
		String a = "1111";
		String b = "1111";
		assertEquals("11110", addBinary(a, b));
	}
	
	private String addBinary(String a, String b) {
		return ab.addBinary(a, b);
	}
}
