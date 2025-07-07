import java.util.*;
class IsSorted{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(isSorted(arr,0));
		sc.close();
	}

	private static boolean isSorted(int[] arr, int i){
		if(i == arr.length - 1) return true;

		return (arr[i] <= arr[i+1]) && isSorted(arr, i + 1);
	}
}
