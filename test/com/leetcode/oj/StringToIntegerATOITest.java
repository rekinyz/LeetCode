package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerATOITest {

	StringToIntegerATOI sti = new StringToIntegerATOI();

	@Test
	public void testAtoi1() {
		String s = "  -115579378e25 ";
		assertEquals(-115579378, atoi(s));
	}

	@Test
	public void testAtoi2() {
		String s = "";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi3() {
		String s = "+-2";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi4() {
		String s = "--2";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi5() {
		String s = " +0 123";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi6() {
		String s = "abc";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi7() {
		String s = " - 321";
		assertEquals(0, atoi(s));
	}

	@Test
	public void testAtoi8() {
		String s = " b11228552307";
		assertEquals(0, atoi(s)); // 11228552307 overflow
	}
	
	private int atoi(String s){
		return sti.atoi(s);
	}

}
