package String;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.leetcode.oj.CompareVersionNumbersTest;
/********************************************************************************** 
 * 
 * Compare two version numbers version1 and version1.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 0.1 < 1.1 < 1.2 < 13.37
 * 
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 *               
 **********************************************************************************/

public class CompareVersionNumbers extends CompareVersionNumbersTest {
    public static List<Integer> toIntList(String[] s) {
        List<Integer> r = new ArrayList<Integer>();
        for (String a : s) {
            r.add(Integer.valueOf(a));
        }
        return r;
    }
    public static void rightTrimZero(List<Integer> s) {
        while (s.size()>0 && s.get(s.size()-1) == 0) {
            s.remove(s.size()-1);
        }
    }
    @Override
    protected int compareVersion(String v1, String v2){
        String[] vs1 = v1.split(Pattern.quote("."));
        String[] vs2 = v2.split(Pattern.quote("."));
        List<Integer> ver1 = toIntList(vs1);
        List<Integer> ver2 = toIntList(vs2);
        rightTrimZero(ver1);
        rightTrimZero(ver2);
        for (int i = 0; i < ver1.size() && i < ver2.size(); ++i) {
            if (ver1.get(i) < ver2.get(i)) {
                return -1;
            } else if (ver2.get(i) < ver1.get(i)) {
                return 1;
            }
        }

        //if the above for-loop is not returned, which means they are equal so far
        //then check the length.
        if (ver1.size() > ver2.size()) {
            return 1;
        }else if (ver1.size() < ver2.size()) {
            return -1;
        }

        return 0;

    }
}
