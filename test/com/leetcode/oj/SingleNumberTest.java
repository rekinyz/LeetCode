package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class SingleNumberTest {

	SingleNumber sn = new SingleNumber();

	@Test
	public void testSingleNumber0() {
		int[] input = { 1, 1, 2, 3, 4, 3, 2, 4, 7, 5, 5 };
		assertEquals(7, singleNumber(input));
	}

	@Test
	public void testSingleNumber1() {
		int[] input = { 1, 2, 1 };
		assertEquals(2, singleNumber(input));
	}

	@Test
	public void testSingleNumber2() {
		int[] input = { 1, 1, 2, 3, 4, 3, 2, 4, 7, 5, 5 };
		assertEquals(7, singleNumber(input));
	}

	@Test
	public void testSingleNumber3() {
		int[] input = { 1, 2, 1 };
		assertEquals(2, singleNumber(input));
	}

	@Test
	public void testSingleNumber4() {
		int target = 3;
		int[] input = generateInput(target); // 0,0,1,1,2,2,3 with random order
		assertEquals(target, singleNumber(input));
	}
	
	@Test
	public void testSingleNumber5() {
		int target = 132;
		int[] input = generateInput(target);
		assertEquals(target, singleNumber(input));
	}
	
	@Test
	public void testSingleNumber6() {
		int target = 200000;
		int[] input = generateInput(target);
		assertEquals(target, singleNumber(input));
	}

	private int[] generateInput(int n) {
		int[] res = new int[2 * n + 1];
		int i = 0, j = 0;
		for (; i < n; i++, j++) {
			res[i] = j;
		}
		j--;
		for (; i < 2 * n; i++, j--) {
			res[i] = j;
		}
		res[2 * n] = n;
		shuffleArray(res);
		return res;
	}

	// Implementing Fisher–Yates shuffle
	private void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	private int singleNumber(int[] A) {
		return sn.singleNumber(A);
	}

}
