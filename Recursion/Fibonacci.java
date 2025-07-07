import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Fibonacci("+n+"): "+fib(n));
	}

	private static int fib(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;

		return fib(n-1) + fib(n-2);
	}
}
