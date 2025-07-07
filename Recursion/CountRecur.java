import java.util.*;
class CountRecur{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		countR(n);
	}

	private static void countR(int n){
		if(n == 0) return;
		countR(n-1);
		System.out.println("Call "+n);
	}
}
