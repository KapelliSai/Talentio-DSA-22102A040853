import java.util.*;
class Multiplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int times = sc.nextInt();
		sc.close();
		multiply(n, 1, times);
	}

	private static void multiply(int n, int i, int t){
		if(i == t + 1) return;
		System.out.printf("%d * %d = %d\n", n , i, n * i);
		multiply(n, i + 1, t);
	}
}
