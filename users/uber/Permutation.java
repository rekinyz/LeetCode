package uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class Permutation {
    // s should not contain any dup string
    public static List<String> noDup(String s) {
        List<String> r = new ArrayList<String>();
        HashMap<Integer,Boolean> p = new HashMap<Integer,Boolean>();
        for (int i = 0; i < s.length(); ++i) {
            p.put(i, true);
        }
        StringBuilder b = new StringBuilder(s.length());
        noDup(r, b, p, s);
        return r;
    }

    public static void noDup(List<String> r, StringBuilder b, HashMap<Integer,Boolean> p, String s) {
        if (b.length() == s.length()) {
            r.add(b.toString());
            return;
        }
        for (Map.Entry<Integer,Boolean> i:p.entrySet()) {
            if (!i.getValue()) continue;
            i.setValue(false);
            
            b.append(s.charAt(i.getKey()));
            noDup(r, b, p,s);
            i.setValue(true);
            b.deleteCharAt(b.length()-1);
        }
    }

    @Test
    public void test() {
        List<String> s1 = Arrays.asList("abc","acb","bac","bca","cab","cba");
        Assert.assertEquals(s1, noDup("abc"));
    }
}