import java.util.*;
class SumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Sum: "+sum(n));
	}

	private static int sum(int n){
		if(n == 0) return 0;

		return (n % 10) + sum(n / 10);
	}
}
