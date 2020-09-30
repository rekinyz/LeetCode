package greedy;

import com.leetcode.oj.ContainerWithMostWaterTest;
/*
 * 算面积，从两边开始算，这样宽度最大，同时往里缩小的时候，高度低的先缩小
 */
public class ContainerWithMostWater extends ContainerWithMostWaterTest {
    @Override
    protected int maxArea(int[] h) {
        int start = 0;
        int end = h.length -1;
        int r = Integer.MIN_VALUE;
        while (start < end) {
            int area = (end-start) * Math.min(h[start], h[end]);
            r = Math.max(r, area);
            if (h[start]<=h[end]) {
                start ++;
            } else {
                end--;
            }
        }
        return r;
    }
}
