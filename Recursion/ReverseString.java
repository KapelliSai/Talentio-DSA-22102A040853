import java.util.*;
class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(reverse(s,s.length() - 1));
		sc.close();
	}

	private static String reverse(String s, int i){
		if(i == -1) return "";

		return s.charAt(i) + reverse(s, i-1);
	}
}
