/*
 * Problem: Generate Binary Strings of Length N
 * --------------------------------------------
 * Given an integer N, generate all possible binary strings of length N.
 * Each string should consist only of the characters '0' and '1'.
 * 
 * Input:
 * - An integer n (length of each binary string)
 * 
 * Output:
 * - Print all binary strings of length n, one per line.
 * 
 * Example:
 * Input: n = 3
 * Output:
 * 000
 * 001
 * 010
 * 011
 * 100
 * 101
 * 110
 * 111
 * 
 * Approach: Recursive Generation (Not Backtracking)
 * -------------------------------------------------
 * - Use recursion to build the binary string one character at a time.
 * - At each step, append either '0' or '1' to the current string.
 * - When the current string reaches length n, print it.
 * 
 * This is a full traversal of a binary tree of height n,
 * where each node branches into '0' and '1'.
 * 
 * Time Complexity:
 * - Total binary strings = 2^n
 * - Time complexity = O(2^n)
 */

import java.util.*;
class GenerateBinStrngs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		generate(n, "");
	}

	private static void generate(int n, String s){
		if(s.length() == n){
			System.out.println(s);
			return;
		}

		generate(n, s+"0");
		generate(n, s+"1");
	}
}
