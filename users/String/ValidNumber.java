package String;

import com.leetcode.oj.ValidNumberTest;
/**
 * Valid Number
 * 
 * Validate if a given string is numeric.
 * 
 * Some examples: 
 * "0" => true 
 * "0.1 " => true 
 * "abc" => false 
 * "1 a" => false
 * "2e10" => true
 * 
 * Note: It is intended for the problem statement to be ambiguous. You should
 * gather all requirements up front before implementing one.
 * (\\s*) 去空格 [+-]? +-只出现一个 ? 出现一次或0次
 * (\\d+(\\.\\d*)? 全数字或数字.数字 允许数字.
 * 
 * 
 * s.matches("(\\s*)[+-]?((\\.\\d+)|(\\d+(\\.\\d*)?))([Ee][+-]?\\d+)?(\\s*)");
 * second method is state machine
 * 
*/
public class ValidNumber extends ValidNumberTest {
    public static final int INVALID = 0;
    public static final int SPACE = 1;
    public static final int SIGN = 2;
    public static final int DIGIT = 3;
    public static final int DOT = 4;
    public static final int EXPONENT = 5;
    public static boolean isNumber(char c) {
        return c >='0' && c <= '9';
      }
    public static boolean isNumber1(String toTest) {
          int len = toTest.length();
         
          for (int i = 0; i < len; ++i) {
            char c = toTest.charAt(i);
            if (!isNumber(c)) {
              if (i!=0 || c != '-') {                     
                return false;
              }
            }
          }
          return true;
    }
    @Override
    protected boolean isNumber(String s) {
        
    }

}
