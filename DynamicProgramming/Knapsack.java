import java.util.*;
class Knapsack{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] W = new int[n];
		int[] p = new int[n];

		for(int i = 0; i < n; i++) W[i] = sc.nextInt();
		for(int i = 0; i < n; i++) p[i] = sc.nextInt();

		int bag = sc.nextInt();

		int[] prev = new int[bag+1];

		for(int i = 0; i <= n ; i++){
			int[] curr = new int[bag+1];
			for(int w = 0; w < bag+1; w++){
				if(i == 0 || w == 0){
					curr[w] = 0;
					continue;
				}else{
					if(w >= W[i-1]){
						curr[w] = Math.max(prev[w], p[i-1]+ prev[w - W[i-1]]);
					}
					else{
						curr[w] = prev[w];
					}
				}

			}
			prev = curr.clone();
		}

		System.out.println("Max Profit: "+ prev[bag]);
	}
}
