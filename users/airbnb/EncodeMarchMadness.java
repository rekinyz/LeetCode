package airbnb;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * 就是体育比赛的积分图，应该是16进8进4直到冠军这种
 * how to encode March Madness brackets most efficiently, and then to write a function that, 
 * given an actual encoding and expected encoding, scores the candidate.
 * 需要问面试官 input和output的数据是啥，是给出所有两两较量的数据，算各队的分数？还是啥？可以用数组来encode binary tree
 * 是否是2的倍数，如果不是 2的倍数 空转如何处理，比赛顺序是否确定
 * 循环赛制和 淘汰赛是不一样的， 循环赛最佳做法是2维数组， 普通2维数组是 n*i + j, 如果需要减少内存，可以用 n*i + j-1 - (i+1)*i /2
 * 算积分最好用 array，直接返回，
 * 看两队比赛成绩，内存够，其实也可以用 2维数组， 用 matchTeam*2-1 不好直接找
 * 
 * Store a set of sudden-death tournament results in a compact format (eg. a bit array) and
 *  a set of predicted match results (also in a bit array). Score the predictions,
 *   giving one point per correctly guessed match, 
 * without unpacking the bit array into a more convenient format (ie. you have to traverse the tree in-place).  
 */
public class EncodeMarchMadness {
    int[] cycleScore;
    int[] matchScore;
    String[] teamNames;
    // total team = cycle * (match / top),  match is 2^n, (用 n & (n-1) == 0 来验证，  
    public EncodeMarchMadness(int cycleTeam, int matchTeam, int top, String[] teamNames) {
        this.teamNames = teamNames;
        assert(teamNames.length == cycleTeam * (matchTeam/top));
     // 每个循环赛是cycleTeam*(cycleTeam-1)/2，数量是matchTeam/top
        cycleScore = new int[cycleTeam*(cycleTeam-1)*(matchTeam/top)/2];
        matchScore = new int[matchTeam*2-1];
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
