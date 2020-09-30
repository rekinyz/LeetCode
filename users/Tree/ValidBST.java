package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class ValidBST {
    public static boolean run(TreeNode root) {
        return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean valid(TreeNode root, int min, int max) {
        if (root == null) return true;
        return root.val > min && root.val < max &&
                valid(root.left, min, root.val) &&
                valid(root.right, root.val, max);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
