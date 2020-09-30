package airbnb;

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
    
    /*
     * ? match single char, * match any sequence
     */
    public static boolean WildcardMatch(String s, String p) {
        return WildcardMatch(s,0,p,0);
    }
    public static boolean WildcardMatch(String s, int sp, String p, int pp) {
        if (sp == s.length() && pp == p.length()) return true;
        if (pp == p.length() && sp != s.length()) return false;
        // BUG, if p last is *, even if pp not end, s end, it is still ok.
        // so below sp maybe ended.
        if (sp == s.length()) {
            if (p.charAt(pp) == '*') {
                return WildcardMatch(s, sp, p, pp+1);
            } else {
                return false;
            }
        } else {
            char sc = s.charAt(sp);
            char pc = p.charAt(pp);
            if (sc == pc || pc == '?') {
                return WildcardMatch(s, sp+1, p, pp+1);
            } else if (pc == '*') {
                return WildcardMatch(s, sp+1, p, pp+1) || WildcardMatch(s, sp+1, p, pp);
            } else {
                return false;
            }
        }
    }
    
    @Test
    public void testW() {
        Assert.assertTrue(Reg.WildcardMatch("", ""));
        Assert.assertTrue(!Reg.WildcardMatch("", "ab"));
        Assert.assertTrue(Reg.WildcardMatch("ab", "ab*"));
        Assert.assertTrue(!Reg.WildcardMatch("ab", ""));
        Assert.assertTrue(Reg.WildcardMatch("abc", "abc")); 
        Assert.assertTrue(Reg.WildcardMatch("a", "?*"));
        Assert.assertTrue(Reg.WildcardMatch("aaa", "a*"));
        Assert.assertTrue(Reg.WildcardMatch("aa", "?a"));
        Assert.assertTrue(Reg.WildcardMatch("abcdefg", "*"));
        Assert.assertTrue(!Reg.WildcardMatch("abcde", "abc"));
        Assert.assertTrue(Reg.WildcardMatch("abcde", "ab?de"));
        Assert.assertTrue(!Reg.WildcardMatch("abcedfgeh", "a*e"));
        Assert.assertTrue(Reg.WildcardMatch("abcedfgeh", "a*h"));
        Assert.assertTrue(Reg.WildcardMatch("abcdefghigkemnop", "a*ig*p"));
        Assert.assertTrue(!Reg.WildcardMatch("abcdefghigkemnop", "a*ii*p"));
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
