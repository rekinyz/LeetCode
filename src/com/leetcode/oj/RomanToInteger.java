package com.leetcode.oj;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral, convert it to an integer.
 * 
 * I(1), V(5), X(10), L(50), C(100), D(500) and M(1000)
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author rekinyz
 *
 */
public class RomanToInteger {

	public int romanToInt(String s) {
		// validation of the roman numeral
		if (!s.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int sum = 0;
		int len = s.length() - 1;
		for (int i = 0; i < len; i++) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				sum -= map.get(s.charAt(i));
			} else {
				sum += map.get(s.charAt(i));
			}
		}
		return sum += map.get(s.charAt(len));
	}

}
