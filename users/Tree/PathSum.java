package Tree;

import com.leetcode.oj.PathSumTest;
import com.leetcode.oj.util.TreeNode;
/*
 * 节点的数据是否正整数，如果是，中间出现负数可以减
 */
public class PathSum extends PathSumTest {
    protected boolean run(TreeNode root, int sum) {
        if (root == null) return sum==0;
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return run(root.left, sum-root.val) || run(root.right, sum-root.val);
    }
    @Override
    protected boolean hasPathSum(Integer[] input, int sum) {
        TreeNode root = TreeNode.convert(input);
        return run(root, sum);
    }

}
