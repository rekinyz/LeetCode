package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;
/*
 * 先序flatten, right是左节点，或 父节点的right, left（单链表就不用了）
 */
public class FlattenBinaryTreeToLinkedList {
    public static TreeNode run(TreeNode root, TreeNode tail) {
        if (root == null) {
            return tail;
        }
        root.right = run(root.left, run(root.right, tail));
        root.left = null;
        return root;
    }
   
    public static TreeNode run(TreeNode root) {
        return run(root, null);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
