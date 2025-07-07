import java.util.*;

public class EvenAndOddInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int odd = 0, evn = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                continue;
            }
            else if(arr[i] % 2 == 0){
                evn++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Odd: "+odd+" Even: "+ evn);
        sc.close();
    }
}