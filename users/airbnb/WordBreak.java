package airbnb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.leetcode.oj.util.CollectionGen;
/*
 * page 215 13.12, TODO 需要做DP版本和找到路径的版本
 */
public class WordBreak {
    public static HashSet<String> dict;
    public static boolean run(String s, HashSet<String> dict) {
        WordBreak.dict = dict;
        return run(s, 0, 1);
    }
    public static boolean run(String str, int s, int e) {
        if (e == str.length()) {
            String search = str.substring(s, e);
            return dict.contains(search);
        }
        if (dict.contains(str.substring(s, e))) {
            if (run(str, e, e+1)) return true;
        } 
        if (run(str, s, e+1)) return true;
        return false;
    }
    /*
     * 设状态为f(i)，表示s[0,i] 是否可以分词，则状态转移方程为
     * f(i) = any_of(f(j)&&s[j + 1, i] in dict  0  j < i
     */
    public static boolean dp(String s, HashSet<String> dict) {
        boolean[] f = new boolean[s.length()+1];
        f[0] = true;
        for (int i = 1; i <= s.length();++i) {
            // 从大到小，这样可以更快 break
            for (int j = i-1; j >=0; --j) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
    
    public static List<String> dp2(String s, HashSet<String> dict) {
        WordBreak.dict = dict;
        boolean[] f = new boolean[s.length()+1];
     // prev[i][j] 为true，表示s[j, i) 是一个合法单词，可以从j 处切开
        boolean[][] prev = new boolean[s.length()+1][s.length()];
        f[0] = true;
        for (int i = 1; i <= s.length();++i) {
            // 从大到小，这样可以更快 break
            for (int j = i-1; j >=0; --j) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    prev[i][j] = true;
                    // need to set all possible path, so can't break here
                }
            }
        }
        
        List<String> r = new ArrayList<String>();
        List<String> path = new ArrayList<String>();
        gen(s, prev, s.length(), path, r);
        return r;
    }
    //这个是从尾巴开始match
    public static void gen(String s, boolean[][] prev, int left, List<String> path, List<String>r) {
        if (left==0) {
            StringBuilder sb = new StringBuilder();
            for (String str : path) {
                sb.append(str).append(' ');
            }
            sb.deleteCharAt(sb.length()-1);
            r.add(sb.toString());
        }
        for (int i = 0; i < s.length(); ++i) {
            if (prev[left][i]) {
                path.add(s.substring(i, left));
                gen(s, prev, i, path, r);
                path.remove(path.size()-1);
            }
        }
    }
    @Test
    public void test() {
        String[] s = {"hot","dot","dog","lot","log"};
        HashSet<String> dict = CollectionGen.toSet(s);
        Assert.assertEquals(true, run("hotdog", dict));
        Assert.assertEquals(Arrays.asList("hot dog"), dp2("hotdog", dict));
    }

}
