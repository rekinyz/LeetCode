package julian.qian.linear;

import static org.junit.Assert.fail;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class LRU<V,K> {
    private final LinkedHashMap<K,V> map;
    private final int size;
    public LRU(int size) {
        this.size = size;
        map = new LinkedHashMap<K,V>(size*2) {
            @Override protected boolean removeEldestEntry (Map.Entry<K,V> eldest) {
                return size() > LRU.this.size; }}; 
    }
    public synchronized V get(K k) {
        return map.get(k);
    }
    public synchronized void set(K k, V v) {
        map.put(k, v);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
