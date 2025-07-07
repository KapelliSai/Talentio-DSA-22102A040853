import java.util.*;
class HiNtimes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		display(n);
	}

	private static void display(int n){
		if(n == 0) return;
		System.out.println("Hi..!");
		display(n-1);
	}
}
