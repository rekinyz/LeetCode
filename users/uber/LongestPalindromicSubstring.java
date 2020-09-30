package uber;

import com.leetcode.oj.LongestPalindromicSubstringTest;
/*
 * page 63, 3.5 of leetcode book
 * We observe that a palindrome mirrors around its center. Therefore,
 *  a palindrome can be expanded from its center, and there are only 2N-1 such centers.
 *  
 *  second approach is both O(N) space and o(N) speed
 *  Manacher’s algorithm
 *  http://articles.leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 *  http://www.felix021.com/blog/read.php?2040 中文的
 *  这个假设是只有一个答案，
 */
public class LongestPalindromicSubstring extends LongestPalindromicSubstringTest{

    @Override
    protected String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        int max = 0;
        int index = 2;
        int pos = 0;
        //max = palindrome(s, pos);
        for (;index < 2*s.length() - 1; ++index) {
            int newmax = palindrome(s, index);
            if (newmax > max){
                max = newmax;
                pos = index;
            }
        }
        int start = (pos-max)/2;
        return s.substring(start, start+max);
    }
    
    private int palindrome(String s, int pos) {
        int left = pos/2 -1;
        int right = (pos+1)/2;
        int size = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                size+=2;
            } else {
                break;
            }
        }
        if (size > 0) {
            size += pos % 2;
        }
        return size;
    }

}
