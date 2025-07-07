import java.util.*;

public class RemoveTargetFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int p = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] != k){
                arr[p++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, p)));
        sc.close();
    }
}