/*
 * Problem: Convert Decimal to Binary Using Recursion
 * --------------------------------------------------
 * Given a non-negative decimal integer 'd', write a recursive function
 * to convert it into its equivalent binary representation.
 *
 * Input:
 * - An integer 'd' (decimal number), where d >= 0
 *
 * Output:
 * - A string or number representing the binary form of 'd'
 *
 * Examples:
 * ---------
 * Input: 7
 * Output: 111
 * Explanation: 7 = 1×2^2 + 1×2^1 + 1×2^0 → binary: 111
 *
 * Input: 10
 * Output: 1010
 * Explanation: 10 = 1×2^3 + 0×2^2 + 1×2^1 + 0×2^0 → binary: 1010
 *
 *
 * Approach: Recursive Division by 2
 * ---------------------------------
 * 1. Divide the decimal number by 2.
 * 2. Recursively convert the quotient.
 * 3. Append the remainder (0 or 1) to the result as you return from recursion.
 *
 * Base Case:
 * - If the number is 0 or 1, simply print or return that number.
 *
 * Recursive Case:
 * - For any number > 1:
 *      - Recursively convert (number / 2)
 *      - Then print (number % 2)
 *
 * Example Walkthrough:
 * --------------------
 * decimalToBinary(7)
 * → decimalToBinary(3)
 * → decimalToBinary(1)
 * → print 1 → return
 * ← print 1 (3%2)
 * ← print 1 (7%2)
 * Output: 111
 *
 * Time Complexity:
 * - O(log d), where d is the input number, because the number is divided by 2 at each step.
 */
import java.util.*;
class DecimalToBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println( convert(n));
	}

	private static String convert(int n){
		if(n == 0) return "";
		
		return convert(n/2) + (n%2);
	}
}
