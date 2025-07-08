/*
 * Problem: Count Set Bits in a Number using Recursion
 * ----------------------------------------------------
 * Given a positive integer 'n', write a recursive function to count the
 * number of set bits (1s) in its binary representation.
 *
 * Input:
 * - A positive integer 'n'
 *
 * Output:
 * - An integer representing the number of 1s in the binary representation of 'n'
 *
 * Examples:
 * ---------
 * Input: n = 21
 * Output: 3
 * Explanation: Binary of 21 is 10101 → 3 set bits
 *
 * Input: n = 16
 * Output: 1
 * Explanation: Binary of 16 is 10000 → 1 set bit
 *
 * Approach: Recursion + Bitwise Right Shift
 * -----------------------------------------
 * - Use the bitwise AND operator (n & 1) to check if the last bit is set.
 * - Use right shift (n >> 1) to recursively process the remaining bits.
 *
 * Recursive Case:
 * - If n > 0:
 *     return (n & 1) + countSetBits(n >> 1)
 *
 * Base Case:
 * - If n == 0, return 0
 *
 * Time Complexity:
 * - O(log n) → Because the number is halved at each step (binary length)
 *
 * Space Complexity:
 * - O(log n) → Due to recursion stack
 */

import java.util.*;
class CountSetBits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(count(n));
	}

	private static int count(int n){
		if(n == 0) return 0;

		return (n & 1) + count(n >> 1);
	}
}
