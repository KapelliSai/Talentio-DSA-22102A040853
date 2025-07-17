import java.util.*;
class CountDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.close();

		System.out.println(count(n,0));
	}

	private static int count(int n, int digits){
		if(n == 0 && digits == 0) return 1;
		if(n == 0) return digits;

		return count(n/10, digits+1);
	}
}
