package snapchat;

import junit.framework.Assert;

import org.junit.Test;
/*
 * 说很多用户名都会重复，通过后面的数字来区分，但是在排序的时候严格按照字符串排序就会出现 abc10 排在 abc2 前面（因为‘1’比‘2’要小），
 * 但是事实上他们想要达到的效果是 abc10 排在 abc2 后面（10比2要大），于是让写一个字符串比较函数。 LZ面试经验比较少，
 * 磕磕碰碰写了好一会儿。开始的思路是遇到数字后把数字的substring转成int，后来发现有可能会有0作为前缀，于是加上了长度比较，
 * 但是面试官又提了一个testcase，说数字很长怎么办，这才发现转成int会有溢出问题
 */
public class StringCompare {
    public static String trim(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '0' && c <= '9') return s.substring(i, s.length());
        }
        return "";
    }
    public static int run(String a, String b) {
        a = trim(a);
        b = trim(b);
        if (a.length() != b.length()) return a.length() > b.length() ? 1:-1;
        return a.compareTo(b);
    }
    @Test
    public void test() {
        Assert.assertEquals(1, run("10","2"));
        Assert.assertEquals(-1, run("10","20"));
        Assert.assertEquals(0, run("02","2"));
        Assert.assertEquals(1, run("02","1"));
        Assert.assertEquals(-1, run("02","3"));
        // 通过写test case来确定function 的scope
        // mixed with char?
        // 变成数字的问题是溢出，为了避免溢出，需要转成大INT,这样比较比较复杂
        // 可以去掉前面的0，长度大的大，长度一样 之后按位比较，
    }

}
