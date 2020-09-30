package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;
/********************************************************************************** 
* 
* A peak element is an element that is greater than its neighbors.
* 
* Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
* 
* You may imagine that num[-1] = num[n] = -∞.
* 
* For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
* 
* click to show spoilers.
* 
* Note:
* Your solution should be in logarithmic complexity.
* 
* Credits:Special thanks to @ts for adding this problem and creating all test cases.
*               
**********************************************************************************/
/*
 *    Binary search is common idea here.
 *
 *    However, you need to think about two senarios:
 *
 *    1) Becasue we need check `num[mid-1]`, `num[mid]`, `num[mid+1]`, 
 *       So, we need make sure there hasn't out-of-boundary issue.
 *   
 *
 *
 *    2) There are multiple Peak elements.
 *
 *       For example: [1,2,1,2,1], or [ 1,2,3,1,2,1]
 *
 *       LeetCode doesn't tell you what the expected result is. I guess:
 *
 *       2.1) for [1,2,1,2,1] you can return either 1 or 3, because both them are peak elements
 *
 *       2.1) for [1,2,3,2,4,2,1] it should return 4, because num[4] is the real peak.
 *         but Leetcode accept either 2 or 4
 *
 */

public class FindPeekElement {
    public static int run(int[] n) {
        int low = 0, high = n.length -1;
        int m = 0;
        while (low < high) {
            m = (low + high) /2;
            if ((m==0||n[m] > n[m-1]) && (m==n.length-1 || n[m]>n[m+1])) {
                return m;
            }
            if (m > 0 && n[m-1] > n[m]) {
                high = m-1;
            } else {
                low = m+1;
            }
        }
        return low;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
