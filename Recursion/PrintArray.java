import java.util.*;
class PrintArray{
	public static void main(String[] args){
		int[] arr = { 23, 24, 34, 52, 21, 32};
		display(arr,0);
	}

	private static void display(int[] arr, int i){
		if( i == arr.length) return;
		System.out.print(arr[i]+" ");
		display(arr, i + 1);
	}
}
