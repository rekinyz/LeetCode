package julian.qian.string;

import com.leetcode.oj.StringToIntegerATOITest;
/*
 * Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and
ask yourself what are the possible input cases.
Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible
to gather all the input requirements up front.
Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace
character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by
as many numerical digits as possible, and interprets them as a numerical value.
The string can contain additional characters after those that form the integral number, which are ignored
and have no effect on the behavior of this function.
If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such
sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
If no valid conversion could be performed, a zero value is returned. If the correct value is out of the
range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
1. 不规则输入，但是有效，”-3924x8fc”，” + 413”,
3.4 Add Binary 61
2. 无效格式，” ++c”, ” ++1”
3. 溢出数据，”2147483648”
 */
public class StringToIntegerATOI extends StringToIntegerATOITest {
    public int atoiReg(String str) {
        if (str == null) {
            return 0;
        }
        // 用^ $来做全匹配 \\s* 匹配前面的空格换行之类 .*匹配后面不用的，对付-3924x8fc
        // (?<number>[\\+-]?\\d+)是数字部分 ?<number>起一个匹配group叫number,后面直接取这个部分
        // [\\+-]? 匹配 +或-0次到一次 
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("^\\s*(?<number>[\\+-]?\\d+).*$");
        java.util.regex.Matcher m = p.matcher(str);

        if (m.find()) {
            String numberStr = m.group("number");
            char signChar = numberStr.charAt(0);

            if (signChar >= '0' && signChar <= '9') {
                signChar = '+';
            }

            int number = -1;
            try {
                number = Integer.parseInt(numberStr);
            } catch (Exception e) {
                if (signChar == '-') {
                    number = Integer.MIN_VALUE;
                } else {
                    number = Integer.MAX_VALUE;
                }
            }
            return number;
        }
        return 0;
    }
    @Override
    public int atoi(String str) {
        return atoiReg(str);
    }
    public int atoinoreg(String str) {
        int num = 0;
        int sign = 1;
        
        int i = 0;
        while(str.charAt(i) == ' ' && i < str.length()) i++;
        if(str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i)=='-') {
            sign = -1;
            i++;
        }
        for(; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c <'0'|| c >'9') break;
            if (num>Integer.MAX_VALUE/10 ||
                    (num == Integer.MAX_VALUE/10 && 
                    (c-'0')>Integer.MAX_VALUE%10)) {
                return sign == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            num = num *10 + c - '0';
        }
        
        return num*sign;
    }
    
}
