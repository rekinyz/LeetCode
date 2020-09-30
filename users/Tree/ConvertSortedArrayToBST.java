package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class ConvertSortedArrayToBST {
    private static int[] a;
    public static TreeNode run(int[] a) {
        ConvertSortedArrayToBST.a = a;
        return run(0, a.length);
    }
    private static TreeNode run(int first, int last) {
        int length = last - first;
        if (length <=0) return null;
        int mid = first + length/2;
        TreeNode root = new TreeNode(a[mid]);
        root.left = run(first, mid);
        root.right = run(mid+1, last);
        return root;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
