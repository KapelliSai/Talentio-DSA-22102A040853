import java.util.*;
class ApowerB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int[] ans = {1};

		power(a, b, ans);
		System.out.printf("%d power %d : %d", a, b, ans[0]);
	}

	private static void power(int a, int b, int[] ans){
		if(b == 0) return;
		ans[0] *= a;
		power(a, b-1, ans);
	}
}
