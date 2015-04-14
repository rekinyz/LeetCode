package QueueStack;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import junit.framework.Assert;

import org.junit.Test;


public class Polish {
    public static boolean isOP(String s) {
        return s.length() == 1 && "+-*/".indexOf(s) != -1;
    }
	public static int reversePoslish(List<String> p) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < p.size(); ++i) {
            String s = p.get(i);
            if (isOP(s)) {
                if (stack.size() < 2) {
                    throw new RuntimeException("stack size " + stack.size());
                }
                char c = s.charAt(0); 
                switch (c) {
                    case '+': {
                        int a = stack.pop();
                        Integer b = stack.pop();
                        b += a; 
                        stack.push(b);}
                        break;
                    case '-': {
                        int a = stack.pop();
                        Integer b = stack.pop();
                        b -= a;stack.push(b);
                    }
                        break;
                    case '*': {
                        int a = stack.pop();
                        Integer b = stack.pop();
                        b *= a;stack.push(b);}
                        break;
                    case '/': {
                        int a = stack.pop();
                        Integer b = stack.pop();
                        b /= a;stack.push(b);}
                        break;
                    default:
                        throw new RuntimeException("not a number " + c);
                }
                
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.peek();
	    
	}
    
    @Test
    public void testR() {
        Assert.assertEquals(9, reversePoslish(Arrays.asList("2", "1", "+", "3", "*")));
        Assert.assertEquals(6, reversePoslish(Arrays.asList("4", "13", "5", "/", "+")));
    }
   
}
