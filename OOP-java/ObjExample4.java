/*
4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with constructor having the three sides as its parameters.
*/

class Triangle
{
int side1;
int side2;
int side3;

	Triangle(int a,int b,int c)
	{
		
		this.side1=a;
		this.side2=b;
		this.side3=c;
		
	}	
		public int Perimeter()
		{
			return (side1 +side2 + side3);
		}	
		
		public double Area()
		{
			double s =  Perimeter()/2;
			
			return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));				
		}
		
	}


public class ObjExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Triangle t1 = new Triangle(3,4,5);
 	System.out.println(" perimeter is "+ t1.Perimeter());
 	System.out.println(" area is "+t1.Area());
		
	}

}