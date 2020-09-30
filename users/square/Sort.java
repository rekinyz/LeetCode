package square;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
 * [1,5,3,2,7,4,2,4,3] -> [1...7]

Sort array both with and without duplicates.
 */
public class Sort {
    public static void sort(int[] v) {
        if(v == null || v.length < 2) return;
        qsort(v, 0, v.length-1);
    }
    public static void qsort(int[] v, int low, int high) {
        int i = low, j = high;
        int pivot = v[(low+high) >> 1];
        while (i <=j) {
            while(v[i] < pivot) i++;
            while(v[j] > pivot) j--;
            if (i < j) {
                int t = v[i];
                v[i] = v[j];
                v[j] = t;
            }
        }
        if (low < j) qsort(v, low, j);
        if (i<high) qsort(v, i, high);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
