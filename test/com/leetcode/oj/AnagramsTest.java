package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsTest {
	
	Anagrams a = new Anagrams();

	@Test
	public void testAnagrams1(){
		String[] strs = { "earth", "asdf", "heart" };
		assertEquals(anagrams(strs), Arrays.asList("earth", "heart"));
	}
	
	@Test
	public void testAnagrams2(){
		String[] strs = { "earth", "roll in the hay", "heart", "thrill a honey" };
		assertEquals(anagrams(strs), Arrays.asList("earth", "heart", "roll in the hay", "thrill a honey"));
	}
	
	@Test
	public void testAnagrams3(){
		String[] strs = { "james stuart", "just a master" };
		assertEquals(anagrams(strs), Arrays.asList("james stuart", "just a master"));
	}
	
	private List<String> anagrams(String[] strs){
		return a.anagrams(strs);
	}
	
}
