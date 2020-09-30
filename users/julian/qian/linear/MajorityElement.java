package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;
/********************************************************************************** 
 * 
 * Given an array of size n, find the majority element. The majority element 
 * is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 *               
 **********************************************************************************/

public class MajorityElement {
 // Moore Voting Algorithm
 // Refer to: 
 // http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
    public static int moore(int[] n) {
        int m=0, cnt=0;
        for (int i :n) {
            if (cnt==0) {
               m = i;
               ++cnt;
            } else {
                if (m == i) {
                    cnt++; 
                } else {
                    // 因为一定有一个数占一半以上，所以可以--，相等于vote NO，如果不是大的数，
                    // 一定会到0，重新选，就算选上的不是大数，也会被选下
                    cnt--;
                }
                if (cnt >= n.length/2 +1) return m;
            }
        }
        return m;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
