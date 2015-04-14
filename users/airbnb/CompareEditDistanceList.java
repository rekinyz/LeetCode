package airbnb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
/* http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/com/sun/xml/internal/bind/v2/util/EditDistance.java
 * java native edit distance
Given a dictionary (list of words), write a function "similar" that takes a query "q" and returns
all words in the dictionary that are edit distance <= 1 from q.
最后要考虑优化，这里还有插入distance 参考 http://kylehg.github.io/interviews/

题目是给定一个word list 和一个target word，要求输出在word list 里跟target 
word的edit distance 相差不大于k的所有words。我写了一个基于edit distance的解
法(见下面)，程序是要从头到尾都要写，包括main函数和test数据。写完后他问有没有
更好的解法，我说可以用trie，但是我不觉得我能在剩余时间里写得出来基于trie的解
法，就大致说了一下我认为的思路。在此也求大牛给一个基于trie解法的code。
实现了4种方法
1: 直接遍历完整计算edit distance. 285 clocks.
2: 直接遍历，计算edit distance到 >k 就返回. 149 clocks.
3: Trie+shortcut edit distance. trie只能用于前缀相同的情况, 可以回答，如果条件release, 可以用trie
http://stevehanov.ca/blog/index.php?id=114 
4: Generate delete k transformation. Build dict: 17033 clocks. process: 0 
clocks.

// 3. 如果 word是固定的，可以生成hashmap，把k以内的变化都导入，直接用hash找
//For a word of length n, an alphabet size a, an edit distance d=1, 
//there will be n deletions, n-1 transpositions, a*n alterations, and a*(n+1) insertions, 
//for a total of 2n+2an+a-1 terms at search time.
// 一般来说 transpositions应该算2个操作？
// 4. 如果list是固定的，可以按照3生成hashmap，对应应该有的word，这样也是o（1）
// 5. 可以生成list里面所有word的 delete 一个字符的word，和要比较的word 所有del一个char的word比较，
// 因为edit distance是对称的，choosk-->choos-->choose  

但这里不仅需要生成delete k的pattern, 还需要生成所有delete 1..k-1的pattern, 
否则不能handle如(chrome brome)的case
http://blog.faroo.com/2012/06/07/improved-edit-distance-based-s 
http://stackoverflow.com/questions/12886997/how-to-find-all-strings-at-a-given-edit-distance-from-a-given-string
*/
public class CompareEditDistanceList {
    // 直接遍历完整计算edit distance
    public static List<String> run1(String t, String[] d, int k) {
        List<String> r = new ArrayList<String>();
        for (int i = 0; i < d.length; ++i) {
            if (dp.EditDistance.run(t, d[i]) <=k) { //EditDistance.editDistance is java native class
                r.add(d[i]);
            }
        }
        return r;
    }
    public static List<String> run2(String t, String[] d, int k) {
        List<String> r = new ArrayList<String>();
        for (int i = 0; i < d.length; ++i) {
            if (dp.EditDistance.run(t, d[i], k)) {
                r.add(d[i]);
            }
        }
        return r;
    }
    
    // generate all strings that is k distance from t.
    // //there will be n deletions, a*n alterations, and a*(n+1) insertions for k = 1
    public static List<String> gen(String t) {
        List<String> r = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        for (int i = 0; i < t.length(); ++i) {
            StringBuilder b = new StringBuilder(sb);
            b.deleteCharAt(i);
            r.add(b.toString());
        }
        for (int i = 0; i < t.length(); ++i) {
            char c = sb.charAt(i);
            for (char j='a'; j<c; ++i) {
                sb.setCharAt(i, j);
                r.add(sb.toString());
            }
            for (char j=c; j<='z'; ++i) {
                sb.setCharAt(i, j);
                r.add(sb.toString());
            }
        }
        for (int i = 0; i <= t.length(); ++i) {
            for (char j='a'; j<='z'; ++i) {
                StringBuilder b = new StringBuilder(sb);
                b.insert(i, j);
                r.add(b.toString());
            }
        }
        
        return r;
    }

    @Test
    public void test() {
        String[] d = new String[] {"bat", "batt", "cat", "beetle"};
        Assert.assertEquals(Arrays.asList("bat","cat"), run1("cat", d,1));
        Assert.assertEquals(Arrays.asList("bat","batt","cat"), run1("bat", d,1));
        Assert.assertEquals(Arrays.asList("cat"), run1("cats", d,1));

        Assert.assertEquals(Arrays.asList("bat","cat"), run2("cat", d,1));
        Assert.assertEquals(Arrays.asList("bat","batt","cat"), run2("bat", d,1));
        Assert.assertEquals(Arrays.asList("cat"), run2("cats", d,1));
    }

}
