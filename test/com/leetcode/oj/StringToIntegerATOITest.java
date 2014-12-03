package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerATOITest {
	
	StringToIntegerATOI sti = new StringToIntegerATOI();

	@Test
	public void testAtoi1() {
		String s="  -115579378e25 ";
		assertEquals(sti.atoi(s), -115579378);
	}
	@Test
	public void testAtoi2() {
		String s="";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi3() {
		String s="+-2";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi4() {
		String s="--2";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi5() {
		String s=" +0 123";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi6() {
		String s="abc";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi7() {
		String s=" - 321";
		assertEquals(sti.atoi(s), 0);
	}
	@Test
	public void testAtoi8() {
		String s=" b11228552307";
		assertEquals(sti.atoi(s), 0); // 11228552307 overflow
	}

}
