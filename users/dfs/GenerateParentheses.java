package dfs;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.oj.GenerateParenthesesTest;
/*
 * 
 */
public class GenerateParentheses extends GenerateParenthesesTest {
    @Override
    protected List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<String>();
        if (n<=0) {
            r.add("");
        } else if (n==1) {
            r.add("()");
        } else {
            for (int i = 0; i < n; ++i) {
                for (String inner : generateParenthesis(i)) {
                    // 因为有一个（）已经被拿掉了，所以总数是n-1
                    for (String outter : generateParenthesis(n-i-1)) {
                        r.add("("+ inner +")"+outter);
                    }
                }
            }
        }
        
        return r;
    }

}
