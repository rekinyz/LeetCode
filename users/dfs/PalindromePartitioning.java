package dfs;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class PalindromePartitioning {
    public static List<List<String>> run(String s) {
        int n = s.length();
        boolean[][] p = palindromeIJ(s);
        List<List<List<String>>> r = new ArrayList<List<List<String>>>();
        for (int i = 0; i < n; ++i) {
            r.add(new ArrayList<List<String>>());
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i; j < n; ++j) {
                if (p[i][j]) {
                    String palindrome = s.substring(i, j+1);// p i,j string
                    if (j+1 < n) {
                        // i到j可能有的组合取决于现在这个新的Palindrome的位置，
                        // 就是将其加入到之前从j+1到N的所有组合中
                        for(List<String> last : r.get(j+1) ) {
                            List<String> tmp = new ArrayList<String>(last);
                            tmp.add(palindrome);
                            r.get(i).add(tmp);
                        }
                    } else {
                        // last j, 如果 i到j是P，那么是一个整个sub string从i到j
                        // 对比上面是i到j可能有的组合。
                        List<String> lastj = new ArrayList<String>();
                        lastj.add(palindrome);
                        r.get(i).add(lastj);
                    }
                }
            }
        }
        return r.get(0);
    }
    // 定义状态P[i][j] = true if [i,j] 为回文
    // i,j is palindrome, 只需要半个，i的index小于j0
    public static boolean[][] palindromeIJ(String s) {
        int n = s.length();
        boolean[][] p = new boolean[n][n];
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i; j < n; ++j) {
                // i, j 相等，且如果有中间，中间是P
                p[i][j] = (s.charAt(i) == s.charAt(j) && (((j - i) < 2) || p[i + 1][j - 1]));
            }
        }
        return p;
    }
    public static int minCut(String s) {
        int n = s.length();
        boolean[][] p = new boolean[n][n];
        // f(i) 区间[i, n-1] 之间最小的cut 数
        // f(i) = min {f(j + 1) + 1}; i<=  j < n, 如果 i,j之间是回文
        // 逻辑就是 i,j是回文 + f(j)
        int[] f = new int[n+1];
        //缺省最大值是 f[0] = n-1, f[n-1] = 0,
        // 多一个f[n]是为了f[j+1]可能会超界
        for(int i = 0; i <=n; i++) {
            f[i] = n-i-1;
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i; j < n; ++j) {
                if(s.charAt(i) == s.charAt(j) && (((j - i) < 2) || p[i + 1][j - 1])) {
                    p[i][j] = true;
                    f[i] = Math.min(f[i], f[j+1]+1);
                }
            }
        }
        return f[0];
    }
    @Test
    public void test() {
        Assert.assertEquals(1, minCut("aab"));
    }

}
