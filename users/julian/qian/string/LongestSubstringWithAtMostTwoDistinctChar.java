package julian.qian.string;

import junit.framework.Assert;

import org.junit.Test;
/*
 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
 * 
 * For example, Given s = “eceba”,
 * 
 * T is "ece" which its length is 3.
 * Idea:
 *
 *    1) Using a map to count every char(s).
 *    2) Using a 'cnt' to count the current distinct chars.
 *    3) If `cnt > 2`, then go through the previous substring to decrease each char's count 
 *    which stored in the map,
 *       if one of char's count decrease to zero, then the global distinct chars `cnt` decrease one.
 *       During the travel, maintain a pointer `start` to point the start position of sub-string.
 *
 * The following algorithm run-time complexity is O(n^2)
 *
 * This solution can be easy to extend to "find the length of longest substring with at most K distinct char(s)"
 */

public class LongestSubstringWithAtMostTwoDistinctChar {
    public static int run(String s, int k) {
        int m = 0;
        int[] map = new int[256];
        int cnt = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map[c] == 0) {
               cnt++; 
            }
            map[c]++;
            while(cnt > k) {
                c = s.charAt(start);
                map[c]--;
                if (map[c]==0) {
                    cnt--;
                }
                start++;
            }
            m = Math.max(m, i-start+1);
        }
        return m;
    }
    @Test
    public void test() {
        Assert.assertEquals(3, run("eceba",2));
    }

}
