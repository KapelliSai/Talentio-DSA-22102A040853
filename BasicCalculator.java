import java.util.*;
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: "+ add(a,b));
        System.out.println("Subtraction: "+ subtract(a,b));
        System.out.println("Multiplication: "+ multiply(a,b));
        System.out.println("Division: "+ divide(a,b));
    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int subtract(int a, int b){
        return a-b;
    }

    private static int multiply(int a, int b){
        return a*b;
    }

    private static float divide(int a, int b){
        return a/b;
    }
}