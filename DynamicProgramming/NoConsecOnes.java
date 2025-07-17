import java.util.*;
class NoConsecOnes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] memo = new int[n+1];

		Arrays.fill(memo, -1);

		System.out.println("Total Number of no consecutive Ones in Bin String are: "+ count(n,memo));
	}

	private static int count(int n ,int[] memo){
		if(n <= 1) return n + 1;

		if(memo[n] != -1) return memo[n];

		memo[n] = count(n-2, memo) + count(n-1, memo);

		return memo[n];
	}
}
