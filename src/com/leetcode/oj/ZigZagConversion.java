package com.leetcode.oj;

/**
 * ZigZag Conversion
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * 	P   A   H   N
 *	A P L S I I G
 *	Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * 
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * 
 * string convert(string text, int nRows);
 * 
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * @author rekinyz
 *
 */
public class ZigZagConversion {

	public String convert(String s, int nRows) {
		int len = s.length();
		if (nRows <= 1 || nRows >= len) {
			return s;
		}
		StringBuffer[] rows = new StringBuffer[nRows];
		int n = 0, step = 1;
		for (int i = 0; i < len; i++) {
			if (rows[n] == null) {
				rows[n] = new StringBuffer();
			}
			rows[n].append(s.charAt(i));
			if (n == 0) {
				step = 1;
			}
			if (n == nRows - 1) {
				step = -1;
			}
			n += step;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nRows; i++) {
			sb.append(rows[i]);
		}
		return sb.toString();
	}

}
