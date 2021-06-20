/*
 * Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.
 8/
class Rectangle{
	int l1;
	int b1;
	int l2;
	int b2;
	
	void Rectangle(int l1,int b1,int l2,int b2)
	{
		this.l1 =l1;
		this.b1 =b1;
		this.l2 =l2;
		this.b2 =b2;
				
	}
	
	public int AreaRectangle()
	{
		return (l1+b1+l2+b2);
	}
	
}

public class ObjectExampleFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle T = new Rectangle();
		T.Rectangle(4, 5, 5, 8);
 System.out.println("Area of a rectangle is "+ T.AreaRectangle());
		
	}

}
