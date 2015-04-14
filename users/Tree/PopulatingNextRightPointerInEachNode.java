package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

public class PopulatingNextRightPointerInEachNode {
    public static class TreeLinkNode {
        public TreeLinkNode next;
        public TreeLinkNode left;
        public TreeLinkNode right;
    }
    public static void runfullbingtree(TreeLinkNode root) {
        runfullbingtree(root, null);
    }
    public static void runfullbingtree(TreeLinkNode root, TreeLinkNode sibling) {
        if (root == null) {
            return;
        } else {
            root.next = null;
        }
        runfullbingtree(root.left, root.right);
        if (sibling!= null) {
            runfullbingtree(root.right, sibling.left);
        }else {
            runfullbingtree(root.right, null);
        }
    }
    public static void run(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode dummy = new TreeLinkNode();
        for (TreeLinkNode cur = root, prev = dummy; cur != null; cur=cur.next) {
            if (cur.left != null) {
                prev.next = cur.left;
                prev = prev.next;
            }
            if (cur.right != null) {
                prev.next = cur.right;
                prev = prev.next;
            }
        }
        run(dummy.next);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
