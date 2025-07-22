import java.util.*;
class ANGPtogressions{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int ap = a + (n-1)*d;
		int gp = a*(int)Math.pow(d,n-1);

		System.out.println("AP: " + ap +" GP: "+gp);
 	}
}
