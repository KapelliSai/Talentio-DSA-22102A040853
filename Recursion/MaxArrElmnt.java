import java.util.*;
class MaxArrElmnt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
		int[] ans ={arr[0]};
		findMax(arr, ans, 1);
		System.out.println("Max: "+ans[0]);
	}

	private static void findMax(int[] arr, int[] max, int i){
		if(i == arr.length) return;
		if(max[0] < arr[i]) max[0] = arr[i];
		findMax(arr, max, i+1);
	}
}
