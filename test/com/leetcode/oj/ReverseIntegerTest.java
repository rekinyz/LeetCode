package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {
	
	ReverseInteger rti = new ReverseInteger();
	
	@Test
	public void testReverse0() {
		assertEquals(rti.reverse(+123456789), 987654321);
	}
    @Test
    public void testReverse1() {
    	assertEquals(rti.reverse(-123456789), -987654321);
    }
    @Test
    public void testReverse2() {
    	assertEquals(rti.reverse(1000000003), 0); //overflow
    }
    @Test
    public void testReverse3() {
    	assertEquals(rti.reverse(Integer.MAX_VALUE), 0); //overflow
    }
    @Test
    public void testReverse4() {
    	assertEquals(rti.reverse(Integer.MIN_VALUE), 0); //overflow
    }
    @Test
    public void testReverse5() {
    	assertEquals(rti.reverse1(123), 321); 
    }
    
}
