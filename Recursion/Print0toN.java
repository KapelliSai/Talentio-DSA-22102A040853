import java.util.*;
class Print0toN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		display(n, 0);
		sc.close();
	}

	public static void display(int n, int i){
		if(i > n) return;
		System.out.print(i+" ");
		display(n, i+1);
	}
}
