package com.leetcode.oj;

/**
 * Reverse Words in a String
 * 
 *  Given an input string, reverse the string word by word.
 *  For example, 
 *  Given s = "the sky is blue",
 *  return "blue is sky the".
 *  click to show clarification.
 *  
 *  Clarification:
 *      What constitutes a word?
 *      A sequence of non-space characters constitutes a word.
 *      Could the input string contain leading or trailing spaces?
 *      Yes. However, your reversed string should not contain leading or trailing spaces.
 *      How about multiple spaces between two words?
 *      Reduce them to a single space in the reversed string.
 * 
 * @author rekinyz
 */
public class ReverseWordsInAString {
    
    public String reverseWords(String s){
    	StringBuilder sb = new StringBuilder();
     	String[] split = s.split("\\s+");
     	int len = split.length;
     	for(int i=len-1;i>=0;i--){
     		sb.append(split[i]).append(" ");
     	}
     	return sb.toString().trim();
    }
    
    public String reverseWords1(String s){
    	String r = "";
    	String[] split = s.split("\\s+");
    	int len = split.length;
    	for(int i=len-1;i>=0;i--){
    		r+=split[i]+" ";
    	}
    	return r.trim();
    }

}
