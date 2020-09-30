package julian.qian.linear;

import com.leetcode.oj.SingleNumberTest;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber extends SingleNumberTest {
    @Override
    public int singleNumber(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; ++i) {
            x ^= a[i];
        }
        return x;
    }

}
