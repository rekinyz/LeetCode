package dp;

import junit.framework.Assert;

import org.junit.Test;

/*
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 A subsequence of a string is a new string which is formed from the original string by deleting some (can
 be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is
 a subsequence of "ABCDE" while "AEC" is not).
 Here is an example: S = "rabbbit", T = "rabbit"
 Return 3.
 为f(i，j)，表示T[0,j] 在S[0,i] 里出现的次数。
 若S[i]==T[j]，则可以使用S[i]，f(i; j) = f(i - 1; j) + f(i - 1; j -1)。
 否则f(i,j) = f(i - 1; j)；
 由于实际需要用到的只是 两个，f(i - 1; j) + f(i - 1; j -1)
 */
public class DistinctSubsequnces {
    public static int run1(String s, String t) {
        int[] f = new int[t.length() + 1];
        f[0] = 1;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = t.length() - 1; j >= 0; --j) {
                f[j + 1] += s.charAt(i) == t.charAt(j) ? f[j] : 0;
            }
        }
        return f[t.length()];
    }
    public static int run2(String s, String t) {
        int[] f = new int[t.length() + 1];
        f[0] = 1;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = Math.min(i, t.length()-1); j >= 0; --j) {
                f[j + 1] += s.charAt(i) == t.charAt(j) ? f[j] : 0;
            }
        }
        return f[t.length()];
    }
    public static int run(String s, String t) {
        int[] f = new int[t.length() + 1];
        f[0] = 1;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = Math.min(i, t.length()-1); j >= 0; --j) {
                // f[j+1] = f[j+1] + f[j], f[j+1],这里用 f[j+1]模拟 f(i - 1; j)，因为就是保存上次的i-1的数字
                // 实际是可以看成是 f[j] 对应 f[i-1,j] 因为上次也是j+1
                // 从大的往小的循环，是为了保证上次的数据不被覆盖，每次update 最大的F
                f[j + 1] += s.charAt(i) == t.charAt(j) ? f[j] : 0;
            }
        }
        return f[t.length()];
    }

    @Test
    public void test() {
        Assert.assertEquals(3, run("rabbbit","rabbit"));
        Assert.assertEquals(1, run("ABCDE","ACE"));
        Assert.assertEquals(0, run("ABCDE","AEC"));
        Assert.assertEquals(0, run("ABCDE","ECE"));
    }

}
