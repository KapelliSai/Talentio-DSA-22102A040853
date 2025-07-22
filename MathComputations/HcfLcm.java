import java.util.*;
class HcfLcm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf = getHCF(a,b);
		int lcm = a*b / hcf;

		System.out.printf("HCF: %d \nLCM: %d\n",hcf,lcm);
	}
	
	private static int getHCF(int a, int b){
		return b == 0 ? a : getHCF(b, a%b);
	}
}
