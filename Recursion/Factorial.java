import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(factorial(n));
	}

	private static int factorial(int n){
		if(n == 0 || n == 1) return 1;

		return n * factorial(n - 1);
	}
}
