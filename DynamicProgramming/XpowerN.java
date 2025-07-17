import java.util.*;
class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();

		int[] memo = new int[n+1];

		Arrays.fill(memo, -1);

		System.out.println(xPowerN(x,n,memo));
	}

	private static int xPowerN(int x, int n, int[] memo){
		if(n == 0) return 1;

		if(memo[n] != -1) return memo[n];

		if(n%2 == 0){
			memo[n] = xPowerN(x, n/2, memo);
			memo[n] = memo[n] * memo[n];
		}
		else{
			memo[n] = x * xPowerN(x,n-1,memo);
		}
            
		return memo[n];
	}

}
