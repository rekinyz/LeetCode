package sort;

import static org.junit.Assert.fail;

import org.junit.Test;

public class SortColor {
    public void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public void twoPointer(int a[]) {
        int n = a.length;
        int red = 0, blue = n-1;
        for (int i = 0; i < n; ++i){
            if (a[i] == 0) {
                swap(a, i, red); //要把 i换到 red指示的地方
                red++;//多了一个red
                i++;//这里i++，因为换来的i，一定是1
            } else if (a[i]==2) {
                swap(a, i, blue);
                blue--; //这里i不增加，因为换来的i之前没有看过
            } else {
                i++;
            }
        }
    }
    /*
     * 快速排序的partition, 0的都分出来，其实不如两遍search.
     */
    public void partition() {
        
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
