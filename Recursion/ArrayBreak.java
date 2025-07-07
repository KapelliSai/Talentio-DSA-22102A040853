import java.util.*;
class ArrayBreak{
	public static void main(String[] arsg){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		divide(arr,0, arr.length - 1);
	}

	private static void divide(int[] arr, int s, int e){
		if(s >= e) return;
		display(arr,s,e);
		int mid = s +(e - s)/2;
		divide(arr,s,mid);
		divide(arr,mid+1,e);
	}

	private static void display(int[] arr, int s, int e){
		for(int i = s; i <= e; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
