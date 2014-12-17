package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

	MedianOfTwoSortedArrays motsa = new MedianOfTwoSortedArrays();
	private final double epsilon = 1e-15;

	@Test
	public void testFindMin1() {
		int[] input1 = { 0, 1, 2 };
		int[] input2 = { 2, 3 };
		assertEquals(2.0, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin2() {
		int[] input1 = { 2, 3 };
		int[] input2 = { 5, 6, 7 };
		assertEquals(5.0, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin3() {
		int[] input1 = { 1, 2, 3, 4 };
		int[] input2 = { 5, 6, 7, 8 };
		assertEquals(4.5, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin4() {
		int[] input1 = { 5, 6, 7, 8 };
		int[] input2 = {};
		assertEquals(6.5, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin5() {
		int[] input1 = { 0, 1, 2 };
		int[] input2 = {};
		assertEquals(1.0, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin6() {
		int[] input1 = { 1 };
		int[] input2 = { 1 };
		assertEquals(1.0, findMedianSortedArrays(input1, input2), epsilon);
	}

	@Test
	public void testFindMin7() {
		int[] input1 = {};
		int[] input2 = { 2, 3 };
		assertEquals(2.5, findMedianSortedArrays(input1, input2), epsilon);
	}
	
	private double findMedianSortedArrays(int[] input1, int[] input2){
		return motsa.findMedianSortedArrays(input1, input2);
	}
}
