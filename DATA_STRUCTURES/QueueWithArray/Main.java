import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Queue queue = new Queue(n);

		while(true){
			int choice = sc.nextInt();

			if(choice == 1){
				int data = sc.nextInt();
				queue.add(data);
			}
			else if(choice == 2){
				queue.remove();
			}
			else if(choice == 3){
				queue.display();
			}
			else{
				break;
			}
		}
	}
			
}
