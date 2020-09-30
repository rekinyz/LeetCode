package dropbox;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;
/*
 * http://www.careercup.com/question?id=5164018295635968
 * combine dfs and pattern match
 * Question was "Given a pattern and a string input - 
 * find if the string follows the same pattern and return 0 or 1. 
Examples: 
1) Pattern : "abba", input: "redbluebluered" should return 1. 
2) Pattern: "aaaa", input: "asdasdasdasd" should return 1. 
3) Pattern: "aabb", input: "xyzabcxzyabc" should return 0. 

 */
public class StringPattern {
// https://regex101.com/
    // 如果输入只是字符，且可以用regx，那么每碰到新的字符用(.+)，下次遇到同样的字符用这个字符的位置替代\1
    // 那么abba变成 (.+)(.+)\2\1 可以match.
    // notice that in Java, you will need to “double escape” these backslashes.
    // so it will be(.+)(.+)\\2\\1
    public static String pattern(String p) {
        StringBuilder sb = new StringBuilder();
        int[] h = new int[26];
        int block = 1;
        for (int i = 0; i < p.length(); ++i) {
            char c = p.charAt(i);
            c -= 'a';
            if (h[c] == 0) {
                sb.append("(.+)");
                h[c] = block;
                block++;
            } else {
                sb.append("\\").append(h[c]);
            }
        }
        return sb.toString();
    }

    public static boolean match(String p, String s) {
        String pattern = pattern(p);
        return s.matches(pattern);
    }
    public static boolean dfsMatch(String p, String s) {
        if (s.length() < p.length()) return false;
        if (p.isEmpty()) return s.isEmpty();
        if (p.length() == 1) return true; // s长度不会小于1
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        return dfsMatch(p,0,s,0,h);
    }
    public static boolean dfsMatch(String p, int pi,String s, int sj, HashMap<Integer, String> h) {
        if (sj == s.length() && pi == p.length()) return true;
        if (sj == s.length() || pi == p.length()) return false;
        int c = p.charAt(pi);
        String match = h.get(c);
        if (match != null) {
            int endIndex = sj + match.length();
            if (endIndex > s.length()) return false;
            if (match.compareTo(s.substring(sj, endIndex)) != 0) {
                return false;
            }
            return dfsMatch(p, pi+1, s, endIndex, h);
        } else {
            boolean r = false;
            for (int i = sj+1; i <= s.length(); i++) {
                h.put(c, s.substring(sj, i));
                r |= dfsMatch(p, pi+1, s, i, h);
                h.remove(c);
                if (r) {
                    return true;
                }
            }
            return false;
        }
    }
    // use DFS to match set 2 pointers, one in the pattern, and one in the string. 
    //Additionally, maintain a map to keep track of the mapping between a pattern letter and a substring
    @Test
    public void test() {
        Assert.assertEquals("(.+)(.+)\\2\\1", pattern("abba"));
        Assert.assertEquals("(.+)\\1\\1\\1", pattern("aaaa"));
        Assert.assertEquals("(.+)\\1(.+)\\2", pattern("aabb"));
        Assert.assertEquals(true, match("abba","redbluebluered"));
        Assert.assertEquals(true, match("aaaa","asdasdasdasd"));
        Assert.assertEquals(false, match("aabb","xyzabcxzyabc"));
        Assert.assertEquals(true, dfsMatch("abba","redbluebluered"));
        Assert.assertEquals(true, dfsMatch("aaaa","asdasdasdasd"));
        Assert.assertEquals(false, dfsMatch("aabb","xyzabcxzyabc"));
    }

}
