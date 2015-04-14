package dp;

import com.leetcode.oj.MaximumSubarrayTest;

public class MaximumSubarray extends MaximumSubarrayTest {
    @Override
    protected int maxSubArray(int[] array) {
        int r = Integer.MIN_VALUE, f = 0;
        for (int i = 0; i < array.length; ++i) {
            f = Math.max(f+array[i], array[i]);
            r = Math.max(r, f);
        }
        return r;
    }
}
