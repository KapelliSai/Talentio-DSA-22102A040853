import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] fact = new int[n+1];

		Arrays.fill(fact, -1);

		System.out.println(nthFact(fact,n));

	}

	private static int nthFact(int[] fact, int n){
		if(n <= 1) return 1;

		if(fact[n] != -1) return fact[n];

		fact[n] = n * nthFact(fact, n - 1);

		return fact[n];
	}
}
