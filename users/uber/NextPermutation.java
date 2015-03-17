package uber;

import junit.framework.Assert;

// leetcode 2.1.12, page 25
public class NextPermutation {
    public static String next(String n) {
        
    }
    @Test
    public void test() {
        Assert.assertEquals("132", next("123"));
        Assert.assertEquals("124", next("321"));
        Assert.assertEquals("151", next("115"));
    }

}
