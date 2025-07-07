import java.util.*;

public class SumAndAvgOfArrayElmnts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum: "+ sum(arr));

        System.out.println("Mean: " + mean(arr));

        System.out.println("Mode: "+ mode(arr));

        System.out.println("Median: "+ median(arr));

        sc.close();
    }

    private static int sum(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static float mean(int[] arr){
        return (float)sum(arr)/arr.length;
    }

    private static int mode(int[] arr){
        int mode = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) > mode){
                mode = arr[i];
            }
        }

        return mode;
    }

    private static float median(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        if(n%2 == 0){
            return (float)(arr[n/2]+arr[(n/2) - 1])/2;
        }else{
            return (float)arr[n/2];
        }

    }
}