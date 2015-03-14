package uber;

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
    //public static List<String> allPalindrome(String s) {
    //}

    @Test
    public void test() {
        Assert.assertEquals(false, canBePalindrome("uber"));
        Assert.assertEquals(true, canBePalindrome("carecra"));
    }

}
