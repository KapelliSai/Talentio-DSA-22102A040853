import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack stack = new Stack(n);

		while(true){
			int choice = sc.nextInt();

			if(choice == 1){
				int data = sc.nextInt();
				stack.push(data);
			}
			else if(choice == 2){
				stack.pop();
			}
			else if(choice == 3){
				stack.display();
			}
			else{
				break;
			}
		}

		sc.close();
	}
}
