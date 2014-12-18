package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
	
	CountAndSay cas = new CountAndSay();

	@Test
	public void testCountAndSay1() {
		int input = 1;
		assertEquals("1", countAndSay(input));
	}

	@Test
	public void testCountAndSay2() {
		int input = 2;
		assertEquals("11", countAndSay(input));
	}

	@Test
	public void testCountAndSay3() {
		int input = 3;
		assertEquals("21", countAndSay(input));
	}

	@Test
	public void testCountAndSay4() {
		int input = 4;
		assertEquals("1211", countAndSay(input));
	}

	@Test
	public void testCountAndSay5() {
		int input = 5;
		assertEquals("111221", countAndSay(input));
	}

	@Test
	public void testCountAndSay6() {
		int input = 10;
		assertEquals("13211311123113112211", countAndSay(input));
	}
	
	@Test
	public void testCountAndSay7() {
		int input = 20;
		assertEquals("11131221131211132221232112111312111213111213211231132132211211131221131211221321123113213221123113112221131112311332211211131221131211132211121312211231131112311211232221121321132132211331121321231231121113112221121321133112132112312321123113112221121113122113121113123112112322111213211322211312113211", countAndSay(input));
	}
	
	private String countAndSay(int n) {
		return cas.countAndSay(n);
	}
	
}
