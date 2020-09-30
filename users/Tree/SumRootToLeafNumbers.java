package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class SumRootToLeafNumbers {
    public int run(TreeNode root) {
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int sum) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return sum*10 + root.val;
        }
        int curSum = sum* 10 + root.val;
        return dfs(root.left, curSum) + dfs(root.right, curSum);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
