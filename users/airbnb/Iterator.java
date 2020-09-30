package airbnb;

import static org.junit.Assert.fail;

import org.junit.Test;
/*
Given an array of arrays, implement an iterator class to allow the client to traverse and remove elements in the array list. This iterator should provide three public class member functions:

boolean has_next()
return true or false if there is another element in the set
int next()
return the value of the next element in the set
void remove()
remove the last element returned by the iterator. That is, remove the element that the previous next() returned
This method can be called only once per call to next(), otherwise, an exception will be thrown. See http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html#remove() for details.

The code should be well structured, and robust enough to handle any access pattern. Additionally, write code to demonstrate that the class can be used for the following basic scenarios:

Print elements
Given: [[],[1,2,3],[4,5],[],[],[6],[7,8],[],[9],[10],[]]
Print: 1 2 3 4 5 6 7 8 9 10

Remove even elements
Given: [[],[1,2,3],[4,5],[],[],[6],[7,8],[],[9],[10],[]]
Should result in: [[],[1,3],[5],[],[],[],[7],[],[9],[],[]]
Print: 1 3 5 7 9
*/

/*
* To execute Java, please define "static void main" on a class
* named Solution.
*
* If you need more classes, simply define them inline.
*/
public class Iterator {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
