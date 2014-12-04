package com.leetcode.oj;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
	
	MedianOfTwoSortedArrays array = new MedianOfTwoSortedArrays();
	private final double epsilon = 1e-15;
	
    @Test
    public void testFindMin1() {
    	int[] input1 = {0, 1, 2};
    	int[] input2 = {2, 3};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 2.0, epsilon);
    }
    @Test
    public void testFindMin2() {
    	int[] input1 = {2, 3};
    	int[] input2 = {5, 6, 7};
        assertEquals(array.findMedianSortedArrays(input1,input2), 5.0, epsilon);
    }
    @Test
    public void testFindMin3() {
    	int[] input1 = {1, 2, 3, 4};
    	int[] input2 = {5, 6, 7, 8};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 4.5, epsilon);
    }
    @Test
    public void testFindMin4() {
    	int[] input1 = {5, 6, 7, 8};
    	int[] input2 = {};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 6.5, epsilon);
    }
    @Test
    public void testFindMin5() {
    	int[] input1 = {0, 1, 2};
    	int[] input2 = {};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 1.0, epsilon);
    }
    @Test
    public void testFindMin6() {
    	int[] input1 = {1};
    	int[] input2 = {1};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 1.0, epsilon);
    }
    @Test
    public void testFindMin7() {
    	int[] input1 = {};
    	int[] input2 = {2,3};
    	assertEquals(array.findMedianSortedArrays(input1,input2), 2.5, epsilon);
    }
}
