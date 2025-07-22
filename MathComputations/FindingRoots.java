import java.util.*;
class FindingRoots{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("(%d)x^2 + (%d)x + (%d) = 0\n", a,b,c);

		double dis = Math.pow(b,2) - 4*a*c;

		if(dis < 0){
			System.out.println("Roots does not exist");
		}else{
			double r1 = (-b + Math.sqrt(dis))/2*a;
			double r2 = (-b - Math.sqrt(dis))/2*a;

			System.out.println(r1 + " " + r2);
		}
	}
}
