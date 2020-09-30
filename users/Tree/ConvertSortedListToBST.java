package Tree;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;

public class ConvertSortedListToBST {
    private static List<Integer> a;
    private static ListIterator<Integer> parent;
    public static TreeNode run(List<Integer> a) {
        ConvertSortedListToBST.a = a;
        parent = a.listIterator();
        return run(0, a.size()-1); // why?
    }
    private static TreeNode run(int start, int end) {
        if (start > end) return null;
        int mid = (start + end)/2;
        TreeNode left = run(start, mid-1);
        TreeNode p = new TreeNode(parent.next());//java iterator next 相当于 c的取数 和指针移动一位
        p.left = left;
        p.right = run(mid+1, end);
        return p;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
