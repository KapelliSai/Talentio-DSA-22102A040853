import java.util.*;
class ClimbStairs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] memo = new int[n+2];

		Arrays.fill(memo, -1);

		System.out.print(countWays(memo,n+1));
	}
	
	private static int countWays(int[] memo, int n){
		if(n <= 1) return n;

		if(memo[n] != -1) return memo[n];

		memo[n] = countWays(memo,n-2) + countWays(memo,n-1);

		return memo[n];
	}
}
