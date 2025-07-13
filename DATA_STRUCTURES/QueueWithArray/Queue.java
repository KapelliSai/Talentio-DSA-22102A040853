class Queue{
	int[] queue;
	int front, rear;
	int len , n ;

	Queue(int n){
		queue = new int[n];
		front = rear = len = 0;
		this.n = n;
	}

	public void add(int data){
		if(len == queue.length){
			System.out.println("Queue is full.!");
		}
		else{
			queue[rear] = data;
			rear = (rear+1)%n;
			len++;
			System.out.println(data+" is added to the Queue");
		}
	}

	public void remove(){
		if(len == 0){
			System.out.println("Queue is empty..!");
		}
		else{
			System.out.println(queue[front]+" is removed from the Queue");
			len--;
			front = (front+1)%n;
		}
	}

	public void display(){
		if(len == 0){
			System.out.println("Queue is empty..!");
		}
		else{
			for(int i = front; i <= len; i++){
				System.out.print(queue[i%n]+" ");
		      	}
			System.out.println();
		}
	}
}
