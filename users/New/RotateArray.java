package New;
/********************************************************************************** 
* 
* Rotate an array of n elements to the right by k steps.
* For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
* 
* Note:
* Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
* 
* Hint:
* Could you do it in-place with O(1) extra space?
* 
* Related problem: Reverse Words in a String II
* 
* Credits:Special thanks to @Freezen for adding this problem and creating all test cases.
* 问K的value可能超过n吗
*               
**********************************************************************************/
import static org.junit.Assert.fail;

import org.junit.Test;

public class RotateArray {
    public static void reverse(int[] n, int start, int end) {
        int t;
        while(start < end) {
            t = n[start];
            n[start] = n[end];
            n[end] = t;
            start++;
            end--;
        }
    }
    /* XY 要变成YX，可以X reverse, Y reverse, 整体再reverse, 类似 reverse words in string.
     *
     * obviously, the algorithm consumes O(1) space and O(n) time
     */
    public static void run1(int[] n, int k) {
        if (k <= 0) return;
        k %=n.length;
        int m = n.length;
        reverse(n, 0, m-k-1);
        reverse(n,m-k, m-1);
        reverse(n,0,m-1);
    }
    
    /*
     * How to change [0,1,2,3,4,5,6] to [4,5,6,0,1,2,3] by k = 3?
     *
     * We can change by following rules: 
     *
     *     [0]->[3], [3]->[6], [6]->[2],  [2]->[5], [5]->[1], [1]->[4]
     *    
     *
     */
    public static void run2(int[] n, int k) {
        if (k <= 0) return;
        k %=n.length;
        int curIdx = 0, newIdx = k;
        int tmp1 = n[curIdx];
        int origin = 0;
        for (int i = 0; i < n.length; ++i) {
            int tmp2 = n[newIdx];
            n[newIdx] = tmp1;
            tmp1 = tmp2;
            curIdx = newIdx;
            if (origin == curIdx) {
                origin = curIdx + 1;
                curIdx = origin;
                tmp1 = n[curIdx];
            }
            newIdx = (curIdx + k) % n.length;
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
