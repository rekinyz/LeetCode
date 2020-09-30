package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.leetcode.oj.AnagramsTest;
/*
 * Given an array of strings, return all groups of strings that are anagrams.
Note: All inputs will be in lower-case.
问空格是否需要
 */
public class Anagrams extends AnagramsTest {
    @Override
    public List<String> anagrams(String[] strs){
        HashMap<String,List<String>> group = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String sorted = String.valueOf(a).replaceAll(" ", "");
            List<String> b = group.get(sorted);
            if (b == null) {
                b = new ArrayList<String>();
                group.put(sorted, b);
            }
            b.add(s);
        }
        List<String> r = new ArrayList<String>();
        for (List<String> b : group.values()) {
            if (b.size()>1)  r.addAll(b);
        }
        
        return r;
    }
}
