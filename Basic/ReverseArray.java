import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0, e = n-1;

        while(s < e){
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}