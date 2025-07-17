import java.util.*;
class SumOfNatural{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] memo = new int[n+1];

		Arrays.fill(memo, -1);

		System.out.println(sumN(memo, n));
	}

	private static int sumN(int[] memo, int n){
		if(n <= 1) return n;

		if(memo[n] != -1) return memo[n];

		memo[n] = n + sumN(memo,n-1);
		System.out.printf("Sum of first %d natural numbers is %d\n",n,memo[n]);

		return memo[n];
	}
}
