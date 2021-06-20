class NodeN{
	int data;
	NodeN next;
	NodeN prev;
	
	NodeN(int data){
		this.data = data;
		next  = null;
		prev  = null;
	}
}

 class Doubly{
	NodeN head;
		void insertBeg(int data){
			NodeN newnode = new NodeN(data);
			newnode.next = head;
		    newnode.prev = null;
		     
		    if (head != null) {
		        head.prev = newnode;
		    }
			head = newnode;
			}
		
		void insertEnd(int data){
			NodeN newnode = new NodeN(data);
			NodeN temp= head;
			newnode.next=null;
			if(head==null) {
				newnode.prev=null;
				head=newnode;
			}
			
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
		
      void insertMid(int data,int pos)
      {
    	  NodeN newnode = new NodeN(data);
    	  NodeN temp = head; 
    	  if(pos==0 )
    	  {
    		  head = newnode;
    		  newnode.next = head;
    		  temp.prev = newnode;
  		  head = newnode;
    	  }
    	  else {
    	  for(int i=1;i<pos;i++)
    	  {
    		  temp = temp.next;
    	  }
    	  
    	  newnode.next = temp.next;
    	  temp.next = newnode;
    	  temp.next.prev = newnode;
    	  newnode.prev = temp;
    	  } 	  
      }
      
      void deletAtPos(int pos,int data)
      {
          NodeN temp = head;
    	  while(temp.next != null)
    	  {
    		  temp = temp.next;
    	  }	  
      }
      
      void insertAfter(int pos,int data)
 	 {
 		 NodeN newnode = new NodeN(data);
 			NodeN temp = head;
 			while(temp.data != pos)
 			{
 				temp = temp.next;
 			}
 			
 			newnode.prev = temp.next;
 			temp.next=newnode;
 			newnode.next = temp.next.prev;
 			temp.next.prev=newnode;	
 			
 	 }
      
		void display()
		{
			NodeN temp = head;
			if( temp == null )
			{
				System.out.println("Doubly list is empty");
			}
			while(temp!=null)
			{	System.out.print(temp.data+"<===");
				temp = temp.next;
		     }
		}
			void Reverse()
			{
				NodeN temp = head;
				while( temp != null ){
					System.out.print(temp.data+"<===");
					temp = temp.prev;
			}
		}
}

public class DoublyLink {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Doubly D = new Doubly();
		System.out.println("insert beg");
		D.insertBeg(10);
		D.insertBeg(20);
		D.insertBeg(30);
		D.display();
		System.out.println();
		System.out.println("insert at end ");
		D.insertEnd(40);
		D.display();
		System.out.println();
		D.insertMid(99, 2);
		D.display();
		System.out.println();
		D. Reverse();
		D.display();
		System.out.println();
		D.insertAfter(10,22);
		D.display();
		System.out.println();
//		D.deletLast();
//		
	}

 }