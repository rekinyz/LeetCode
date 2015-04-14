package dp;

import static org.junit.Assert.fail;

import org.junit.Test;
/********************************************************************************** 
 * 
 * The demons had captured the princess (P) and imprisoned her in the bottom-right corner of a dungeon. 
 * The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (K) was initially positioned 
 * in the top-left room and must fight his way through the dungeon to rescue the princess. 
 *
 * The knight has an initial health point represented by a positive integer. 
 * If at any point his health point drops to 0 or below, he dies immediately. 
 *
 * Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; 
 * other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).
 * In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step. 
 * 
 * Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.
 * For example, given the dungeon below, the initial health of the knight must be at least 7 if he follows the optimal path 
 * RIGHT-> RIGHT -> DOWN -> DOWN.
 * 
 *   
 *   +------+------+------+
 *   |      |      |      |
 *   | -2(K)|  -3  |  -3  |
 *   |      |      |      |
 *   +--------------------+
 *   |      |      |      |
 *   |  -5  | -10  |   1  |
 *   |      |      |      |
 *   +--------------------+
 *   |      |      |      |
 *   |  10  |  30  | -5(P)|
 *   |      |      |      |
 *   +------+------+------+
 *   
 * 
 * Notes:
 * 
 * The knight's health has no upper bound.
 * Any room can contain threats or power-ups, 
 * even the first room the knight enters and the bottom-right room where the princess is imprisoned.  
 * 
 * Credits:Special thanks to @stellari for adding this problem and creating all test cases.
 *               
 **********************************************************************************/
// dp[r][c] = min( max( dp[r+1][c] - dungeon[r][c], 1), max( dp[r][c+1] - dungeon[r][c], 1) );
public class DungeonGame {
    public static int run(int[][] d) {
        int r = d.length;
        if (r == 0) return 0;
        int c = d[0].length;
        if (c == 0) return 0;
        int[][] dp = new int[r][c];
        for (int i = r-1; i >= 0; ++i) {
            for(int j = c - 1; j >= 0; ++j) {
                if (i == r-1 && j == c -1) {
                    dp[i][j] = Math.max(1, 1-d[i][j]);
                } else {
                    int h1,h2;
                    if (i == r-1) {
                        h1 = Integer.MAX_VALUE;
                    } else {
                        h1 = Math.max(dp[i+1][j]-d[i][j], 1);
                    }
                    if (j == c-1) {
                        h2 = Integer.MAX_VALUE;
                    } else {
                        h2 = Math.max(dp[i][j+1]-d[i][j], 1);
                    }
                    dp[i][j] = Math.min(h1,h2);
                }
            }
        } 
        return dp[0][0];
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
