package sort;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstMissingPositive {
    static void bucket_sort(int a[]) {
        for (int i = 0; i < a.length; ++i) {
            while(a[i] != i+1) {// a[i] 这个数没有对
                // a[i] 如果在 0 到a.length之间，那么应该放到 a[i]-1,
                // 每次会把一个数放到正确的位置。
                // 如果遇到的数太大或太小，先不管，之后遇到该放在这个位置的数的时候会switch
                if (a[i] <=0 ||a[i] > a.length || a[i] == a[a[i]-1]) {
                    break; //先遇到 a[0] = -1 之后 a[1] = 1会在i = 1的时候换回来 
                }
                int tmp = a[i];
                a[i] = a[a[i]-1];
                a[a[i]-1] = tmp;
            }
        }
    }
    int missing(int a[]) {
        bucket_sort(a);
        for (int i = 0; i < a.length; ++i) {
            if (a[i]!= (i+1)) {
                return i+1;
            }
        }
        return a.length+1;
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
