package uber;

import junit.framework.Assert;

import org.junit.Test;

public class Palindrome {
    // given string, can we use it to generate palindrome
    // e.g. 'uber' --> False, 'aab' --> True, 'carecra' --> True
    // assume no capital and no number
    public static boolean canBePalindrome(String s) {
        final int ANUM = 26;
        boolean[] odd = new boolean[ANUM];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            c -= 'a';
            odd[c] = !odd[c];
        }
        int numOfOdd = 0;
        for (int i = 0; i < ANUM; ++i) {
            if (odd[i]) {
                numOfOdd++;
            }
        }
        
        return numOfOdd < 1;
    }

    // all possilbe Palindrome from given s
    // it is special permutation for given list of chars 
    public static List<String> allPalindrome(String s) {
    }

    @Test
    public void test() {
        Assert.assertEquals(false, canBePalindrome("uber"));
        Assert.assertEquals(false, canBePalindrome("carecra"));
    }

}
