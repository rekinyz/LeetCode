package julian.qian.string;

import com.leetcode.oj.ValidPalindromeTest;
/*
 * considering only alphanumeric characters and ignoring
cases.
Have you consider that the string might be empty? 
what about number? ignore it? or no such input?
 */
public class ValidPalindrome extends ValidPalindromeTest {
    @Override
    protected boolean run(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int tail = s.length() - 1;
        for (int head = 0; head < tail; head++, tail--) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
        }
        return true;
    }
}
