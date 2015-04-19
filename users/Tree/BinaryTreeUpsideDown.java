package Tree;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.leetcode.oj.util.TreeNode;
/********************************************************************************** 
* Given a binary tree where all the right nodes are either leaf nodes with 
* a sibling (a left node that shares the same parent node) or empty, 
* 
* Flip it upside down and turn it into a tree where the original right nodes turned into left leaf nodes. 
* Return the new root.
* 
* For example:
* Given a binary tree {1,2,3,4,5},
*     1
*    / \
*   2   3
*  / \
* 4   5
* return the root of the binary tree [4,5,2,#,#,3,1].
*    4
*   / \
*  5   2
*     / \
*    3   1  
* confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ. 
* 
**********************************************************************************/

public class BinaryTreeUpsideDown {
    public static TreeNode run(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        TreeNode head = dummy, left = null, right = null;
        while(root != null) {
            left = root.right;
            right = root;
            // root 要到左边，最左边的节点是新的root
            root = root.left;
            right.left = head.left;
            right.right = head.right;
            
            dummy.right = right;
            dummy.left = left;
            
            head = dummy;
        }
        return head.right;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
