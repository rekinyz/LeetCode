package New;

import java.util.HashMap;

import org.junit.Test;
/********************************************************************************** 
* 
* Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
* 
* If the fractional part is repeating, enclose the repeating part in parentheses.
* 
* For example,
* 
* Given numerator = 1, denominator = 2, return "0.5".
* Given numerator = 2, denominator = 1, return "2".
* Given numerator = 2, denominator = 3, return "0.(6)".
* 
* Credits:Special thanks to @Shangrila for adding this problem and creating all test cases.
*               
**********************************************************************************/
public class FractionToRecurringDecimal {
    public static String run(long n, long d) {
        if (d == 0) return "";
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean sign = (n/d) >= 0;
        if (n<0) { n = -n;}
        if (d < 0) d = -d;
        if (!sign) sb.append('-');
        long reminder = n % d;
        long division = n/d;
        sb.append(division);
        if (reminder == 0) return sb.toString();
        sb.append('.');
        HashMap<Long, Integer> rec = new HashMap<Long, Integer>();
        for (int p = sb.length(); reminder != 0; p++, reminder = (reminder*10) %d) {
            if (rec.containsKey(reminder)) {
                sb.insert(rec.get(reminder).intValue(), '(');
                sb.append(')');
                return sb.toString();
            }
            rec.put(reminder, p);
            char c =(char) ((reminder*10)/d + '0');
            sb.append(c);
        }
        return sb.toString();
    }
    public static void test(int num, int deno) {
        System.out.format("%d %d %s\r\n", num, deno, run(num, deno));
    }
    @Test
    public void test() {
        test(1, 2);
        test(10, 2);
        test(100, 2);
        test(1, 3);
        test(100, 3);
        test(1, 6);
        test(100, 6);
        test(-1, 4);
        test(1, -3);
        test(-1, -6);
        test(25, 99);
        test(1, 7);
        test(10, 7);
        test(100, 7);
        test(1, 17);
        test(1, 1024);
        test( -2147483648, -1999);
        test(-1, -2147483648);
    }

}
