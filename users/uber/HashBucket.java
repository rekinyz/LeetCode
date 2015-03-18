package uber;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;
/*http://blog.csdn.net/whuwangyi/article/details/43112895
 * 要求设计一个数据结构，满足insert(int key)，remove(int key)和int getMostFrequentKey()。
- * 对于同一个key，每次被insert，计数加1；每次被remove，计数减1；然后需要取最大count的key。要求所有操作都是O(1)复杂度。
 * so instead of using set to save Bucket Elem mapping, it is better use FastLinkedList
 */
public class HashBucket {
    public static class Elem {
        int key;
        FastLinkedList.Node<Bucket> b;
        Elem(int key) {
            this.key = key;
        }
        public FastLinkedList.Node<Elem> bind(FastLinkedList.Node<Bucket> b) {
            assert(this.b == null);
            this.b = b;
            FastLinkedList.Node<Elem> elem = b.item.nodes.addAndReturnLast(this);
            return elem;
        }
    }
    public static class Bucket {
        int freqCount;
        FastLinkedList<Elem> nodes;
        public Bucket(int c) {
            freqCount = c;
            nodes = new FastLinkedList<Elem>();
        }
    }
    public HashBucket() {
        freq = new FastLinkedList<Bucket>();
        elems = new HashMap<Integer, FastLinkedList.Node<Elem>>();
    }
    FastLinkedList<Bucket> freq;
    private final HashMap<Integer, FastLinkedList.Node<Elem>> elems;
    private FastLinkedList.Node<Elem> getNodeElem(FastLinkedList.Node<Bucket> b, int key) {
        Elem e = new Elem(key);
        return e.bind(b);
    }
    private void bind(FastLinkedList.Node<Elem> e, FastLinkedList.Node<Bucket> b) {
        Elem elem = e.item.b.item.nodes.unlink(e);
        if (elem.b.item.nodes.isEmpty()) {
            freq.unlink(elem.b);
        }
        elem.b = null;
        e = elem.bind(b);
        elems.put(elem.key, e);// KEY, java copy is just reference copy, so have to put to map again or do a value copy
    }
    public void insert(int key) {
        FastLinkedList.Node<Elem> n = elems.get(key);
        if (n==null) {
            FastLinkedList.Node<Bucket> bNode = null;
            if (!freq.isEmpty()) {
                FastLinkedList.Node<Bucket> last = freq.getLastNode();
                if (last.item.freqCount == 1) {
                    bNode = last;
                }
            }
            if (bNode == null) {
                Bucket b = new Bucket(1);
                bNode = freq.addAndReturnLast(b);
            }
            n = getNodeElem(bNode, key);
            elems.put(key, n);
        } else {
            FastLinkedList.Node<Bucket> p = n.item.b.prev;
            if (p == null) { // first node
                Bucket b = new Bucket(n.item.b.item.freqCount + 1);
                bind(n,freq.addAndReturnFirst(b));
            } else {
                // find previous
                if (p.item.freqCount == (n.item.b.item.freqCount + 1)) {
                    bind(n, p);
                } else {
                    // insert after p, before b
                    Bucket b = new Bucket(n.item.b.item.freqCount + 1);
                    bind(n, freq.linkBefore(b, n.item.b));
                }
            }
        }
    }
    public void remove(int key) {
        FastLinkedList.Node<Elem> n = elems.get(key);
        if (n != null) {
            if (n.item.b.item.freqCount == 1) {
                // remove without add it back
                n.item.b.item.nodes.remove(n);
                elems.remove(key);
                if (n.item.b.item.nodes.isEmpty()) {
                    freq.unlink(n.item.b);
                }
                return;
            }
            FastLinkedList.Node<Bucket> p = n.item.b.next;
            if (p == null) { // last node
                Bucket b = new Bucket(n.item.b.item.freqCount - 1);
                bind(n, freq.addAndReturnLast(b));
            } else {
                // find next
                if (p.item.freqCount == (n.item.b.item.freqCount - 1)) {
                    bind(n, p);
                } else {
                    // insert after p, before b
                    Bucket b = new Bucket(n.item.b.item.freqCount - 1);
                    bind(n, freq.linkBefore(b, p));
                }
            }

        }
    }
    public int getMostFrequentKey() {
        if (freq.isEmpty()) return -1;
        Bucket b = freq.getFirst();
        assert(!b.nodes.isEmpty());
        return b.nodes.iterator().next().key;
    }
    @Test
    public void test() {
        HashBucket h = new HashBucket();
        h.insert(1);
        Assert.assertEquals(1, h.getMostFrequentKey());
        h.insert(2);
        h.insert(2);
        Assert.assertEquals(2, h.getMostFrequentKey());
        h.insert(1);
        h.insert(1);
        Assert.assertEquals(1, h.getMostFrequentKey());
        h.remove(1);
        h.remove(1);
        Assert.assertEquals(2, h.getMostFrequentKey());
        h.remove(2);
        h.remove(2);
        Assert.assertEquals(1, h.getMostFrequentKey());

    }

}
