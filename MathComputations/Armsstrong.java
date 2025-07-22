import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arms = getArms(n,0,(int)Math.log10(n)+1);

		System.out.println(n + " is an Armstrong Number : " + (n == arms));
	}

	private static int getArms(int n, int sum , int len){
		if(n == 0) return sum;
		sum += Math.pow(n%10,len);
		return getArms(n/10, sum, len);
	}
}

