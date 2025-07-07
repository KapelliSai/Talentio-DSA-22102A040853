import java.util.*;
class SumOfNaturals{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(sum(n));
	}

	private static int sum(int n){
		if(n == 1) return 1;

		return n + sum(n-1);
	}
}
