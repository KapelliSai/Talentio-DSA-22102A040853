import java.util.*;
class Done{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		done(n);
	}

	private static void done(int n){
		if(n == 0){
			System.out.print("Done");
			return;
		}
		System.out.print(n+" ");
		done(n-1);
	}
}
