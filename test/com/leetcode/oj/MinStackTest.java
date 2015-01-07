package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinStackTest {

	MinStack stack;
	
	@Before
	public void setUp(){
		stack = new MinStack();
	}
	
	@Test
	public void testGetMin1() {
		stack.push(0);
		stack.push(1);
		stack.push(0);
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(0, stack.getMin());
	}

	@Test
	public void testGetMin2() {
		stack.push(-3);
		assertEquals(-3, stack.getMin());
	}

	@Test
	public void testGetMin3() {
		stack.push(2);
		stack.push(0);
		stack.push(3);
		stack.push(0);
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(2, stack.getMin());
	}
	
	@Test
	public void testGetMin4() {
		stack.push(512);
		stack.push(-1024);
		stack.push(-1024);
		stack.push(512);
		stack.pop();
		assertEquals(-1024, stack.getMin());
		stack.pop();
		assertEquals(-1024, stack.getMin());
		stack.pop();
		assertEquals(512, stack.getMin());
	}

}
