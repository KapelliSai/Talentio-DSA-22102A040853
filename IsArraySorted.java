import java.util.*;

public class IsArraySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("IsSorted: "+ isSorted(arr));
        sc.close();
    }

    private static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(! (arr[i-1] < arr[i])) return false;
        }

        return true;
    }
}