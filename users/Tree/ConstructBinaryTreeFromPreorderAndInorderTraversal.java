package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private static int[] pre;
    private static int[] in;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in = inorder;
        return buildTree(0, preorder.length, 0, in.length);
    }
    private static TreeNode buildTree(int pFirst, int pLast, int iFirst, int iLast) {
        if (pFirst == pLast) return null;
        if (iFirst == iLast) return null;
        TreeNode root = new TreeNode(pre[pFirst]);
        TreeNode inRootPos;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}

