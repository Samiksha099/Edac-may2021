class Noded{
	int data;
	Noded next;
	Noded prev;
	 
	Noded(int data)
	{
		this.data = data;
		prev = null;
		next = null;
	}
}

 class implementation{
	 Noded head;
	 
	 void insert(int data) {
			Noded n = new Noded(data);

			if(head==null)
			{
				head=n;
			}
			else
			{
				n.next=head;
				head = n;
			}		
	 } 
	 void insertLast(int data )
	 {
		 Noded n = new Noded(data); 
		 n.next = head;
		  head = n;
	 }
	 
	 void inserbegining(int data)
	 {
		 Noded n = new Noded(data); 
		 Noded temp = head;
		 while(temp.next!=null)
		 {
			temp = temp.next;		 
		 }
		 temp.next = n;
		 
	 }
	 
	 void insertmid(int data)
	 {
		 Noded n = new Noded(data);
			Noded temp = head;
			n.prev = temp.next;
			temp.next=n;
			n.next = temp.next.prev;
			temp.next.prev=n;
			
		 
	 }
	 void display()
	 {
		Noded temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
			System.out.println(temp.data);	
	 }
	 
 }
public class singlyLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementation z = new implementation();
		
		z.insert(1);
		z.insert(4);
		z.display();
		z.inserbegining(9);
		z.display();
		z.insert(11);
		z.display();
		z.insertmid(23);
		z.display();
	}

}
