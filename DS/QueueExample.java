import java.util.*;

class Queue{
	int rear ;
	int front ;
	int size;
	int a[]=new int[5];
	
	public Queue(int s)
	{
		size =s;
		a = new int [size];
		front = 0;
		rear = -1;
	}
	public boolean isFull()
	  {
		return (rear == (size-1));
	  }
	 
	public boolean isEmpty()
		{
			return (rear == -1);
		}
	
	public void enqueue(int i)
	{
		if(isFull())
		{	
			System.out.println("Queue is Full");
		}
		else
		{
		a[++rear] = i;
		}
	}
	public void dequeue()
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");		
		}
		else
		{
			//front = front+1;
			//a[front++]=front;
			int t = a[front++];
			//return t;
			System.out.println("dequeue element is "+t);
		}		
	}
	public void display()
	{
		
		for(int i=0;i<a.length;i++)//a.length//
		{
			System.out.print(a[i]+" ");
		}
	} 
	
}
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue Q = new Queue(5);
		
		 Q.enqueue(20);
		 Q.enqueue(40);
		 Q.enqueue(50);
		 Q.enqueue(80);
		 Q.enqueue(60);
		 Q.enqueue(60);
		 Q.display();
		 System.out.println();
		 Q.dequeue();
		 Q.dequeue();
		 Q.dequeue();
		 Q.dequeue();
		 //Q.dequeue();
		// Q.dequeue();
		 //Q.enqueue(100);
		// Q.display();
		 
		
	}

}
