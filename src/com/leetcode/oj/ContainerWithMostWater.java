package com.leetcode.oj;

/**
 * Container With Most Water
 * 
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 * 
 * @author rekinyz
 */
public class ContainerWithMostWater {

	// O(N)
	public int maxArea(int[] height) {
		int maxArea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			maxArea = Math.max(Math.min(height[l], height[r]) * (r - l), maxArea);
			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}
		return maxArea;
	}

	// O(N²)
	public int maxArea1(int[] height) {
		int maxArea = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = 1; j < height.length; j++) {
				maxArea = Math.max(maxArea, Math.min(height[j], height[i]) * (j - i));
			}
		}
		return maxArea;
	}

}
