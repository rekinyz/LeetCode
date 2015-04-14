package String;

import com.leetcode.oj.ReverseWordsInAStringTest;

public class ReverseWordsInAString extends ReverseWordsInAStringTest {

    @Override
    protected String reverseWords(String s){
        if (s.length() <=1) return s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0, b = 0; i <s.length()+1; ++i) {
            if (i == s.length()||sb.charAt(i) == ' ') {
                int e = i-1;
                while (b < e) {
                    char c = sb.charAt(b);
                    sb.setCharAt(b, sb.charAt(e));
                    sb.setCharAt(e, c);
                    b++;
                    e--;
                }
                b = i +1;
            }
        }
        return sb.toString();
    }

}
