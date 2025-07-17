import java.util.*;
class ReachOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] memo = new int[n+1];

		Arrays.fill(memo, -1);

		System.out.println(count(n, memo));
	}

	private static int count(int n, int[] memo){
		if(n == 1) return 0;

		if(memo[n] != -1) return memo[n];

		int res = count(n-1, memo);

		if(n%2 == 0) res = Math.min(res, count(n/2, memo));

		if(n%3 == 0) res = Math.min(res, count(n/3, memo));

		memo[n] = 1 + res;

		return memo[n];
		
	}
}

