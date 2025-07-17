import java.util.*;
class CountVowel{
	static List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
	static int[] memo;
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		memo = new int[s.length()];
		Arrays.fill(memo, -1);

		System.out.println(countVowel(s,0));
	}

	private static int countVowel(String s, int i){
		if(i >= s.length()) return 0;

		if(memo[i] != -1) return memo[i];
		
		int vowel = (list.contains(s.charAt(i)))? 1: 0;
		memo[i] = vowel + countVowel(s,i+1);

		return memo[i];
	}
}

