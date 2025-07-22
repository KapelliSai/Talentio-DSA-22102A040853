import java.util.*;
class SumOfHp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		double sum = 0;
		for(int i = 0; i < n; i++){
			int term = a + i * d;
			sum += 1.0/ term;
		}

		System.out.println("Sn = "+ sum);
	}
}
