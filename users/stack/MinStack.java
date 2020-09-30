package stack;

import java.util.LinkedList;

/**
 * Min Stack
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. 
 * pop() -- Removes the element on top of the stack. 
 * top() -- Get the top element. 
 * getMin() -- Retrieve the minimum element in the stack.
*/
public class MinStack {
    private final LinkedList<Integer> stack = new LinkedList<Integer>();
    private final LinkedList<Integer> min = new LinkedList<Integer>();
    public void push(int x) {
        stack.add(x);
        //保存相对目前stack top元素的最小元素
        if (min.isEmpty() || min.getLast() >= x) {
            min.addLast(x);
        }
    }

    /**
     * Removes the element on top of the stack.
     */
    public void pop() {
        if (getMin() == top()) {
            min.removeLast();
        }
        stack.removeLast();
    }

    /**
     * Get the top element
     * 
     * @return int element
     */
    public int top() {
        return stack.getLast();
    }

    /**
     * Retrieve the minimum element in the stack
     * 
     * @return int element
     */
    public int getMin() {
        return min.getLast();
    }
}
