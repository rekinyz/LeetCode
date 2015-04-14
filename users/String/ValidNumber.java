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

    @Override
    protected boolean isNumber(String s) {
        
    }

}
