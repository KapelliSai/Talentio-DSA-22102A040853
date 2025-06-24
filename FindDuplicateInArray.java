import java.util.*;
public class FindDuplicateInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(duplicates(arr));
        sc.close();
    }

    private static ArrayList<Integer> duplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
             if(set.contains(arr[i])){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
             }else{
                set.add(arr[i]);
             }
        }

        return list;
    }
}