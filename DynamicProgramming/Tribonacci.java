import java.util.*;
class Tribonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] memo = new int[n+1];

		Arrays.fill(memo, -1);

		System.out.println(trib(n, memo));
	}

	private static int trib(int n, int[] memo){
		if(n <= 1) return 0;
		if(n == 2) return 1;

		if(memo[n] != -1) return memo[n];

		memo[n] = trib(n-3, memo) + trib(n-2, memo) + trib(n-1, memo);

		return memo[n];
	}
}
