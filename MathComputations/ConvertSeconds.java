import java.util.*;
class ConvertSeconds{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();

		int hrs = sec/3600;
		sec = sec % 3600;
		int min = sec/ 60;
		sec = sec % 60;

		System.out.printf("%dH: %dM : %dS",hrs,min,sec);
	}
}
