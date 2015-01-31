package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.oj.util.Shuffle;

public class SingleNumber2Test {

	SingleNumber2 sn = new SingleNumber2();

	@Test
	public void testSingleNumber0() {
		int[] input = { 1, 3, 1, 2, 1, 3, 4, 2, 4, 3, 2, 4, 5, 7, 5, 5 };
		assertEquals(7, singleNumber(input));
	}

	@Test
	public void testSingleNumber1() {
		int[] input = { 1, 1, 2, 1 };
		assertEquals(2, singleNumber(input));
	}

	@Test
	public void testSingleNumber2() {
		int[] input = { 1, 3, 1, 2, 1, 3, 4, 2, 4, 3, 2, 4, 5, 7, 5, 5 };
		assertEquals(7, singleNumber(input));
	}

	@Test
	public void testSingleNumber3() {
		int[] input = { 1, 1, 2, 1 };
		assertEquals(2, singleNumber(input));
	}
	
	@Test
	public void testSingleNumber4() {
		int target = 3;
		int[] input = generateInput(target); // 0,0,0,1,1,1,2,2,2,3 with random order
		assertEquals(target, singleNumber(input));
	}
	
	@Test
	public void testSingleNumber5() {
		int target = 234093;
		int[] input = generateInput(target);
		assertEquals(target, singleNumber(input));
	}
	
	private int[] generateInput(int n) {
		int[] res = new int[3 * n + 1];
		int i = 0, j = 0;
		for (; i < n; i++, j++) {
			res[i] = j;
		}
		j--;
		for (; i < 2 * n; i++, j--) {
			res[i] = j;
		}
		j++;
		for (; i < 3 * n; i++, j++) {
			res[i] = j;
		}
		res[3 * n] = n;
		Shuffle.shuffleArray(res);
		return res;
	}

	private int singleNumber(int[] A) {
		return sn.singleNumber(A);
	}
	
}
