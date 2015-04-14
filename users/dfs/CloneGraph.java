package dfs;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class CloneGraph {
    public static class UndirectedGraphNode {
        public int label;
        public List<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();
        public UndirectedGraphNode(int x) {
            label = x;
        }
    }
    public UndirectedGraphNode dfs(UndirectedGraphNode node) {
        if (node == null) return null;
        // old map to new:
        HashMap<UndirectedGraphNode, UndirectedGraphNode> copied = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        dfs(node, copied);
        return copied.get(node);
    }
    public UndirectedGraphNode dfs(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> copied) {
        UndirectedGraphNode c = copied.get(node);
        if (c != null) {
            return c;
        }
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        copied.put(node, newNode);
        for(UndirectedGraphNode n : node.neighbors) {
            newNode.neighbors.add(dfs(n, copied));
        }
        return newNode;
    }
    public UndirectedGraphNode bfs(UndirectedGraphNode node) {
        if (node == null) return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> copied = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        q.add(node);
        UndirectedGraphNode r = copied.put(node, new UndirectedGraphNode(node.label));
        while(!q.isEmpty()) {
            UndirectedGraphNode cur = q.poll();
            for (UndirectedGraphNode n : cur.neighbors) {
                UndirectedGraphNode newNode = copied.get(node);;
                if (newNode == null) {
                    newNode = new UndirectedGraphNode(n.label);
                    copied.put(n, newNode);
                    q.add(newNode);
                }
                copied.get(cur).neighbors.add(newNode);

            }
        }
        return r;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
