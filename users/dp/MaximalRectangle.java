package dp;
import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;


public class MaximalRectangle {
    public static int run(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int ret = 0;
        final int m = matrix.length;
        final int n = matrix[0].length;
        // 每次处理一行，
        int[] h = new int[n]; // 正在处理的行的点的目前最高高度
        int[] l = new int[n]; // 左边1的位置
        int[] r = new int[n];// 右边0的位置， 右边0的位置-左边1的位置就是宽度，这个需要是考虑历史高度的左边1和右边0
        Arrays.fill(r,n);
        for (int i = 0; i < m; ++i) {
            // 每次算累计到本行的最大值 = 从右往左 h[j]*(r[j] - l[j])
            // 用h记录每个点能到最大高度，用l,r计算这个最大高度的能到的宽度，能计算出局部最优，
            // 为了计算这个最大高度的能到的宽度，需要记录这个点自上次有高度开始的历史最大左边0和最小右边1
            // 没有高度，左边就0，右边就可以是最大值（不影响下一行的点）
            // 左边的点，决定当前点的最左的0,所以从左边开始扫描最左的0。
            int left = 0; // 目前点左边1的位置
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == '1') {
                    ++h[j]; // 从上往下，有1就增加，碰0就清零
                    //第一遍扫描，l是全零，所以记录是 0,0,2,2,2, 第二行 0,0,2,2,0
                    // l[]用来累计，越大宽度越小，必须是历史最高高度的宽度，所以是取历史最大值，相对应 r取历史最小值
                    l[j] = Math.max(l[j], left);
                } else {
                    left = j + 1;
                    h[j] = 0;//一旦出现0 清零
                    l[j] = 0;// 出现0，清零
                    r[j] = n;// 出现0，清零这样不影响下一行的值，h是0，反正不计算
                }
            }
            
            int right = n; // 目前点右边1的位置
            for (int j = n-1; j >= 0; --j){
                if(matrix[i][j] == '1') {
                    r[j] = Math.min(r[j], right);
                    ret = Math.max(ret, h[j]*(r[j] - l[j]));
                } else {
                    right = j;
                }
            }
            System.out.print(Arrays.toString(h));
            System.out.print(Arrays.toString(l));
            System.out.print(Arrays.toString(r));
            System.out.format("l %d r %d ret %d\r\n", left, right, ret);
        }
        return ret;
    }
    @Test
    public void test() {
        char[][] a = {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '1', '1'},
                {'0', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
            };
        Assert.assertEquals(9, run(a));
        char[][] a1 = {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '1', '0'},
                {'0', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
            };
        Assert.assertEquals(6, run(a1));
        char[][] a2 = {
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '0'},
                {'0', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
            };
        Assert.assertEquals(4, run(a2));
        char[][] a3 = {
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '0'},
                {'0', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1'},
            };
        Assert.assertEquals(4, run(a3));
        char[][] a4 = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
            };
        Assert.assertEquals(20, run(a4));
        char[][] a5 = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '1'},
                {'1', '1', '1', '1', '1'},
            };
        Assert.assertEquals(10, run(a5));
        char[][] a6 = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '1'},
                {'1', '1', '0', '1', '1'},
                {'1', '1', '1', '1', '1'},
            };
        Assert.assertEquals(8, run(a6));
    }

}
