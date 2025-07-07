import java.util.*;
class StringLength{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(find(s));
	}

	private static int find(String s){
		if(s.isEmpty()) return 0;

		return 1 + find(s.substring(1));
	}
}
