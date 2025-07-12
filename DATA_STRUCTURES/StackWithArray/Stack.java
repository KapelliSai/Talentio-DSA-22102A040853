class Stack{
  int[] stack;
  int top = -1;

  Stack(int n){
    stack = new int[n];
  }

  public void push(int data){
    if(top == stack.length - 1){
      System.out.println("Stack Overflow..!");
    }else{
       stack[++top] = data;
       System.out.println(data+" is pushed on to the stack");
    }
  }

  public void pop(){
    if(top == -1){
      System.out.println("Stack is Empty .!");
    }
    else{
	System.out.println(stack[top--]+" is popped out of the stack");
    }
  }

  public void display(){
	if(top == -1){
		System.out.println("Stack is Empty .!");
	}
	else{
		for(int i = 0; i <= top; i++){
			System.out.println(stack[i]+" ");
		}
	}
  }
}
