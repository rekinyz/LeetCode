package dp;

import static org.junit.Assert.fail;

import org.junit.Test;

/*
 * Given s1; s2; s3, find whether s3 is formed by the interleaving of s1 and s2.
 For example, Given: s1 = ”aabcc”, s2 = ”dbbca”,
 When s3 = ”aadbbcbcac”, return true.
 When s3 = ”aadbbbaccc”, return false.
 f[i][j]，表示s1[i] 和s2[j]，匹配s3[i+j]。如果s1 的最后一个字符等
于s3 的最后一个字符，则f[i][j]=f[i-1][j]；如果s2 的最后一个字符等于s3 的最后一个字符，
则f[i][j]=f[i][j-1]。因此状态转移方程如下：
f[i][j] = (s1[i - 1] == s3 [i + j - 1] && f[i - 1][j])
|| (s2[j - 1] == s3 [i + j - 1] && f[i][j - 1]);
 */
public class InterleavingString {
    private static String s1;
    private static String s2;
    private static String s3;
    public static boolean recursive(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) return false;
        InterleavingString.s1 = s1;
        InterleavingString.s2 = s2;
        InterleavingString.s3 = s3;
        return recursive(0,s1.length(), 0, s2.length(), 0, s3.length());
    }
    public static boolean recursive(int f1, int e1, int f2, int e2, int f3, int e3) {
        if (f3==e3) return f1==e1 && f2 == e2;
        return (s1.charAt(f1) == s3.charAt(f3) &&
                recursive(f1+1, e1, f2, e2, f3+1, e3)) ||
                (s2.charAt(f2) == s3.charAt(f3) &&
                recursive(f1, e1, f2+1, e2, f3+1, e3));
    }
    public static boolean dp(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) return false;
        boolean[][] f = new boolean[s1.length()+1][s2.length()+1];
        f[0][0] = true;
        for (int i = 1; i <= s1.length() && s3.charAt(i-1) == s1.charAt(i);++i) {
            f[i][0] = true;
        }
        for (int i = 1; i <= s2.length() && s3.charAt(i-1) == s2.charAt(i);++i) {
            f[0][i] = true;
        }
        for (int i = 1; i <= s1.length();++i) {
            for (int j=1; j <= s2.length();++j) {
                f[i][j] = (s1.charAt(i-1) == s3.charAt(i+j-1) && f[i-1][j]) ||
                        (s1.charAt(i-1) == s3.charAt(i+j-1) && f[i][j-1]);
            }
        }
        
        
        return f[s1.length()][s2.length()];
    }
    // dp with滚动数组，空间复杂度n
    public static boolean dp1n(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) return false;
        if (s1.length() < s2.length()) return dp1n(s2, s1, s3);
        boolean[] f = new boolean[s2.length()+1];
        f[0] = true;
        for (int i = 1; i <= s2.length() && s3.charAt(i-1) == s2.charAt(i);++i) {
            f[i] = true;
        }
        for (int i = 1; i <= s1.length();++i) {
            for (int j=1; j <= s2.length();++j) {
                f[j] = (s1.charAt(i-1) == s3.charAt(i+j-1) && f[j]) ||
                        (s1.charAt(i-1) == s3.charAt(i+j-1) && f[j-1]);
            }
        }
        
        
        return f[s2.length()];
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
