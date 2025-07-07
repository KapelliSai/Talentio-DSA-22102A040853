import java.util.*;
class BreakingNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		divide(n);
		sc.close();
	}	

	private static void divide(int n){
		if(n == 0) return;
		System.out.print(n+" ");
		divide(n/2);
	}
}
