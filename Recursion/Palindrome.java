/*
 * Problem: Check if a String is a Palindrome using Recursion
 * -----------------------------------------------------------
 * Given a string 's', write a recursive function to check whether
 * it is a palindrome or not.
 *
 * A palindrome is a string that reads the same forwards and backwards.
 *
 * Input:
 * - A string 's' consisting of lowercase or uppercase letters.
 *
 * Output:
 * - Print or return "Yes" if the string is a palindrome, else "No".
 *
 * Examples:
 * ---------
 * Input: s = "abba"
 * Output: Yes
 * Explanation: Reading forward and backward gives the same string.
 *
 * Input: s = "abc"
 * Output: No
 * Explanation: Forward is "abc", backward is "cba"
 *
 *
 * Approach: Recursive Two-Pointer Technique
 * -----------------------------------------
 * 1. Start with two pointers: one at the start (left = 0), one at the end (right = s.length() - 1).
 * 2. Compare the characters at the left and right positions:
 *    - If they don't match, it's not a palindrome → return false.
 *    - If they match, recursively check the inner substring (left+1, right-1).
 * 3. Base Case:
 *    - If left >= right → entire string has been checked → it's a palindrome.
 *
 * Example Walkthrough:
 * --------------------
 * isPalindrome("abba", 0, 3)
 * → 'a' == 'a' → check(1,2)
 * → 'b' == 'b' → check(2,1)
 * → left > right → return true
 *
 * Time Complexity:
 * - O(n), where n is the length of the string
 *
 * Space Complexity:
 * - O(n) due to recursion stack
 */

import java.util.*;
class Palindrome{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(check(s, 0, s.length()-1));
	}

	private static String check(String s, int l, int r){
		if(l > r) return "Yes";
		if(s.charAt(l) != s.charAt(r)) return "No";

		return check(s, l+1, r-1);
	}
}
