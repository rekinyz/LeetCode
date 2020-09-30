package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainerWithMostWaterTest {

	ContainerWithMostWater cmw = new ContainerWithMostWater();

	@Test
	public void testMaxArea1() {
		int[] height = { 1, 3, 4, 2 }; // 2*2
		assertEquals(4, maxArea(height));
	}

	@Test
	public void testMaxArea2() {
		int[] height = { 1, 3, 4, 2, 4 }; // 3*3
		assertEquals(9, maxArea(height));
	}

	@Test
	public void testMaxArea3() {
		int[] height = { 1, 2, 8, 9, 1, 1, 1, 1, 1, 1, 2 }; // 2*9
		assertEquals(18, maxArea(height));
	}

	@Test
	public void testMaxArea4() {
		int[] height = { 9, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1 }; // 3*6
		assertEquals(18, maxArea(height));
	}

	@Test
	public void testMaxArea5() {
		int[] height = { 0, 2 }; // 0*1
		assertEquals(0, maxArea(height));
	}

	@Test
	public void testMaxArea6() {
		int[] height = { 1, 1, 1, 1, 2, 1, 1, 1, 1 }; // 1*8
		assertEquals(8, maxArea(height));
	}

	@Test
	public void testMaxArea7() {
		int[] height = { 1, 1, 1, 9, 9, 1, 1, 1, 1 }; // 1*9
		assertEquals(9, maxArea(height));
	}

	@Test
	public void testMaxArea8() {
		int[] height = { 76, 155, 15, 188, 180, 154, 84, 34, 187, 142, 22, 5,
				27, 183, 111, 128, 50, 58, 2, 112, 179, 2, 100, 111, 115, 76,
				134, 120, 118, 103, 31, 146, 58, 198, 134, 38, 104, 170, 25,
				92, 112, 199, 49, 140, 135, 160, 20, 185, 171, 23, 98, 150,
				177, 198, 61, 92, 26, 147, 164, 144, 51, 196, 42, 109, 194,
				177, 100, 99, 99, 125, 143, 12, 76, 192, 152, 11, 152, 124,
				197, 123, 147, 95, 73, 124, 45, 86, 168, 24, 34, 133, 120, 85,
				81, 163, 146, 75, 92, 198, 126, 191 };
		assertEquals(18048, maxArea(height));
	}

	protected int maxArea(int[] height) {
		return cmw.maxArea(height);
	}
}
