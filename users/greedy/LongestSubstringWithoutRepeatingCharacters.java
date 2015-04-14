package greedy;

import java.util.Arrays;

import com.leetcode.oj.LongestSubstringWithoutRepeatingCharactersTest;

public class LongestSubstringWithoutRepeatingCharacters extends
        LongestSubstringWithoutRepeatingCharactersTest {
    private final int MAX = 26;
    // 核心是不记录字符出现次数，记录上次的的位置，这样可以用下一个重复的位置找整体长度，
    // 也不用清理hashmap array
    @Override
    protected int lengthOfLongestSubstring(String s){
        int[] last = new int[MAX];
        Arrays.fill(last, -1); // 0是array starting index,需要初始化为-1
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            if (last[index] >= start) {
                max = Math.max(max, i-start);//是到start，不是last
                start =  last[index] + 1;
            }
            last[index] = i;
        }
        return Math.max(max, s.length()-start);
    }

}
