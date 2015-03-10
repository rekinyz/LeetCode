package dp;

import static org.junit.Assert.fail;

import org.junit.Test;

public class EditDistance {
    public static int stringEditDistance(String s1, String s2) {
        if (s1.length() == 0) {
            if (s2.length() == 0) {
                return 0;
            } else {
                return s2.length();
            }
        } else if (s2.length() == 0) {
            return s1.length();
        }
        int [][] m = new int[s1.length()+1][s2.length()+1];
        m[0][0] = 0;
        
        for (int i = 0; i <= s2.length(); ++i) {
            m[0][i] = i;
        }
        for (int i = 0; i <= s1.length(); ++i) {
            m[i][0] = i;
        }
        for (int i = 1; i <= s1.length(); ++i) {
            for (int j = 1; j <= s2.length(); ++j) {
                
                m[i][j] = Math.min(m[i-1][j-1] + ((s1.charAt(i-1) == s2.charAt(j-1))?0:1), 
                        Math.min(m[i-1][j]+1, m[i][j-1]+1));
            }
        }
        return m[s1.length()][s2.length()];
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
