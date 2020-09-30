package real;

import static org.junit.Assert.*;

import java.awt.datatransfer.StringSelection;

import junit.framework.Assert;

import org.junit.Test;
// do you consider radix
public class StringTest {
    public static int atoi(String s) {
        int r = 0;
        int sign = 1;
        int i = 0;
        while(i<s.length() && s.charAt(i) ==' ') i++;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            i++;
            sign = -1;
        }
        int max = Integer.MAX_VALUE / 10;
        for (;i<s.length();++i){
            int c = s.charAt(i) - '0';
            if (c <0 || c >9) {
                throw new RuntimeException();
            }
            if (r > max || (r == max && (c > (Integer.MAX_VALUE % 10 )))) {
                System.out.format("r %d c %d %d\r\n", r, c, Integer.MAX_VALUE % 10);
                throw new RuntimeException();
            }
            r = r*10 + c;
        }
        return r * sign;
    }
    @Test
    public void test() {
        Assert.assertEquals(0, atoi("0"));
        String r;
        r = "100";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "-100";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "+100";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "2147483647";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "-2147483647";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "808";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        r = "-808";
        Assert.assertEquals((int)Integer.valueOf(r), atoi(r));
        Assert.assertEquals(800, atoi(" 800"));
    }
    
    @Test(expected = Exception.class)
    public void testInvalid1() {
        atoi("xk");        
    }
    @Test(expected = Exception.class)
    public void testInvalid2() {
        atoi("-3567xk");        
    }
    @Test(expected = Exception.class)
    public void testInvalid3() {
        atoi("--1");        
    }
    @Test(expected = Exception.class)
    public void testInvalid4() {
        atoi("+xk3443");        
    }
    @Test(expected = Exception.class)
    public void testInvalid5() {
        // INT_MAX (2147483647) INT_MIN (-2147483648)
        atoi("2147483648");        
    }
    @Test(expected = Exception.class)
    public void testInvalid6() {
        atoi("-2147483648");        
    }
    @Test(expected = Exception.class)
    public void testInvalid7() {
        atoi("++5");        
    }
    @Test(expected = Exception.class)
    public void testInvalid8() {
        atoi("5.5");        
    }
    @Test(expected = Exception.class)
    public void testInvalid9() {
        atoi("5.5");        
    }
}
