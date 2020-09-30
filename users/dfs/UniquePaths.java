package dfs;

import static org.junit.Assert.fail;

import org.junit.Test;

/*
 * c (m+n-2) (m-1) = ((m+n-2) *** (n) / (m-1)!  
 */
public class UniquePaths {
    static long factor(int n, int stop) {
        long r = 1;
        for (int i = n; i >= stop; --i) {
            r *= i;
        }
        return r;
    }

    static long com(int n, int k) {
        if (k == 0)
            return 0;
        if (k == 1)
            return n;
        long r = factor(n, k + 1);
        r = r / factor(n - k, 1);
        return r;
    }

    // 有障碍的
    /*
     * 设状态为f[i][j]，表示从起点(1; 1) 到达(i; j) 的路线条数，则状态转移方程为：
     * f[i][j]=f[i-1][j]+f[i][j-1]
     * 第一列如果某一行有障碍物，那么后面的行应该为0。否则为1
     */
    static int path(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        if (g[0][0] == 1 || g[m-1][n-1]==1) return 0;
        int[] f = new int[n];
        f[0] = 1;
        for (int i = 0; i < m; i++) {
            for(int j= 0; j< n; j++) {
                // 只需要1维，因为，f(i-1, j) 保存在f，f(i,j-1)就是 f(j-1)
                // 只有保证 j ==0 用 0就ok
                f[j] = g[i][j]==1 ? 0: (j==0 ? 0:f[j-1]) + f[j];
            }
        }
        return f[n-1];
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
