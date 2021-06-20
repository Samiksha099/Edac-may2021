

class Shape{
	public void showShape()
	{
		System.out.println("This is a shape ");
	}
}

class Polygon extends Shape
{
	public void showShape()
	{
		System.out.println("Polygon is a shape ");
	}
	
}

class Rectangle extends Polygon
{
   public void showShape()
	{
		System.out.println("Rectangle is a Polygon ");
	}
}

class Triangle extends Rectangle
{
public void showShape()
	{
		System.out.println("Rectangle is a polygon");
	}
}

class Square extends Triangle
{
   public void showShape()
	{
		System.out.println("Square is a Rectangle");
	}
}

public class DisplayShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape A = new Shape();
		A.showShape();
                 Polygon P = new Polygon();
                A.showShape();
                 Rectangle R = new Rectangle();
                R.showShape();
                Triangle T = new Triangle();
                 T.showShape();
                Square S = new Square();
                 S.showShape();
		
	}

}
