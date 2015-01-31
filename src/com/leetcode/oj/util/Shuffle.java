package com.leetcode.oj.util;

import java.util.Random;

/**
 * Implementing Fisher–Yates shuffle
 * 
 * @author rekinyz
 * @param <T>
 */
public class Shuffle<T> {
	
	public static <T> void shuffleArray(T[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			T a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
	
	public static void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
