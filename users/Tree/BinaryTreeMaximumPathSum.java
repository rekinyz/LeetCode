package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class BinaryTreeMaximumPathSum {
    private static int max = Integer.MAX_VALUE;
    public static int run(TreeNode root) {
        dfs(root);
        return max;
    }
    public static int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int sum = root.val;
        if (left > 0) sum +=left;
        if (right > 0) sum += right;
        max = Math.max(max, sum);
        int x = Math.max(right, left);
        return x > 0 ? x + root.val: root.val;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
