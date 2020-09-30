package dropbox;
import java.util.ArrayList;

/*
 * http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/7-b147/java/util/PriorityQueue.java#PriorityQueue
 * priority queue，additional request：可以change 已有的priority，method里先lock，最后unlock，multithread and thread safe
参考 https://github.com/jq/disruptor
用thread pool 实现aync data fetching，实现thread pool，main thread放job到thread pool，thread pool notify main thread
 */
public class PQueue <E> {
	ArrayList<E> d;
	public PQueue(int size) {
		d = new ArrayList<E>(size);
	}
	public PQueue() {
		d = new ArrayList<E>();
	}

	public E element() {
		if (d.isEmpty()) return null;
		return d.get(0);
	}
	
	// down top siftup
	// a parent node is the node/2 position
	public void add(E e) {
		if (e == null) throw new NullPointerException();
		d.add(e);
		if (d.size() == 1) return;
	    @SuppressWarnings("unchecked")
		Comparable<? super E> key = (Comparable<? super E>) e;
	    
		int x = d.size() - 1;
		while (x > 0) {
			int p = (x-1) >>> 1; 
			E cp = d.get(p);
			if (key.compareTo(cp) >= 0) {
				break;
			}
			d.set(x, cp);
			x = p;
		}
		d.set(x,e);
	}
	
	// top down siftdown
	@SuppressWarnings("unchecked")
	public E poll() {
		if (d.isEmpty()) return null;
		E result = d.get(0);
		int size = d.size() - 1;
		E e = d.get(size);
		@SuppressWarnings("unchecked")
		Comparable<? super E> key = (Comparable<? super E>) e;

		d.set(0, e);
		d.remove(size);
		int k = 0;
		int half = size >>> 1;
		while (k < half) {
			int c = (k << 1) + 1;
			E child = d.get(c);
			int right = c + 1;
			if (right < size) {
				E r = d.get(right);
				if (((Comparable <? super E>)child).compareTo(r) > 0) {
					child = r;
					c = right;
				}
			}
			if (key.compareTo(child) <=0) {
				break;
			}
			d.set(k, child);
			k = c;
		}
		if (size > 0) d.set(k, e);
		return result;
	}
}
