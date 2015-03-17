package java.util;

import org.junit.Test;

import uber.FastLinkedList;
/*http://blog.csdn.net/whuwangyi/article/details/43112895
 * 要求设计一个数据结构，满足insert(int key)，remove(int key)和int getMostFrequentKey()。
 * 对于同一个key，每次被insert，计数加1；每次被remove，计数减1；然后需要取最大count的key。要求所有操作都是O(1)复杂度。
 */
public class HashBucket {
    private static final long serialVersionUID = 1L;
    public static class Node {
        int key;
        FastLinkedList.Node<Bucket> b;
        Node(int key) {
            this.key = key;
        }
        public void bind(FastLinkedList.Node<Bucket> b) {
            if (this.b != null) {
                this.b.item.nodes.remove(this);
            }
            this.b = b;
            b.item.add(this);
        }
    }
    public static class Bucket {
        int freqCount;
        Set<Node> nodes;
        public Bucket(int c) {
            freqCount = c;
            nodes = new HashSet<Node>();
        }
        public void add(Node n) {
            nodes.add(n);
        }
    }
    public HashBucket() {
        freq = new FastLinkedList<Bucket>();
        nodes = new HashMap<Integer, Node>();
    }
    FastLinkedList<Bucket> freq;
    private final HashMap<Integer, Node> nodes;
    private void addToNewbucket1(Node n) {
        Bucket b = new Bucket(1);
        n.bind(freq.addAndReturnLast(b));
    }
    public void insert(int key) {
        Node n = nodes.get(key);
        if (n==null) {
            n = new Node(key);
            nodes.put(key, n);
            if (freq.isEmpty()) {
                addToNewbucket1(n);
            } else {
                FastLinkedList.Node<Bucket> b = freq.getLastNode();
                if (b.item.freqCount != 1) {
                    addToNewbucket1(n);
                } else {
                    n.bind(b);
                }
            }
        } else {
            FastLinkedList.Node<Bucket> p = n.b.prev;
            if (p == null) { // first node
                Bucket b = new Bucket(n.b.item.freqCount + 1);
                n.bind(freq.addAndReturnFirst(b));
            } else {
                // find previous
                if (p.item.freqCount == (n.b.item.freqCount + 1)) {
                    n.bind(p);
                } else {
                    // insert after p, before b
                    Bucket b = new Bucket(n.b.item.freqCount + 1);
                    n.bind(freq.linkBefore(b, n.b));
                }
            }
        }
    }
    public void remove(int key) {
        Node n = nodes.get(key);
        if (n!=null) {
            if (n.b.item.freqCount == 1) {
                // remove without add it back
                n.b.item.nodes.remove(n);
                nodes.remove(key);
                return;
            }
            FastLinkedList.Node<Bucket> p = n.b.next;
            if (p == null) { // last node
                Bucket b = new Bucket(n.b.item.freqCount - 1);
                n.bind(freq.addAndReturnLast(b));
            } else {
                // find next
                if (p.item.freqCount == (n.b.item.freqCount - 1)) {
                    n.bind(p);
                } else {
                    // insert after p, before b
                    Bucket b = new Bucket(n.b.item.freqCount - 1);
                    n.bind(freq.linkBefore(b, p));
                }
            }

        }
    }
    public int getMostFrequentKey() {
        if (freq.isEmpty()) return -1;
        Bucket b = freq.getFirst();
        return b.freqCount;
    }
    @Test
    public void test() {
        LinkedList<Integer> a = new LinkedList<Integer>();
        
        Iterator<Integer> x = a.iterator();
        x.remove();
    }

}
