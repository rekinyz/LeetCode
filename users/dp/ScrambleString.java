package dp;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ScrambleString {
    private static String s1;
    private static String s2;
    
    public static boolean recursive(String s1, String s2) {
        ScrambleString.s1 = s1;
        ScrambleString.s2 = s2;
        return recursive(0, s1.length(), 0);
    }
    public static boolean recursive(int f1, int l1, int f2) {
        int len = l1-f1;
        if (len == 1) return s1.charAt(f1) == s2.charAt(f2);
        int l2 = f2 + len;
        for (int i = 1; i < len; ++i) {
            if((recursive(f1, f1+i, f2) && recursive(f1+i, l1, f2+i)) ||
                    (recursive(f1, f1+i, l2-i) && recursive(f1+i, l2, f2))) {
                return true;
            }
        }
        return false;
    }    
    /*
     * f[n][i][j]，表示长度为n，起点 为s1[i] 和起点为s2[j] 两个字符串是否互为scramble，则状态转移方程为
     * f[n][i][j]} = (f[k][i][j] && f[n-k][i+k][j+k]) || (f[k][i][j+n-k] &&
     * f[n-k][i+k][j]) 递归
     */
    public static boolean dp(String s1, String s2) {
        int N = s1.length();
        if (N != s2.length()) return false;
        boolean[][][] f = new boolean[N+1][N][N];
        for(int i = 0; i < N; i++){
            for (int j = 0; j< N; j++) {
                f[1][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }
        for (int n=1; n<=N; ++n) {
            for (int i = 0; i+n <=N; ++i) {
                for (int j=0; j+n <=N; ++j) {
                    for (int k=1; k<n; ++k) {
                        if ((f[k][i][j] && f[n-k][i+k][j+k] ||
                            (f[k][i][j+n-k] && f[n-k][i+k][j]))){
                            f[n][i][j] = true;
                            break;
                        }
                        
                    }
                }
            }
        }
        return f[N][0][0];
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
