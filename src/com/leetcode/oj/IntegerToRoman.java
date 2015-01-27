package com.leetcode.oj;

import java.util.Collections;
import java.util.TreeMap;


/**
 * Integer to Roman
 * 
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author rekinyz
 */
public class IntegerToRoman {

	public String intToRoman(int num) {
		StringBuilder roman = new StringBuilder("");
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		for (Integer i: map.keySet()) {
			for (int j = 1; j <= num / i; j++) {
				roman.append(map.get(i));
			}
			num %= i;
		}
		return roman.toString();
	}
	
	/*another solution*/
	public String intToRoman1(int num) {
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}

}
