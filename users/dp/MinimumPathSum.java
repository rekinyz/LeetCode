package dp;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/*
 * 设状态为f[i][j]，表示从起点(0; 0) 到达(i; j) 的最小路径和，则状态转移方程为：
 f[i][j]=min(f[i-1][j], f[i][j-1])+grid[i][j]
 */
public class MinimumPathSum {
    public static int run(int[][] g) {
        if (g.length == 0) return 0;
        int m = g.length;
        int n = g[0].length;
        int[][] f = new int[m][n];
        f[0][0] = g[0][0];
        for(int i = 1; i < m; i++) {
            f[i][0] = f[i-1][0] + g[i][0];
        }
        for(int i = 1; i < n; i++) {
            f[0][i] = f[0][i-1] + g[0][i];
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                f[i][j]=Math.min(f[i-1][j], f[i][j-1]) + g[i][j];
            }
        }
        return f[m-1][n-1];
    }
    public static int runONMemory(int[][] g) {
        if (g.length == 0) return 0;
        int m = g.length;
        int n = g[0].length;
        int[] f = new int[n];
        Arrays.fill(g, Integer.MAX_VALUE);
        f[0] = 0;
        for(int i = 0; i < m; i++) {
            f[0] += g[i][0];
            for(int j = 1; j < n; j++) {
                // 原来的2维数组，其实只是用到前后两个，所以是可以复用
                f[j]=Math.min(f[j], f[j-1]) + g[i][j];
            }
        }
        return f[n-1];
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
