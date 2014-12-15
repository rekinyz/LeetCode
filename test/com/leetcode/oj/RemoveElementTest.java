package com.leetcode.oj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElementTest {

	RemoveElement re = new RemoveElement();

	@Test
	public void testRemoveElement1() {
		int[] input = { 1 };
		int[] output = { 1 };
		assertEquals(removeElement(input, 1), 0);
		assertTrue(Arrays.equals(input, output));
	}

	@Test
	public void testRemoveElement2() {
		int[] input = { 4, 5 };
		int[] output = { 5, 5 };
		assertEquals(removeElement(input, 4), 1);
		assertTrue(Arrays.equals(input, output));
	}

	@Test
	public void testRemoveElement3() {
		int[] input = { 2 };
		int[] output = { 2 };
		assertEquals(removeElement(input, 3), 1);
		assertTrue(Arrays.equals(input, output));
	}

	@Test
	public void testRemoveElement4() {
		int[] input = { 2, 4, 2, 2, 5, 6 };
		int[] output = { 4, 5, 6, 2, 5, 6 };
		assertEquals(removeElement(input, 2), 3);
		assertTrue(Arrays.equals(input, output));
	}
	
	@Test
	public void testRemoveElement5() {
		int[] input = { 2, 4, 2, 2, 6, 6 };
		int[] output = { 2, 4, 2, 2, 6, 6 };
		assertEquals(removeElement(input, 6), 4);
		assertTrue(Arrays.equals(input, output));
	}
	
	@Test
	public void testRemoveElement6() {
		int[] input = { 4, 4, 5, 4, 3, 4 };
		int[] output = { 5, 3, 5, 4, 3, 4 };
		assertEquals(removeElement(input, 4), 2);
		assertTrue(Arrays.equals(input, output));
	}

	private int removeElement(int[] A, int elem) {
		return re.removeElement(A, elem);
	}
}
