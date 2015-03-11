package dp;

import org.junit.Assert;
import org.junit.Test;

// question to ask for a coding question:
// freq of this method to be called, can pre-work be done to speed up?
// what's the pattern of input data.
// http://blog.faroo.com/2012/06/07/improved-edit-distance-based-s
// 给定一个word list 和一个target word，要求输出在word list 里跟target 
// word的edit distance 相差不大于k的所有words
// 1: 直接遍历完整计算edit distance. 285 clocks.
//2: 直接遍历，计算edit distance到 >k 就返回. 149 clocks.
// 3. 如果 word是固定的，可以生成hashmap，把k以内的变化都导入，直接用hash找
//For a word of length n, an alphabet size a, an edit distance d=1, 
//there will be n deletions, n-1 transpositions, a*n alterations, and a*(n+1) insertions, 
//for a total of 2n+2an+a-1 terms at search time.
// 一般来说 transpositions应该算2个操作？
// 4. 如果list是固定的，可以按照3生成hashmap，对应应该有的word，这样也是o（1）
// 5. 可以生成list里面所有word的 delete 一个字符的word，和要比较的word 所有del一个char的word比较，
// 因为edit distance是对称的，choosk-->choos-->choose  
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
                
                m[i][j] = Math.min(m[i-1][j-1] + ((s1.charAt(i-1) == s2.charAt(j-1))?0:1), 
                        Math.min(m[i-1][j]+1, m[i][j-1]+1));
            }
        }
        return m[s1.length()][s2.length()];
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
