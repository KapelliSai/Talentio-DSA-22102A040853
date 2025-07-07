import java.util.*;
public class MinMaxOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];

        for (int i = 1; i < n; i++) {
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;
        }

        System.out.println("Max :"+ max);
        System.out.println("Min :"+ min);

        sc.close();
    }
}