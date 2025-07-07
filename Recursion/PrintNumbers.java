import java.util.*;
class PrintNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recur(n);
		sc.close();
	}

	private static void recur(int n){
		if(n == 10) return;
		System.out.print(n+" ");
		recur(n+1);
	}
}
