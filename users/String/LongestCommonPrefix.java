package String;

import com.leetcode.oj.LongestCommonPrefixTest;

public class LongestCommonPrefix extends LongestCommonPrefixTest{

    @Override
    protected String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < strs.length; ++j) {
                if (strs[j].charAt(i) != strs[j-1].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
