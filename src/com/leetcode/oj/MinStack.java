package com.leetcode.oj;

import java.util.ArrayList;
import java.util.List;
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

	private List<Integer> stack = new ArrayList<Integer>();
	private List<Integer> min = new ArrayList<Integer>();
	
	/**
	 * Push element x onto stack
	 * @param x
	 */
	public void push(int x) {
		stack.add(x);
		if(min.isEmpty() || min.get(min.size()-1) >= x){
			min.add(x);
		}
	}

	/**
	 * Removes the element on top of the stack.
	 */
	public void pop() {
		if(getMin()==top()){
			min.remove(min.size()-1);
		}
		stack.remove(stack.size()-1);
	}

	/**
	 * Get the top element
	 * @return int element
	 */
	public int top() {
		return stack.get(stack.size()-1);
	}

	/**
	 * Retrieve the minimum element in the stack
	 * @return int element
	 */
	public int getMin() {
		return min.get(min.size()-1);
	}
	
}
