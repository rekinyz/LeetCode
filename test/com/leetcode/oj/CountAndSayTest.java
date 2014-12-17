package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
	
	CountAndSay cas = new CountAndSay();

	@Test
	public void testCountAndSay1() {
		assertEquals("1", countAndSay(1));
	}

	@Test
	public void testCountAndSay2() {
		assertEquals("11", countAndSay(2));
	}

	@Test
	public void testCountAndSay3() {
		assertEquals("21", countAndSay(3));
	}

	@Test
	public void testCountAndSay4() {
		assertEquals("1211", countAndSay(4));
	}

	@Test
	public void testCountAndSay5() {
		assertEquals("111221", countAndSay(5));
	}

	@Test
	public void testCountAndSay6() {
		assertEquals("13211311123113112211", countAndSay(10));
	}
	
	private String countAndSay(int n) {
		return cas.countAndSay(n);
	}
	
}
