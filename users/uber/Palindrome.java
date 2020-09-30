package uber;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class Palindrome {
    static final int ANUM = 26;
    // given string, can we use it to generate palindrome
    // e.g. 'uber' --> False, 'aab' --> True, 'carecra' --> True
    // assume no capital and no number
    public static boolean canBePalindrome(String s) {
        int[] counter = freq(s);
        int numOfOdd = 0;
        for (int i = 0; i < ANUM; ++i) {
            if ((counter[i] % 2) != 0) {
                if (numOfOdd == 1) return false;
                numOfOdd++;
            }
        }
        
        return true;
    }
    
    public static int[] freq(String s) {
        int[] counter = new int[ANUM];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            c -= 'a';
            counter[c]++;
        }
        return counter;
    }

    // all possilbe Palindrome from given s
    // it is special permutation for given list of chars
    // should use allow dup permutation
    public static List<String> genPalindrome(String s) {
        int[] counter = freq(s);
        int numOfOdd = 0;
        char odd = 0;
        int size = s.length()/2;
        System.out.println(Arrays.toString(counter));
        for (int i = 0; i < ANUM; ++i) {
            int newValue = counter[i]/2;
            if ((counter[i] % 2) != 0) {
                if (numOfOdd == 1) return null;
                counter[i] /= 2;
                numOfOdd++;
                odd = (char) ('a' + i);
            } else {
                counter[i] = newValue;
            }
        }
        System.out.println(Arrays.toString(counter));
        List<String> p = Permutation.allowDup(counter, size);
        List<String> r = new ArrayList<String>(p.size());
        StringBuffer sb = new StringBuffer();
        for (String a : p) {
            String reverse = new StringBuffer(a).reverse().toString();
            sb.append(a);
            if (odd > 0) {
                sb.append(odd);                
            }
            sb.append(reverse);
            r.add(sb.toString());
            if (!reverse.equals(a)) {
                r.add(sb.reverse().toString());
            }
            sb.setLength(0);
        }
        return r;
    }
    

    @Test
    public void test() {
        Assert.assertEquals(false, canBePalindrome("uber"));
        Assert.assertEquals(true, canBePalindrome("carecra"));
        List<String> s1 = Arrays.asList("abc","acb","bac","bca","cab","cba");
        Assert.assertEquals(null, genPalindrome("abc"));
        List<String> s2 = Arrays.asList("aca");
        Assert.assertEquals(s2, genPalindrome("aac"));
    }

}
