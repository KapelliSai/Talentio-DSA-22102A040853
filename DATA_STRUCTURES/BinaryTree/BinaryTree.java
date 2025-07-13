import java.util.*;

class BinaryTree{
	private Node root;

	public void insert(int data){
		Node node = new Node(data);
		if(root == null){
			root = node;
		}
		else{
			Queue<Node> q = new LinkedList<>();
			q.add(root);

			while(!q.isEmpty()){
				Node temp = q.poll();

				if(temp.left == null){
					temp.left = node;
					break;
				}
				else{
					q.add(temp.left);
				}

				if(temp.right == null){
					temp.right = node;
					break;
				}
				else{
					q.add(temp.right);
				}
			}
		}
	}


	public void search(int value){
		if(searchDFS(root, value)){
			System.out.println(value +" is found");
		}
		else{
			System.out.println(value +" is not found");
		}
	}

	private boolean searchDFS(Node node, int value){
		if(node == null) return false;

		if(node.data == value) return true;

		boolean left_res = searchDFS(node.left, value);
		boolean right_res = searchDFS(node.right, value);

		return left_res || right_res;
	}


	public void delete(int key){
		if(root == null) return;

		if(root.left == null && root.right == null){
			if(root.data == key) root = null;
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Node keyNode = null;
		Node temp = null;

		//Level-order traversal to find the KeyNode and deepest node
		while(!queue.isEmpty()){
			temp = queue.poll();

			if(temp.data == key) keyNode = temp;

			if(temp.left != null) queue.add(temp.left);

			if(temp.right!= null)  queue.add(temp.right);
		}

		if(keyNode != null){
			int x = temp.data;// deepest node's data
			deleteDeepest(root, temp);// delete deepest node
			keyNode.data = x;// replace keyNode's data
		}
	}
	
	// Helper function to delete the deepest node
	private void deleteDeepest(Node root, Node delNode){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){
			Node temp = queue.poll();

			if(temp == delNode){
				temp = null;
				return;
			}

			if(temp.right != null){
				if(temp.right == delNode){
					temp.right = null;
					return;
				} else{
					queue.add(temp.right);
				}
			}

			if(temp.left != null){
				if(temp.left == delNode){
					temp.left = null;
					return;
				}
				else{
					queue.add(temp.left);
				}
			}
		}
	}
	
	//Traversal techniques:
	public void inOrder(){
		inOrderDFS(root);
	}
	private void inOrderDFS(Node node){
		if(node == null) return;
		inOrderDFS(node.left);
		System.out.print(node.data+" ");
		inOrderDFS(node.right);
	}

	public void postOrder(){
		postOrderDFS(root);
	}
	private void postOrderDFS(Node node){
		if(node== null) return;
		postOrderDFS(node.left);
		postOrderDFS(node.right);
		System.out.print(node.data+" ");
	}

	public void preOrder(){
		preOrderDFS(root);
	}
	private void preOrderDFS(Node node){
		if(node == null) return ;
		System.out.print(node.data+" ");
		preOrderDFS(node.left);
		preOrderDFS(node.right);
	}

	public void levelOrder(){
		if(root == null) return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){
			Node node = queue.poll();
			System.out.println(node.data + " ");
			if(node.left != null) queue.add(node.left);
			if(node.right != null) queue.add(node.right);
		}
	}

	public void findParent(int target){
		if(!searchDFS(root,target)){
			System.out.println("Element not Found.");
			return;
		}
		int parent = parent(root, target, -1);
		System.out.printf("Parent of %d is %d\n",target,parent);
	}
	private int parent(Node node, int target, int parent){
		if(root == null) return -1;

		if(root.data == target) return parent;

		int leftSearch = parent(root.left, target, root.data);

		if(leftSearch != -1) return leftSearch;

		return parent(root.right, target, root.data);
	}
}
