package com.leetcode.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anagrams
 * 
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * earth = heart; 
 * roll in the hay = thrill a honey; 
 * james stuart = just a master;
 * 
 * @author rekinyz
 *
 */
public class Anagrams {

	public List<String> anagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
			Arrays.sort(chars);
			String sorted = String.valueOf(chars).replaceAll(" ", "");
			List<String> list = map.get(sorted);
			if (list != null) {
				list.add(strs[i]);
			} else {
				List<String> val = new ArrayList<String>();
				val.add(strs[i]);
				map.put(sorted, val);
			}
		}
		List<String> res = new ArrayList<String>();
		for (String s : map.keySet()) {
			List<String> list = map.get(s);
			if (list.size() > 1) {
				res.addAll(list);
			}
		}
		return res;
	}

}
