package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SqrtXTest {
	
	SqrtX sq = new SqrtX();
	
	@Test
	public void testSqrtX1(){
		int x = 4;
		assertEquals(2, sqrt(x));
	}
	
	@Test
	public void testSqrtX2(){
		int x = 16;
		assertEquals(4, sqrt(x));
	}
	
	@Test
	public void testSqrtX3(){
		int x = 9;
		assertEquals(3, sqrt(x));
	}
	
	@Test
	public void testSqrtX4(){
		int x = 25;
		assertEquals(5, sqrt(x));
	}
	
	@Test
	public void testSqrtX5(){
		int x = 1;
		assertEquals(1, sqrt(x));
	}
	
	@Test
	public void testSqrtX6(){
		int x = 2;
		assertEquals(1, sqrt(x));
	}
	
	@Test
	public void testSqrtX7(){
		int x = 2147395599;
		assertEquals(46339, sqrt(x));
	}
	
	@Test
	public void testSqrtX8(){
		int x = 0;
		assertEquals(0, sqrt(x));
	}
	
	private int sqrt(int x) {
		return sq.sqrt(x);
	}
	
}
