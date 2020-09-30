package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class FourSumTest {

	FourSum fs = new FourSum();

	private static final Comparator<List<Integer>> comp = new Comparator<List<Integer>>() {
		@Override
        public int compare(List<Integer> o1, List<Integer> o2) {
			if (o1 != null && o2 != null) {
				int i = 0;
				while (o1.get(i) == o2.get(i)) {
					i++;
				}
				return o1.get(i).compareTo(o2.get(i));
			}
			return 0;
		}
	};

	@Test
	public void testfourSum1() {
		int[] num = { 1, 0, -1, 0, -2, 2 };
		List<Integer> l1 = Arrays.asList(-1, 0, 0, 1);
		List<Integer> l2 = Arrays.asList(-2, -1, 1, 2);
		List<Integer> l3 = Arrays.asList(-2, 0, 0, 2);
		int target = 0;

		List<List<Integer>> expectedList = Arrays.asList(l1, l2, l3);
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = fourSum(num, target);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	@Test
	public void testfourSum2() {
		int[] num = {};
		int target = 0;

		List<List<Integer>> expectedList = Arrays.asList();
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = fourSum(num, target);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	protected List<List<Integer>> fourSum(int[] num, int target) {
		return fs.fourSum(num, target);
	}

}
