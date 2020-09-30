package uber;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
/* 3Sum的变种
 * 3个长度一样的array a1, a2, a3, 找出所有 A + B = C 的组合，
 * A在a1里，B在a2，C在a3里；扩展到4个数组 a2, a2, a3, a4，找出A+B+C=D的组合。。 然后扩展到n各数组
 * 数组内数字有否重复？
 * 扩展到n
 * 排不排序不重要，因为这个题是n^2,排序是nlgn, 所以可以先排序再做
 * http://www.cs.mcgill.ca/~jking/papers/3sumhard.pdf
 * 经典的3SUM问题是同一个数组。
 * 可以相等于 n个2SUM，
 */

public class ArraySumN {
    public static void twoSum(List<List<Integer>> r, int[] a, int[] b, int k, List<Integer> sum) {
        if(a.length != b.length) return;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            m.put(k-a[i], i);
        }
        for (int i = 0; i < b.length; i++){
            Integer x = m.get(b[i]);
            if (x != null) {
                ArrayList<Integer> answer = new ArrayList<Integer>();
                answer.add(x);
                answer.add(i);
                answer.addAll(sum);
                r.add(answer);
            }
        }
    }
    // last one is sum
    public static List<List<Integer>> run3(int[][] a) {
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        int k = 3;
        if(a.length != k || a[0].length == 0) return r;
        for(int i = 0; i<a[2].length;++i) {
            List<Integer> sum = new ArrayList<Integer>();
            sum.add(i);
            twoSum(r, a[0], a[1], a[2][i], sum);
        }
        return r;
    }
    // KSUM
    public static HashMap<Integer, List<List<Integer>>> getSumHashMap(
            HashMap<Integer, List<List<Integer>>> sum, int[][] a, int pos) {
        if (pos == 0) return sum;
        int[] c = a[pos];
        HashMap<Integer, List<List<Integer>>> r = new HashMap<Integer, List<List<Integer>>>();
        for(Integer j : sum.keySet()) {
            List<List<Integer>> last = sum.get(j);
            for (int i = 0; i < c.length; ++i){
                int s = c[i];
                int diff = j-s;
                List<List<Integer>> m = r.get(diff);
                if (m == null) {
                    m = new ArrayList<List<Integer>>();
                }
                List<List<Integer>> answer = new ArrayList<List<Integer>>();
                for (List<Integer> list : last) {
                    List<Integer> newList = new ArrayList<Integer>(list);
                    newList.add(i);
                    answer.add(newList);
                }
                
                m.addAll(answer);
            }
        }
        return getSumHashMap(r, a, pos-1);
    }
    public static List<List<Integer>> ksum(int[][] a) {
        HashMap<Integer, List<List<Integer>>> m = new HashMap<Integer, List<List<Integer>>>();
        for (int i = 0; i < a[a.length-1].length; i++) {
            List<List<Integer>> listAnswer = new ArrayList<List<Integer>>();
            List<Integer> answer = new ArrayList<Integer>();
            listAnswer.add(answer);
            answer.add(i);
            m.put(a[a.length-1][i], listAnswer);
        }
        
        m = getSumHashMap(m, a, a.length-2);
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        for (int i = 0; i < a[0].length; ++i) {
            List<List<Integer>> x = m.get(a[0][i]);
            if (x != null) {
                for (List<Integer> list : x) {
                    list.add(i);
                    r.add(list);
                }
            }
        }
        return r;
    }    
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
