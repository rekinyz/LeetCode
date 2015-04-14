package airbnb;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * http://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/
 * 问是否有可能数据不够断定排序
 * Input:  words[] = {"baa", "abcd", "abca", "cab", "cad"}
 Output: Order of characters is 'b', 'd', 'a', 'c'
 Note that words are sorted and in the given language "baa" 
 comes before "abcd", therefore 'b' is before 'a' in output.
 Similarly we can find other orders.

 Input:  words[] = {"caa", "aaa", "aab"}
 Output: Order of characters is 'c', 'a', 'b'
 前后单词按字母比较，不同的字母就能看出差别，但是只能有一个字母来看出差别
 如果单词不等长，只比较相等长度的部分。
 */
public class OrderOfChar {
    public static class Graph {
        List<List<Integer>> adj;
        public Graph(int v) {
            adj = new ArrayList<List<Integer>>();
            for (int i = 0; i < v; ++i) {
                adj.add(new ArrayList<Integer>());
            }
        }
        // may get dup w, but seems ok. we could use set to reduce dup
        public void addEdge(int v, int w) {
            adj.get(v).add(w);
        }
        // visited v
        public void topologicalSortUtil(int v, boolean[] visited, List<Integer> stack) {
            visited[v] = true;
            List<Integer> neighbours = adj.get(v);
            for (int i = 0; i < neighbours.size(); ++i) {
                int n = neighbours.get(i);
                if(!visited[n]) {
                    topologicalSortUtil(n, visited, stack);
                }
            }
            stack.add(v);
        }
        public List<Integer> topologicalSort() {
            List<Integer> stack = new ArrayList<Integer>();
            boolean[] visited = new boolean[adj.size()];
            for(int i = 0; i < adj.size(); ++ i) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }
            // reverse order
            return stack;
        }
        public static List<Integer> printOrder(String[] words, int alphaSize) {
            Graph g = new Graph(alphaSize);
            for (int i = 0; i < words.length-2; i++) {
                int minlen = Math.min(words[i].length(), words[i+1].length());
                for (int j = 0; j < minlen; ++j) {
                    char a = words[i].charAt(j);
                    char b = words[i+1].charAt(j);
                    if (a != b) {
                        g.addEdge(a-'a', b-'a');
                        break;
                    }
                }
            }
            return g.topologicalSort();
        }
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
