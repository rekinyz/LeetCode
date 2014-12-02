package com.leetcode.oj;

/**
 * Valid Palindrome
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases. 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car" is not a palindrome.
 *  
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome. 
 * 
 * @author rekinyz
 */
public class ValidPalindrome {
    
    public boolean isPalindrome(String s){
    	s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    	int tail = s.length()-1; 
    	for(int head=0; head<tail; head++,tail--){
    		if (s.charAt(head)!=s.charAt(tail) ){
				return false;
			}
    	}
    	return true;
    }
    
}
