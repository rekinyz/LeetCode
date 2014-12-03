package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.oj.util.ListNode;

public class RemoveDuplicatesFromSortedListTest {
	
	RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
	
	@Test
    public void testDeleteDuplicates0() {
    	int[] array = {2, 3, 3};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(2, 3));
    }
    @Test
    public void testDeleteDuplicates1() {
    	int[] array = {0, 1, 1, 2, 2, 3, 3};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0, 1, 2, 3));
    }
    @Test
    public void testDeleteDuplicates2() {
    	int[] array = {1, 1, 1, 1, 2, 3, 4, 4};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(1, 2, 3, 4));
    }
    @Test
    public void testDeleteDuplicates3() {
    	int[] array = {1, 2, 4, 5, 6, 7, 7};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(1, 2, 4, 5, 6, 7));
    }
    @Test
    public void testDeleteDuplicates4() {
    	int[] array = {0, 1, 2, 4, 5, 6, 7};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0, 1, 2, 4, 5, 6, 7));
    }
    @Test
    public void testDeleteDuplicates5() {
    	int[] array = {2, 3, 4, 4, 5};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(2, 3, 4, 5));
    }
    @Test
    public void testDeleteDuplicates6() {
    	int[] array = {0, 0};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0));
    }
    @Test
    public void testDeleteDuplicates7() {
    	int[] array = {0, 1};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0, 1));
    }
    @Test
    public void testDeleteDuplicates8() {
    	int[] array = {0, 1, 1};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0, 1));
    }
    @Test
    public void testDeleteDuplicates9() {
    	int[] array = {0, 1, 2, 2, 3, 4};
    	assertEquals(deleteDuplicates(array).toList(), Arrays.asList(0, 1, 2, 3, 4));
    }
    
    private ListNode deleteDuplicates(int[] array){
    	ListNode node = ListNode.convert(array);
    	return list.deleteDuplicates(node);
    }
}
