package com.leetcode.oj;

import java.util.Stack;

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
 * 
 * @author rekinyz
 */
public class MinStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> min = new Stack<Integer>();
	
	/**
	 * Push element x onto stack
	 * @param x
	 */
	public void push(int x) {
		stack.push(x);
		if(min.isEmpty() || min.peek() >= x){
			min.push(x);
		}
	}

	/**
	 * Removes the element on top of the stack.
	 */
	public void pop() {
		if(min.peek().equals(stack.peek())){
			min.pop();
		}
		stack.pop();
	}

	/**
	 * Get the top element
	 * @return int element
	 */
	public int top() {
		return stack.peek();
	}

	/**
	 * Retrieve the minimum element in the stack
	 * @return int element
	 */
	public int getMin() {
		return min.peek();
	}
	
}
