package com.leetcode.oj;

import com.leetcode.oj.util.TreeNode;

/**
 * Symmetric Tree
 * 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree is symmetric:
 * 	 	1
 *     / \
 * 	  2   2
 *   / \ / \
 *	3  4 4  3
 *
 * But the following is not:
 * 
 *   1
 *  / \
 * 2   2
 *  \   \
 *  3    3
 *
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * 
 * @author rekinyz
 *
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if(root==null){
			return true;
		}
		return isSymmetric(root.left, root.right);
	}
	
	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left==null && right==null){
			return true;
		}
		if(left!=null && right==null || left==null && right!=null || left!=null && right!=null && left.val!=right.val){
			return false;
		}
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

	//reuse isSameTree() of Same Tree Problem
	public boolean isSymmetric1(TreeNode root) {
	  if(root==null){
			return true;
		}
		return isSameTree(exchangeLR(root.left),root.right);
	}
	
	private boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==q)
			return true; 
		if(p!=null && q==null || p==null && q!=null || p!=null && q!=null && p.val!=q.val){
			return false;
		}
	  return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
	private TreeNode exchangeLR(TreeNode root){
		if(root!=null ){
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			exchangeLR(root.left);
			exchangeLR(root.right);
		}
		return root;
	}
	
	//print the tree to get intuitive view
	public static void main(String[] args) {
		
		SymmetricTree tree = new SymmetricTree();
		
		Integer[] input1 = {1,2,2,3,4,4,3};
		TreeNode s1 = TreeNode.convert(input1);

		Integer[] input2 = {1,2,2,null,3,null,3};
		TreeNode s2 = TreeNode.convert(input2);
		
		Integer[] input3 = {};
		TreeNode s3 = TreeNode.convert(input3);
		
		Integer[] input4 = {1,2,2,null,3,3};
		TreeNode s4 = TreeNode.convert(input4);
		
		Integer[] input5 = {2,3,3,4,5,5,4,6,null,8,9,9,8,null,6};
		TreeNode s5 = TreeNode.convert(input5);
		
		Integer[] input6 = {1,null,2};
		TreeNode s6 = TreeNode.convert(input6);
		
		Integer[] input7 = {2,3,3,4,5,5};
		TreeNode s7 = TreeNode.convert(input7);
		
		TreeNode.print(s1);
		TreeNode.print(s2);
		TreeNode.print(s3);
		TreeNode.print(s4);
		TreeNode.print(s5);
		TreeNode.print(s6);
		TreeNode.print(s7);
		
		System.out.println(tree.isSymmetric(s1)); //true
		System.out.println(tree.isSymmetric(s2)); //false
		System.out.println(tree.isSymmetric(s3)); //true
		System.out.println(tree.isSymmetric(s4)); //true
		System.out.println(tree.isSymmetric(s5)); //true
		System.out.println(tree.isSymmetric(s6)); //false
		System.out.println(tree.isSymmetric(s7)); //false
	}

}
