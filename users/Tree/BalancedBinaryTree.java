package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;
/*
 * a height-balanced binary tree is defined as a binary tree in which the depth of the two
subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
    public static boolean run(TreeNode root) {
        return hight(root) > 0;
    }
    public static int hight(TreeNode root) {
        if (root == null) return 0;
        int left = hight(root.left);
        int right = hight(root.right);
        if (left < 0 || right < 0 || Math.abs(left-right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
