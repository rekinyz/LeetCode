package dropbox;

import java.util.Arrays;

import org.junit.Test;

public class SArrayList<T> {
    protected Object[] data;
    protected int size;
    public SArrayList() {
        data = new Object[16];
    }
    public void add(T t) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length*2);
        }
        set(size, t);
        size++;
    }
    public void set(int index, T t) {
        data[index] = t;
    }
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }
    public void remove(int index) {
        for(int i = index; i < size - 1; ++ i) {
            data[i] = data[i+1];
        }
        size--;
    }
    public int size() {
        return size;
    }
    @Test
    public void test() {
    }

}
