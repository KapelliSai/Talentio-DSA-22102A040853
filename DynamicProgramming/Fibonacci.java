import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] fib = new int[n+1];

		Arrays.fill(fib, -1);


		System.out.println(find(fib,n));
	}

	private static int find(int[] fib, int i){
		if(i <= 1) return i;

		if(fib[i] != -1) return fib[i];

		fib[i] = find(fib, i - 2) + find(fib, i - 1);

		return fib[i];
	}
}
		

