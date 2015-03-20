package real;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.oj.LetterCombinationsOfAPhoneNumberTest;

public class LetterCombinationOfPhoneNumber extends LetterCombinationsOfAPhoneNumberTest {
    private final static String[] LETTERS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    protected List<String> letterCombinations(String digits) {
        List<String> r = new ArrayList<String>();
        r.add("");
        for (int i = 0; i < digits.length(); ++i) {
            int c = digits.charAt(i)-'0';
            if (c<=1) return r;
            String b = LETTERS[c];
            List<String> m = new ArrayList<String>(r.size()*b.length());
            for (String a : r) {
                for (int j = 0; j < b.length(); ++j) {
                    m.add(a + b.charAt(j));
                }
            }
            r = m;
        }
        return r;
    }

}
