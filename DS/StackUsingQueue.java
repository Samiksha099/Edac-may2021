class Stack{
	//public void stack()
	private int arr[];
	private int size;
	private int front;
	private int rear;
	
	public Stack(int s)
	{
		size = s;
		arr = new int[size];
		front =5;
		rear=0;
	}
	
	public void enque(int j)
	{
		arr[rear++] = j;
	}
	
	 public int deque()
	 {  
		 if(isEmpty())
			 System.out.println("underflow");
		
		 return arr[rear]=arr[front--];
	 }
	 
	 public int peek()
	 {
		 return arr[front];
	 }
	 
	 public boolean isEmpty()
	 {
		 return (front == -1);//Underflow
	 }
	 
	 public boolean isFull()
	 {
		 return (rear == size-1);//Overflow
	 }
	   public void display()
	   {
		   System.out.println("total elements are");
		   for(int i=0;i<size;i++)
		   {
			   System.out.println(arr[i]);
		   }
		   
	   }
}

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack stack = new Stack(5);
 stack.enque(11);
 stack.enque(15);
 stack.enque(20);
 stack.enque(30);
 stack.enque(40);
  stack.display();
  stack.deque();
  stack.display();
  
	}

}
