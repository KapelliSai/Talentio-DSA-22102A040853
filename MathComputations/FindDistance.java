import java.util.*;
class FindDistance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double dis = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.println("Distance: " + dis);
	}
}
