package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {
	
	RomanToInteger rti = new RomanToInteger();
	
    @Test
    public void testRomanToInt1() {
    	assertEquals(rti.romanToInt("I"), 1);
    }
    @Test
    public void testRomanToInt2() {
    	assertEquals(rti.romanToInt("IV"), 4);
    }
    @Test
    public void testRomanToInt3() {
    	assertEquals(rti.romanToInt("VIII"), 8);
    }
    @Test
    public void testRomanToInt4() {
    	assertEquals(rti.romanToInt("XII"), 12);
    }
    @Test
    public void testRomanToInt5() {
    	assertEquals(rti.romanToInt("XVI"), 16);
    }
    @Test
    public void testRomanToInt6() {
    	assertEquals(rti.romanToInt("XIX"), 19);
    }
    @Test
    public void testRomanToInt7() {
    	assertEquals(rti.romanToInt("XL"), 40);
    }
    @Test
    public void testRomanToInt8() {
    	assertEquals(rti.romanToInt("LXX"), 70);
    }
    @Test
    public void testRomanToInt9() {
    	assertEquals(rti.romanToInt("XCIX"), 99);
    }
    @Test
    public void testRomanToInt10() {
    	assertEquals(rti.romanToInt("CXCIX"), 199);
    }
    @Test
    public void testRomanToInt11() {
    	assertEquals(rti.romanToInt("CD"), 400);
    }
    @Test
    public void testRomanToInt12() {
    	assertEquals(rti.romanToInt("DCCC"), 800);
    }
    @Test
    public void testRomanToInt13() {
    	assertEquals(rti.romanToInt("MCD"), 1400);
    }
    @Test
    public void testRomanToInt14() {
    	assertEquals(rti.romanToInt("MCDXXXVII"), 1437);
    }
    @Test
    public void testRomanToInt15() {
    	assertEquals(rti.romanToInt("MDCCCLXXX"), 1880);
    }
    @Test
    public void testRomanToInt16() {
    	assertEquals(rti.romanToInt("MMMCCCXXXIII"), 3333);
    }
    
}
