package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInAStringTest {

	ReverseWordsInAString rwis = new ReverseWordsInAString();

	@Test
	public void testReverseWords1() {
		String s = " the sky is blue asadf asd fasd fsdf as dfsadfsadf asd f  asdf      asd f adsasdf  asdf";
		assertEquals("asdf adsasdf f asd asdf f asd dfsadfsadf as fsdf fasd asd asadf blue is sky the", reverseWords(s));
	}

	@Test
	public void testReverseWords2() {
		String s = " ";
		assertEquals("", reverseWords(s));
	}

	@Test
	public void testReverseWords3() {
		String s = "";
		assertEquals("", reverseWords(s));
	}

	@Test
	public void testReverseWords4() {
		String s = "asdf";
		assertEquals("asdf", reverseWords(s));
	}

	@Test
	public void testReverseWords5() {
		String s = "rekinyz loves programming";
		assertEquals("programming loves rekinyz", reverseWords(s));
	}
	
	protected String reverseWords(String input){
		return rwis.reverseWords(input);
	}

}
