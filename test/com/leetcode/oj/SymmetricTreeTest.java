package com.leetcode.oj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class SymmetricTreeTest {
	
	SymmetricTree tree = new SymmetricTree();
	
    @Test
    public void testIsSymmetric1() {
    	Integer[] a = {1,2,2,3,4,4,3};
    	assertTrue(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric2() {
    	Integer[] a = {1,2,2,null,3,null,3};
    	assertFalse(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric3() {
    	Integer[] a = {};
    	assertTrue(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric4() {
    	Integer[] a = {1,2,2,null,3,3};
    	assertTrue(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric5() {
    	Integer[] a = {2,3,3,4,5,5,4,6,null,8,9,9,8,null,6};
    	assertTrue(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric6() {
    	Integer[] a = {1,null,2};
    	assertFalse(isSymmetric(a));
    }
    @Test
    public void testIsSymmetric7() {
    	Integer[] a = {2,3,3,4,5,5};
    	assertFalse(isSymmetric(a));
    }
    
    private boolean isSymmetric(Integer[] a) {
    	TreeNode node = TreeNode.convert(a);
    	return tree.isSymmetric(node);
    }
   
}
