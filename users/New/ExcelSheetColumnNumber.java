package New;

import static org.junit.Assert.fail;

import org.junit.Test;
/********************************************************************************** 
 * 
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For example:
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28 
 * 这个其实类似 base26
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 *               
 **********************************************************************************/

public class ExcelSheetColumnNumber {
    public static String toNumber(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0) {
            int digit = (n-1) % 26;
            char c = (char)('A' + digit);
            sb.append(c);
            n -= digit; //因为n是1base，所以这里要减去
            n /= 26;
        }
        return sb.reverse().toString();
    }
    public static long toInt(String s) {
        long r = 0;
        for (int i = 0; i < s.length(); ++i) {
            int n = s.charAt(i) - 'A' + 1;
            r = r * 26 + n;
        }
        return r;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
