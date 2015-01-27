package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

	IntegerToRoman itr = new IntegerToRoman();

	@Test
	public void testIntToRoman1() {
		assertEquals("I", intToRoman(1));
	}

	@Test
	public void testIntToRoman2() {
		assertEquals("IV", intToRoman(4));
	}

	@Test
	public void testIntToRoman3() {
		assertEquals("VIII", intToRoman(8));
	}

	@Test
	public void testIntToRoman4() {
		assertEquals("XII", intToRoman(12));
	}

	@Test
	public void testIntToRoman5() {
		assertEquals("XVI", intToRoman(16));
	}

	@Test
	public void testIntToRoman6() {
		assertEquals("XIX", intToRoman(19));
	}

	@Test
	public void testIntToRoman7() {
		assertEquals("XL", intToRoman(40));
	}

	@Test
	public void testIntToRoman8() {
		assertEquals("LXX", intToRoman(70));
	}

	@Test
	public void testIntToRoman9() {
		assertEquals("XCIX", intToRoman(99));
	}

	@Test
	public void testIntToRoman10() {
		assertEquals("CXCIX", intToRoman(199));
	}

	@Test
	public void testIntToRoman11() {
		assertEquals("CD", intToRoman(400));
	}

	@Test
	public void testIntToRoman12() {
		assertEquals("DCCC", intToRoman(800));
	}

	@Test
	public void testIntToRoman13() {
		assertEquals("MCD", intToRoman(1400));
	}

	@Test
	public void testIntToRoman14() {
		assertEquals("MCDXXXVII", intToRoman(1437));
	}

	@Test
	public void testIntToRoman15() {
		assertEquals("MDCCCLXXX", intToRoman(1880));
	}

	@Test
	public void testIntToRoman16() {
		assertEquals("MMMCCCXXXIII", intToRoman(3333));
	}
	
	@Test
	public void testIntToRoman17() {
		assertEquals("CDXC", intToRoman(490));
	}
	
	private String intToRoman(int num){
		return itr.intToRoman(num);
	}

}
