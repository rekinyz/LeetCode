package Tree;

import com.leetcode.oj.MaximumDepthOfBinaryTreeTest;
import com.leetcode.oj.util.TreeNode;

public class MaximumDepthOfBinaryTree extends MaximumDepthOfBinaryTreeTest {
    protected static int recursive(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(recursive(root.left),
                recursive(root.right));
    }
    @Override
    protected int maxDepth(Integer[] input) {
        TreeNode root = TreeNode.convert(input);
        return recursive(root);
    }
}
