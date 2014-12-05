package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class SameTreeTest {

	SameTree tree = new SameTree();

	@Test
	public void testIsSameTree1() {
		Integer[] p = { 1, -2, -3, 1, 3, -2, null, -1 };
		Integer[] q = { 1, -2, -3, 1, 3, -2, null, -1 };
		assertTrue(isSameTree(p, q));
	}

	@Test
	public void testIsSameTree2() {
		Integer[] p = { 1, -2, -3, 1, 3, -2, null, -1 };
		Integer[] q = { -2, null, -3 };
		assertFalse(isSameTree(p, q));
	}

	@Test
	public void testIsSameTree3() {
		Integer[] p = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		Integer[] q = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		assertFalse(isSameTree(p, q));
	}

	@Test
	public void testIsSameTree4() {
		Integer[] p = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		Integer[] q = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
		assertTrue(isSameTree(p, q));
	}

	@Test
	public void testIsSameTree5() {
		Integer[] p = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		Integer[] q = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
		assertTrue(isSameTree(p, q));
	}

	@Test
	public void testIsSameTree6() {
		Integer[] p = { 0 };
		Integer[] q = { 0 };
		assertTrue(isSameTree(p, q));
	}

	private boolean isSameTree(Integer[] p, Integer[] q) {
		TreeNode t1 = TreeNode.convert(p);
		TreeNode t2 = TreeNode.convert(q);
		return tree.isSameTree(t1, t2);
	}

}
