package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTrailingZeroesTest {
	
	FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
	
	@Test
	public void testTrailingZeroes1(){
		int n = 6; // 6! = 6*5*4*3*2*1 = 720
		assertEquals(1, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes2(){
		int n = 7; // 7! = 5040
		assertEquals(1, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes3(){
		int n = 12; // 12! = 479001600
		assertEquals(2, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes4(){
		int n = 15; // 15! = 1307674368000
		assertEquals(3, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes5(){
		int n = 20; // 20! = 2432902008176640000
		assertEquals(4, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes6(){
		int n = 24; // 24! = 620448401733239439360000
		assertEquals(4, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes7(){
		int n = 25; // 25! = 15511210043330985984000000
		assertEquals(6, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes8(){
		int n = 29; // 29! = 8841761993739701954543616000000
		assertEquals(6, trailingZeroes(n));
	}
	
	@Test
	public void testTrailingZeroes9(){
		int n = 1808548329;
		assertEquals(452137076, trailingZeroes(n));
	}
	
	protected int trailingZeroes(int n) {
		return ftz.trailingZeroes(n);
    }
}
