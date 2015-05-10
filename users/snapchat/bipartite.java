package snapchat;

import java.util.LinkedList;
import java.util.Queue;

import junit.framework.Assert;

import org.junit.Test;

/*
 * 问如果是不连通的图，比如从开始节点到不了的节点
 * Determine whether a graph is bipartite
 * http://www.geeksforgeeks.org/bipartite-graph/
 * BFS
1.  Assign RED color to the source vertex (putting into set U).
2.  Color all the neighbors with BLUE color (putting into set V).
3.  Color all neighbor’s neighbor with RED color (putting into set U).
4.  This way, assign color to all vertices such that it satisfies all the constraints of
 m way coloring problem where m = 2.
5. While assigning colors, if we find a neighbor which is colored with same color as current vertex,
 then the graph cannot be colored with 2 vertices (or graph is not Bipartite)
 
 airbnb.OrderOfChar.Graph也有图
 */
public class bipartite {
    // assume v[0]是 src
    private final static int RED = 1;
    private final static int BLACK = -RED;
    
    public boolean run(int[][] v) {
        byte[] c = new byte[v.length];
        c[0] = RED;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < v.length; i++) {
                if (v[u][i] == 1 && i != u) {
                    if (c[i] == 0) {
                        c[i] =(byte) -c[u];
                    } else if (c[i] == c[u]) return false;
                }
            }
        }
        return true;
    }
    @Test
    public void test() {
        int[][] v = {{0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
            };
        
        Assert.assertEquals(true, run(v));
    }

}
