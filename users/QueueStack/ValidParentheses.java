package QueueStack;

import java.util.Stack;

import com.leetcode.oj.ValidParenthesesTest;

public class ValidParentheses extends ValidParenthesesTest {

    private int left(char c) {
        switch (c) {
        case '(': return 0;
        case '[': return 1;
        case '{': return 2;
        }
        return -1;
    }
    private int right(char c) {
        switch (c) {
        case ')': return 0;
        case ']': return 1;
        case '}': return 2;
        }
        return -1;
    }
    @Override
    protected boolean isValid(String str) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            int a = left(c);
            if (a >=0) {
                stack.push(a);
            }else{
                if (stack.isEmpty()) {
                    return false;
                } else {
                    int b = right(c);
                    int t = stack.pop();
                    if (b != t) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
