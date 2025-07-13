import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BinaryTree bt = new BinaryTree();
		
		System.out.println("Enter no of nodes:");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) bt.insert(sc.nextInt());

		System.out.println("Enter element to search :");
		bt.search(sc.nextInt());

		System.out.println("Pre-Order Traversal:");
		bt.preOrder();

		System.out.println("Post-Order Traversal:");
		bt.postOrder();

		System.out.println("In-Order Traversal:");
		bt.inOrder();

		System.out.println("Level Order Traversal:");
		bt.levelOrder();

		System.out.println("Enter element to delete:");
		bt.delete(sc.nextInt());

		System.out.println("Enter element to find it's parent:");
		bt.findParent(sc.nextInt());

		System.out.println("Level order Traversal:");
		bt.levelOrder();

		sc.close();
	}
}
