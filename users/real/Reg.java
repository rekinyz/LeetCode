package real;

import junit.framework.Assert;

import org.junit.Test;

import com.leetcode.oj.RegularExpressionMatchingTest;
// full match not a partial match
public class Reg extends RegularExpressionMatchingTest{
	public static boolean run(String s, String p) {
		
		return isMatchHelp(s, 0, p, 0);
	}

	public static boolean isStrMatchP(char s, char p) {
		return p == '.' || s == p;
	}
	public static boolean isMatchHelp(String s, int sp, String p, int pp) {
		
		if (sp == s.length() && pp == p.length()) return true;
    	if (pp == p.length() && sp != s.length()) return false;
		
		if (pp<p.length()-1 && p.charAt(pp+1) == '*') {
			return isMatchHelp(s,sp,p,pp+2) || 
				(sp < s.length() && // "ab", "abx*" and "abcedfgeh", "a.*e"
				isStrMatchP(s.charAt(sp), p.charAt(pp)) &&
				(isMatchHelp(s,sp+1,p,pp) || isMatchHelp(s,sp+1,p, pp+2)));	
		} else if (sp >= s.length()) {
		    return false;
		} else if (p.charAt(pp) == '.' ||s.charAt(sp) == p.charAt(pp)) {
			return isMatchHelp(s,sp+1,p,pp+1);
		} else return false; 
				
	}
    @Override
    protected boolean isMatch(String s, String p) {
        return run(s, p);
    }
    @Test
    public void test() {
        Assert.assertTrue(Reg.run("", ""));
        Assert.assertTrue(!Reg.run("", "ab"));
        Assert.assertTrue(Reg.run("ab", "abx*"));
        Assert.assertTrue(!Reg.run("ab", ""));
        Assert.assertTrue(Reg.run("abc", "abc")); 
        Assert.assertTrue(Reg.run("a", "a*"));
        Assert.assertTrue(Reg.run("aaa", "a*"));
        Assert.assertTrue(Reg.run("aa", ".a"));
        Assert.assertTrue(Reg.run("abcdefg", ".*"));
        Assert.assertTrue(!Reg.run("abcde", "abc"));
        Assert.assertTrue(Reg.run("abcde", "ab.de"));
        Assert.assertTrue(!Reg.run("abcedfgeh", "a.*e"));
        Assert.assertTrue(Reg.run("abcedfgeh", "a.*h"));
        Assert.assertTrue(Reg.run("abcdefghigkemnop", "a.*ig.*p"));
        Assert.assertTrue(!Reg.run("abcdefghigkemnop", "a.*ii.*p"));
    }

}
