package com.leetcode.oj.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for binary tree
 * 
 * @author rekinyz
 */
public class TreeNode {
	public TreeNode left, right;
	public int val;

	public TreeNode(int val) {
		this.val = val;
	}

	public static TreeNode convert(Integer[] array) {
		TreeNode root = createTreeNode(array, 1);
		return root;
	}

	private static TreeNode createTreeNode(Integer[] input, int index) {
		if (index <= input.length) {
			Integer value = input[index - 1];
			if (value != null) {
				TreeNode t = new TreeNode(value);
				t.left = createTreeNode(input, index * 2);
				t.right = createTreeNode(input, index * 2 + 1);
				return t;
			}
		}
		return null;
	}

	public static void print(TreeNode root) {
		int maxLevel = maxLevel(root);

		printTreeNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static void printTreeNodeInternal(List<TreeNode> TreeNodes, int level, int maxLevel) {
		if (TreeNodes.isEmpty() || isAllElementsNull(TreeNodes))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		printWhitespaces(firstSpaces);

		List<TreeNode> newTreeNodes = new ArrayList<TreeNode>();
		for (TreeNode treeNode : TreeNodes) {
			if (treeNode != null) {
				System.out.print(treeNode.val);
				newTreeNodes.add(treeNode.left);
				newTreeNodes.add(treeNode.right);
			} else {
				newTreeNodes.add(null);
				newTreeNodes.add(null);
				System.out.print(" ");
			}

			printWhitespaces(betweenSpaces);
		}
		System.out.println(" ");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < TreeNodes.size(); j++) {
				printWhitespaces(firstSpaces - i);
				if (TreeNodes.get(j) == null) {
					printWhitespaces(2 * endgeLines + i + 1);
					continue;
				}

				if (TreeNodes.get(j).left != null)
					System.out.print("/");
				else
					printWhitespaces(1);

				printWhitespaces(2 * i - 1);

				if (TreeNodes.get(j).right != null)
					System.out.print("\\");
				else
					printWhitespaces(1);

				printWhitespaces(2 * endgeLines - i);
			}

			System.out.println("");
		}

		printTreeNodeInternal(newTreeNodes, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private static int maxLevel(TreeNode TreeNode) {
		if (TreeNode == null)
			return 0;

		return Math.max(maxLevel(TreeNode.left), maxLevel(TreeNode.right)) + 1;
	}

	private static boolean isAllElementsNull(List<TreeNode> list) {
		for (TreeNode node : list) {
			if (node != null)
				return false;
		}

		return true;
	}
}
