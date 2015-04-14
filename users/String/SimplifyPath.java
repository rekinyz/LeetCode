package String;

import java.util.Stack;

import junit.framework.Assert;

import org.junit.Test;
/*
 * Given an absolute path for a file (Unix-style), simplify it.
 * 有可能会拓展到相对的path
 * 因为是绝对path,所以开始一定有/ 可以用stack,将path元素进stack,
 * 有 ../ 退， 有./ ignore,  有多余的/ ignore
 */
public class SimplifyPath {
    public static String run(String p) {
        if (p.length() == 0) return p;
        Stack<String> s = new Stack<String>();
        // first must be /
        for (int i = 0; i < p.length();) {
            ++i;
            int pos = p.indexOf('/', i);
            if (pos < 0) pos = p.length();
            String d = p.substring(i, pos);
            if (!d.isEmpty() && d.compareTo(".")!=0) {
                if (d.compareTo("..")==0) {
                    if (!s.isEmpty()) {
                        s.pop();
                    }
                }else {
                    s.push(d);
                }
            }
            i = pos;
        }
        StringBuilder sb = new StringBuilder();
        if (s.isEmpty()) return "/";
        else {
            for (String a : s) {
                sb.append('/');
                sb.append(a);
            }
        }
        return sb.toString();
    }
    @Test
    public void test() {
        //Assert.assertEquals("", run(""));
        //Assert.assertEquals("/", run("/../"));
        //Assert.assertEquals("/h/f", run("/h//f/"));
        Assert.assertEquals("/c", run("/a/./b/../../c/"));
        Assert.assertEquals("/h/f", run("/h///f/"));
        Assert.assertEquals("/hx/fb", run("/hx///fb"));
    }

}
