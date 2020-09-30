package dp;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * Given two strings S and T, determine if they are both one edit distance apart.

Hint:
1. If | n – m | is greater than 1, we know immediately both are not one-edit distance apart.
2. It might help if you consider these cases separately, m == n and m ≠ n.
3. Assume that m is always ≤ n, which greatly simplifies the conditional statements. 
If m > n, we could just simply swap S and T.
4. If m == n, it becomes finding if there is exactly one modified operation. 
If m ≠ n, you do not have to consider the delete operation. Just consider the insert operation in T.
问是一定要1 distance, 还是 《=1，一定要1，相等就false
 */
public class OneEditDistance {
    public static boolean run(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m>n) return run(t,s);
        int diff = n - m;
        if (diff > 1) return false;
        int i = 0;
        for (;i < m && s.charAt(i) == t.charAt(i); ++i);
        if (i == m) return diff > 0;
        // i !=m 
        //如果长度相同，中间有字符不同,需要一起比下一个，如果diff = 1, 那么因为s长度小，t要前进一位来比较 
        if (diff == 0) i++;
        for (;i < m && s.charAt(i) == t.charAt(i+1); ++i);
        return i == m;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
