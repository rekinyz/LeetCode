package com.leetcode.oj;

import java.util.*;

/**
 * Substring with Concatenation of All Words
 * <p>
 * You are given a string, s, and a list of words, words, that are all of the
 * same length. Find all starting indices of substring(s) in s that is a
 * concatenation of each word in words exactly once and without any intervening
 * characters.
 * <p>
 * For example, given: s: "barfoothefoobarman" words: ["foo", "bar"]
 * <p>
 * You should return the indices: [0,9]. (order does not matter).
 *
 * @author rekinyz
 */
public class SubstringConcatenationAllWords {
    List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int wordLen = words[0].length(), len = i + wordLen * words.length;
            List<String> wList = new ArrayList<>(Arrays.asList(words));
            for (int j = i; j < len && len <= s.length(); j += wordLen) {
                String w = s.substring(j, j + wordLen);
                if (wList.contains(w)) {
                    wList.remove(w);
                } else {
                    j = s.length();
                }
                if (wList.size() == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    // bad performance solution
    public List<Integer> findSubstring1(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordsNum = words.length;
        if (wordsNum != 0) {
            int len = words[0].length();
            int start = 0, end = len * wordsNum;
            while (end < s.length()) {
                for (String combi : permutation(words)) {
                    if (s.substring(start, end).equals(combi)) {
                        result.add(start);
                    }
                }
                start += len;
                end += len;
            }
        }
        return result;
    }

    private Set<String> permutation(String[] words) {
        Set<String> set = new HashSet<>();
        permutation("", words, set);
        return set;
    }

    private void permutation(String prefix, String[] words, Set<String> set) {
        int len = words.length;
        if (len == 0) {
            set.add(prefix);
        } else {
            for (int i = 0; i < len; i++) {
                String[] head = Arrays.copyOfRange(words, 0, i);
                String[] tail = Arrays.copyOfRange(words, i + 1, len);
                permutation(prefix + words[i], concat(head, tail), set);
            }
        }
    }

    private String[] concat(String[] a, String[] b) {
        int aLen = a.length;
        int bLen = b.length;
        String[] c = new String[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
