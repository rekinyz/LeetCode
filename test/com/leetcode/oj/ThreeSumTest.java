package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

	ThreeSum ts = new ThreeSum();

	private static final Comparator<List<Integer>> comp = new Comparator<List<Integer>>() {
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
	public void testThreeSum1() {
		int[] num = { -1, 0, 1, 2, -1, -4 };
		List<Integer> l1 = Arrays.asList(-1, 0, 1);
		List<Integer> l2 = Arrays.asList(-1, -1, 2);

		List<List<Integer>> expectedList = Arrays.asList(l1, l2);
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = threeSum(num);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	@Test
	public void testThreeSum2() {
		int[] num = { -1, 2, 0, 1 };
		List<Integer> l1 = Arrays.asList(-1, 0, 1);

		List<List<Integer>> expectedList = Arrays.asList(l1);
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = threeSum(num);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	@Test
	public void testThreeSum3() {
		int[] num = { -1, -4, 1, 2, -1 };
		List<Integer> l1 = Arrays.asList(-1, -1, 2);

		List<List<Integer>> expectedList = Arrays.asList(l1);
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = threeSum(num);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	@Test
	public void testThreeSum4() {
		int[] num = { 7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7,
				9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11, 2, -2,
				-5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5,
				-15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1,
				0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14, -10,
				0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7,
				-12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6 };
		List<Integer> l1 = Arrays.asList(-12, 5, 7);
		List<Integer> l2 = Arrays.asList(-5, 2, 3);
		List<Integer> l3 = Arrays.asList(-15, 5, 10);
		List<Integer> l4 = Arrays.asList(-13, 1, 12);
		List<Integer> l5 = Arrays.asList(-12, 6, 6);
		List<Integer> l6 = Arrays.asList(-9, -1, 10);
		List<Integer> l7 = Arrays.asList(-6, -4, 10);
		List<Integer> l8 = Arrays.asList(-7, 0, 7);
		List<Integer> l9 = Arrays.asList(-4, 2, 2);
		List<Integer> l10 = Arrays.asList(-7, -1, 8);
		List<Integer> l11 = Arrays.asList(-8, 4, 4);
		List<Integer> l12 = Arrays.asList(-9, 0, 9);
		List<Integer> l13 = Arrays.asList(-8, -4, 12);
		List<Integer> l14 = Arrays.asList(-10, 5, 5);
		List<Integer> l15 = Arrays.asList(-10, -4, 14);
		List<Integer> l16 = Arrays.asList(-11, 1, 10);
		List<Integer> l17 = Arrays.asList(-14, 6, 8);
		List<Integer> l18 = Arrays.asList(-12, 4, 8);
		List<Integer> l19 = Arrays.asList(-6, -5, 11);
		List<Integer> l20 = Arrays.asList(-11, -1, 12);
		List<Integer> l21 = Arrays.asList(-15, 4, 11);
		List<Integer> l22 = Arrays.asList(-13, 0, 13);
		List<Integer> l23 = Arrays.asList(-7, 1, 6);
		List<Integer> l24 = Arrays.asList(-9, 1, 8);
		List<Integer> l25 = Arrays.asList(-10, 4, 6);
		List<Integer> l26 = Arrays.asList(-13, -1, 14);
		List<Integer> l27 = Arrays.asList(-8, -5, 13);
		List<Integer> l28 = Arrays.asList(-11, 0, 11);
		List<Integer> l29 = Arrays.asList(-14, 7, 7);
		List<Integer> l30 = Arrays.asList(-6, 2, 4);
		List<Integer> l31 = Arrays.asList(-5, 0, 5);
		List<Integer> l32 = Arrays.asList(-15, 7, 8);
		List<Integer> l33 = Arrays.asList(-13, 3, 10);
		List<Integer> l34 = Arrays.asList(-3, -1, 4);
		List<Integer> l35 = Arrays.asList(-6, -6, 12);
		List<Integer> l36 = Arrays.asList(-12, 3, 9);
		List<Integer> l37 = Arrays.asList(-7, -6, 13);
		List<Integer> l38 = Arrays.asList(-7, 2, 5);
		List<Integer> l39 = Arrays.asList(-10, 3, 7);
		List<Integer> l40 = Arrays.asList(-9, 2, 7);
		List<Integer> l41 = Arrays.asList(-3, 0, 3);
		List<Integer> l42 = Arrays.asList(-8, 2, 6);
		List<Integer> l43 = Arrays.asList(-5, -1, 6);
		List<Integer> l44 = Arrays.asList(-11, 3, 8);
		List<Integer> l45 = Arrays.asList(-14, 0, 14);
		List<Integer> l46 = Arrays.asList(-8, -6, 14);
		List<Integer> l47 = Arrays.asList(-5, 1, 4);
		List<Integer> l48 = Arrays.asList(-6, 3, 3);
		List<Integer> l49 = Arrays.asList(-15, 6, 9);
		List<Integer> l50 = Arrays.asList(-13, 2, 11);
		List<Integer> l51 = Arrays.asList(-4, -4, 8);
		List<Integer> l52 = Arrays.asList(-12, 2, 10);
		List<Integer> l53 = Arrays.asList(-7, -7, 14);
		List<Integer> l54 = Arrays.asList(-7, 3, 4);
		List<Integer> l119 = Arrays.asList(-1, -1, 2);
		List<Integer> l55 = Arrays.asList(-1, 0, 1);
		List<Integer> l56 = Arrays.asList(-10, 2, 8);
		List<Integer> l57 = Arrays.asList(-9, 3, 6);
		List<Integer> l58 = Arrays.asList(-8, 3, 5);
		List<Integer> l59 = Arrays.asList(-3, 1, 2);
		List<Integer> l60 = Arrays.asList(-11, 2, 9);
		List<Integer> l61 = Arrays.asList(-14, 1, 13);
		List<Integer> l62 = Arrays.asList(-12, 1, 11);
		List<Integer> l63 = Arrays.asList(-9, 4, 5);
		List<Integer> l64 = Arrays.asList(-15, 1, 14);
		List<Integer> l65 = Arrays.asList(-9, -5, 14);
		List<Integer> l66 = Arrays.asList(-7, -4, 11);
		List<Integer> l67 = Arrays.asList(-10, 1, 9);
		List<Integer> l68 = Arrays.asList(-8, -1, 9);
		List<Integer> l69 = Arrays.asList(-8, 0, 8);
		List<Integer> l70 = Arrays.asList(-5, -3, 8);
		List<Integer> l71 = Arrays.asList(-4, -3, 7);
		List<Integer> l72 = Arrays.asList(-13, 6, 7);
		List<Integer> l73 = Arrays.asList(-6, 1, 5);
		List<Integer> l74 = Arrays.asList(-11, 5, 6);
		List<Integer> l75 = Arrays.asList(-14, 2, 12);
		List<Integer> l76 = Arrays.asList(-12, 0, 12);
		List<Integer> l77 = Arrays.asList(-6, -1, 7);
		List<Integer> l78 = Arrays.asList(-9, -4, 13);
		List<Integer> l79 = Arrays.asList(-7, -5, 12);
		List<Integer> l80 = Arrays.asList(-10, 0, 10);
		List<Integer> l81 = Arrays.asList(-5, -2, 7);
		List<Integer> l82 = Arrays.asList(-8, 1, 7);
		List<Integer> l83 = Arrays.asList(-10, -1, 11);
		List<Integer> l84 = Arrays.asList(-2, -2, 4);
		List<Integer> l85 = Arrays.asList(-3, -2, 5);
		List<Integer> l86 = Arrays.asList(-6, 0, 6);
		List<Integer> l87 = Arrays.asList(-11, 4, 7);
		List<Integer> l88 = Arrays.asList(-4, -2, 6);
		List<Integer> l89 = Arrays.asList(-14, 3, 11);
		List<Integer> l90 = Arrays.asList(-12, -1, 13);
		List<Integer> l91 = Arrays.asList(-9, -3, 12);
		List<Integer> l92 = Arrays.asList(-15, 3, 12);
		List<Integer> l93 = Arrays.asList(-4, 0, 4);
		List<Integer> l94 = Arrays.asList(-6, -2, 8);
		List<Integer> l95 = Arrays.asList(-7, -2, 9);
		List<Integer> l96 = Arrays.asList(-8, -3, 11);
		List<Integer> l97 = Arrays.asList(-2, 0, 2);
		List<Integer> l98 = Arrays.asList(-10, -2, 12);
		List<Integer> l99 = Arrays.asList(-2, -1, 3);
		List<Integer> l100 = Arrays.asList(-14, 4, 10);
		List<Integer> l101 = Arrays.asList(-4, -1, 5);
		List<Integer> l102 = Arrays.asList(-13, 4, 9);
		List<Integer> l103 = Arrays.asList(-12, -2, 14);
		List<Integer> l104 = Arrays.asList(-11, -2, 13);
		List<Integer> l105 = Arrays.asList(-5, -5, 10);
		List<Integer> l106 = Arrays.asList(-6, -3, 9);
		List<Integer> l107 = Arrays.asList(-9, -2, 11);
		List<Integer> l108 = Arrays.asList(-15, 2, 13);
		List<Integer> l109 = Arrays.asList(-4, 1, 3);
		List<Integer> l110 = Arrays.asList(-8, -2, 10);
		List<Integer> l111 = Arrays.asList(-2, 1, 1);
		List<Integer> l112 = Arrays.asList(-7, -3, 10);
		List<Integer> l113 = Arrays.asList(-5, -4, 9);
		List<Integer> l114 = Arrays.asList(-10, -3, 13);
		List<Integer> l115 = Arrays.asList(0, 0, 0);
		List<Integer> l116 = Arrays.asList(-14, 5, 9);
		List<Integer> l117 = Arrays.asList(-11, -3, 14);
		List<Integer> l118 = Arrays.asList(-13, 5, 8);

		List<List<Integer>> expectedList = Arrays.asList(l1, l2, l3, l4, l5,
				l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18,
				l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30,
				l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42,
				l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53, l54,
				l119, l55, l56, l57, l58, l59, l60, l61, l62, l63, l64, l65,
				l66, l67, l68, l69, l70, l71, l72, l73, l74, l75, l76, l77,
				l78, l79, l80, l81, l82, l83, l84, l85, l86, l87, l88, l89,
				l90, l91, l92, l93, l94, l95, l96, l97, l98, l99, l100, l101,
				l102, l103, l104, l105, l106, l107, l108, l109, l110, l111,
				l112, l113, l114, l115, l116, l117, l118);
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = threeSum(num);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	@Test
	public void testThreeSum5() {
		int[] num = {};

		List<List<Integer>> expectedList = Arrays.asList();
		Collections.sort(expectedList, comp);
		List<List<Integer>> resList = threeSum(num);
		Collections.sort(resList, comp);

		assertEquals(expectedList, resList);
	}

	private List<List<Integer>> threeSum(int[] num) {
		return ts.threeSum(num);
	}

}
