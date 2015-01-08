package com.leetcode.oj;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZigZagConversionTest {
	
	ZigZagConversion zzc = new ZigZagConversion();
	
	@Test
	public void testConvert1(){
		String s = "PAYPALISHIRING";
		int nRows = 1;
		assertEquals("PAYPALISHIRING", convert(s, nRows));
	}
	
	@Test
	public void testConvert2(){
		String s = "PAYPALISHIRING";
		int nRows = 2;
		/*	P Y A I H R N
		 	A P L S I I G  
		 	0,2,4,6,8,10,12, 1,3,5,7,9,11,13
		*/
		assertEquals("PYAIHRNAPLSIIG", convert(s, nRows));
	}
	
	@Test
	public void testConvert3(){
		String s = "PAYPALISHIRING";
		int nRows = 3;
		/*	P   A   H   N
			A P L S I I G
			Y   I   R		
			0,4,8,12, 1,3,5,7,9,11,13, 2,6,10
		*/
		assertEquals("PAHNAPLSIIGYIR", convert(s, nRows));
	}
	
	@Test
	public void testConvert4(){
		String s = "PAYPALISHIRING";
		int nRows = 4;
		/*	P    I    N
			A  L S  I G
			Y A  H R
			P	 I		
			0,6,12, 1,7,11,13, 2,4,8,10, 3,9
		*/
		assertEquals("PINALSIGYAHRPI", convert(s, nRows));
	}
	
	@Test
	public void testConvert5(){
		String s = "PAYPALISHIRING";
		int nRows = 5;
		/*	P       H
			A     S I
			Y   I	R
			P L		I G
			A	 	N
			0,8, 1,7,9, 2,6,10, 3,5,11,13, 4,12	
		*/
		assertEquals("PHASIYIRPLIGAN", convert(s, nRows));
	}
	
	@Test
	public void testConvert6(){
		String s = "PAYPALISHIRING";
		int nRows = 14;
		assertEquals("PAYPALISHIRING", convert(s, nRows));
	}
	
	@Test
	public void testConvert7(){
		String s = "PAYPALISHIRING";
		int nRows = 54;
		assertEquals("PAYPALISHIRING", convert(s, nRows));
	}
	
	private String convert(String s, int nRows) {
		return zzc.convert(s, nRows);
    }
	
}
