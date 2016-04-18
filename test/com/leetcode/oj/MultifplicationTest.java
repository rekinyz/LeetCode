package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultifplicationTest {
	Multiplication m = new Multiplication();

	@Test
	public void testMultiply01() {
		int x = 0, y = 0;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply02() {
		int x = 1, y = 1;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply03() {
		int x = 0, y = -1;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply04() {
		int x = -1, y = -1;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply05() {
		int x = 2, y = 5;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply06() {
		int x = 2, y = -5;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply07() {
		int x = -2, y = 5;
		assertEquals(x * y, m.multiply(x, y));
	}

	@Test
	public void testMultiply08() {
		int x = -2, y = -5;
		assertEquals(x * y, m.multiply(x, y));
	}
}
