package julian.qian.linear;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * You are given an n  n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).
Follow up: Could you do this in-place?
首先沿着副对角线翻转一次，然后沿着水平中线翻转一次。或者，首先沿着水平中线翻转一次，然后沿着主对角线翻转一次。
变化 而是要把每一个element都顺时针移动 k steps。
比如n = 5, k = 3,
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

变为
16 11 6  1  2
21 18 17 12 3
22 19 13 7  4
23 14 9  8  5
24 25 20 15 10

里面还有90旋转，180旋转的情况，本质是一维rotate,应该参考一维rotate的情况
 */
public class RotateImage {
    public static void run(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; ++i) {
            for(int j = 0; j < n-i-1; ++j) {
                int t = m[i][j];
                m[i][j] = m[n-1-j][n-1-i];
                m[n-1-j][n-1-i] = t;
            }
        }
        for (int i = 0; i < n/2; ++i) {
            for (int j = 0; j < n; ++j) {
                int t = m[i][j];
                m[i][j] = m[n-1-i][j];
                m[n-1-i][j]=t;
            }
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
