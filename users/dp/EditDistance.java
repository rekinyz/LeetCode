package dp;

import org.junit.Assert;
import org.junit.Test;

/*
 * 需要问edit distance 允许哪些操作， insert, delete, replace
 */
public class EditDistance {
    public static int run(String s1, String s2) {
        if (s1.length() == 0) {
            if (s2.length() == 0) {
                return 0;
            } else {
                return s2.length();
            }
        } else if (s2.length() == 0) {
            return s1.length();
        }
        int [][] m = new int[s1.length()+1][s2.length()+1];
        m[0][0] = 0;
        
        for (int i = 1; i <= s2.length(); ++i) {
            m[0][i] = i;
        }
        for (int i = 1; i <= s1.length(); ++i) {
            m[i][0] = i;
        }
        for (int i = 1; i <= s1.length(); ++i) {
            for (int j = 1; j <= s2.length(); ++j) {
                // m[i][j]，表示A[0,i] 和B[0,j] 之间的最小编辑距离。设A[0,i] 的形式是str1c，B[0,j] 的形式是str2d，
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    m[i][j]=m[i-1][j-1];
                } else {// 如果不等
                    //看成是替换 f[i][j]=f[i-1][j-1]+1, 对角
                    //看成是insert d  f[i][j]=f[i][j-1]+1， 左
                    //看成 将c 删除，则f[i][j]=f[i-1][j]+1； 上， 看成是2*2的方块，右下角是其他3角的最小值加1
                    m[i][j] = Math.min(m[i-1][j-1], m[i][j-1]);
                    m[i][j] = Math.min(m[i][j], m[i-1][j]) + 1;
                }
            }
        }
        return m[s1.length()][s2.length()];
    }

    public static boolean run(String s1, String s2, int k) {
        if (s1.length() == 0) {
            if (s2.length() == 0) {
                return true;
            } else {
                return s2.length() <= k;
            }
        } else if (s2.length() == 0) {
            return s1.length() <= k;
        }
        int l1 = s1.length(), l2= s2.length();
        // 长度预判
        if (Math.abs(l1 - l2) > k) return false;
        int [][] m = new int[l1+1][l2+1];
        m[0][0] = 0;
        
        for (int i = 1; i <= l2; ++i) {
            m[0][i] = i;
        }
        for (int i = 1; i <= l1; ++i) {
            m[i][0] = i;
        }
        int d = l1-l2;
        for (int i = 1; i <= l1; ++i) {
            for (int j = 1; j <= l2; ++j) {
                // m[i][j]，表示A[0,i] 和B[0,j] 之间的最小编辑距离。设A[0,i] 的形式是str1c，B[0,j] 的形式是str2d，
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    m[i][j]=m[i-1][j-1];
                } else {// 如果不等
                    //看成是替换 f[i][j]=f[i-1][j-1]+1, 对角
                    //看成是insert d  f[i][j]=f[i][j-1]+1， 左
                    //看成 将c 删除，则f[i][j]=f[i-1][j]+1； 上， 看成是2*2的方块，右下角是其他3角的最小值加1
                    m[i][j] = Math.min(m[i-1][j-1], m[i][j-1]);
                    m[i][j] = Math.min(m[i][j], m[i-1][j]) + 1;
                    //if (m[i][j] > k) return false;
                }
                // 类对角线上的点可以用来预判
                if ((i-j) == d) {
                    if (m[i][j] > k) return false;
                }
            }
        }
        return true;      
    }
    @Test
    public void test() {
        Assert.assertEquals("0 ", 0,run("", ""));
        Assert.assertEquals("2 ", 2,run("123", "1"));
        Assert.assertEquals("0 ", 0,run("123", "123"));
        Assert.assertEquals("2 ", 2,run("1", "123"));
        Assert.assertEquals("5 ", 5,run("", "12345"));
        Assert.assertEquals("2 ", 2,run("123", "321"));
    }

}
