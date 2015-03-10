package julian.qian.string;

import junit.framework.Assert;

import org.junit.Test;

public class Strstr {
    public static int run(String s, String n) {
        if (n.length() == 0) return 0;
        int lastpos = s.length() - n.length();
        if (lastpos < 0) return -1;
        for (int i = 0; i <= lastpos; i++) {
            int j = 0;
            for (; j < n.length(); ++j) {
                if (s.charAt(i+j) != n.charAt(j)) break;
            }
            if (j == n.length()) return i;
        }
        return -1;
    }
    @Test
    public void test() {
        Assert.assertEquals(4, run("ababababd","ababd"));
        Assert.assertEquals(0, run("ababababd","ababababd"));
        Assert.assertEquals(-1, run("ababababd","ababdcef"));
        //  If target points to an empty string, str is returned.
        Assert.assertEquals(0, run("",""));
        Assert.assertEquals(0, run("afdsds",""));
        Assert.assertEquals(-1, run("mississippi","a"));
        Assert.assertEquals(-1, run("aaabb","baba"));
        Assert.assertEquals(-1, run("bbaa","aab"));
        Assert.assertEquals(0, run("bbaa","bbaa"));
        Assert.assertEquals(-1, run("bba","bbaa"));
    }

}
