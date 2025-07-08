/*
 * Problem: Print Fibonacci Series in Reverse Order using Tail Recursion
 * ----------------------------------------------------------------------
 * Given an integer 'n', print the first 'n' terms of the Fibonacci series
 * in reverse order using a recursive function.
 *
 * The Fibonacci sequence is:
 *   F(0) = 0
 *   F(1) = 1
 *   F(n) = F(n-1) + F(n-2) for n ≥ 2
 *
 * Example:
 * --------
 * Input: n = 5
 * Normal order:    0 1 1 2 3
 * Reverse order:   3 2 1 1 0
 *
 * Approach:
 * ---------
 * This solution uses tail recursion with two parameters (a and b) that hold
 * consecutive Fibonacci values. The recursive call is made first (top-down),
 * and the printing happens after (bottom-up), which naturally reverses the output.
 *
 * Parameters:
 * - n : number of terms left to print
 * - a : current Fibonacci term
 * - b : next Fibonacci term
 *
 * Recursive Flow:
 * - At each step:
 *     - Call fibo(n - 1, b, a + b)
 *     - Then print a (after recursion completes)
 *
 * Base Case:
 * - If n == 0, the function ends (no more terms to process)
 *
 * Time Complexity:
 * - O(n)
 *
 * Space Complexity:
 * - O(n) due to recursion stack
 *
 * Example Call:
 * fibo(5, 0, 1); // prints: 3 2 1 1 0
 */

import java.util.*;

class FibReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		fib(n, 0, 1);
	}

	private static void fib(int n, int a, int b){
		if(n == 0) return;

		fib(n-1, b, a+b);
		System.out.print(a+" ");
	}
}
