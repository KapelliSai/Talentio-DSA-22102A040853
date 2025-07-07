import java.util.*;
class RunningSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		sc.close();
		sum(n, 1, 1);
	}

	private static void sum(int n, int i, int sum){
		if(i > n) return;
		System.out.printf("%d (sum: %d)\n",i,sum);
		i += 1;
		sum(n, i, sum+i);

	}
}
