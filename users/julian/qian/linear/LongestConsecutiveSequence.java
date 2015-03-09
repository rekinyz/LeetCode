package julian.qian.linear;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;

import com.leetcode.oj.util.CollectionGen;

public class LongestConsecutiveSequence {
    public static int run(int[] a) {
        HashMap<Integer, Boolean> v = CollectionGen.toMap(a);
        int longest = 0;
        for (int i = 0;i < a.length; ++i) {
            Boolean visit = v.get(a[i]);
            if (visit.booleanValue()) continue;
            int length = 1;
            v.put(a[i], true);
            for (int j = a[i] + 1; v.get(j) != null && !v.get(j).booleanValue(); ++j) {
                System.out.format("a[i] %d j %d l %d\r\n", a[i], j, length);
                v.put(j, true);
                length++;
            }
            for (int j = a[i] - 1; v.get(j) != null && !v.get(j).booleanValue(); --j) {
                System.out.format("a[i] %d j %d l %d\r\n", a[i], j, length);
                v.put(j, true);
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
    @Test
    public void test() {
        int[] a1 = {100, 4, 200, 1, 3, 2};
        Assert.assertEquals(4, run(a1));
    }

}
