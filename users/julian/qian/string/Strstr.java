package julian.qian.string;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Strstr {
    public static int run(String s, String n) {
        
    }
    @Test
    public void test() {
        Assert.assertEquals(4, run("ababababd","ababd"));
        Assert.assertEquals(0, run("ababababd","ababababd"));
        Assert.assertEquals(-1, run("ababababd","ababdcef"));
        //  If target points to an empty string, str is returned.
        Assert.assertEquals(0, run("",""));
        Assert.assertEquals(-1, run("mississippi","a"));
        Assert.assertEquals(-1, run("aaabb","baba"));
        Assert.assertEquals(-1, run("bbaa","aab"));
    }

}
