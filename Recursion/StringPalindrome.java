import java.util.*;
class StringPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(check(s,0, s.length()-1));
	}

	private static boolean check(String str, int s, int e){
		if(s > e) return true;
		if(str.charAt(s) != str.charAt(e)) return false;
		return check(str, s+1, e - 1);
	}
}
