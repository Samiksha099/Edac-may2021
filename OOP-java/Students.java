/*
Create a class named Shape with a function that prints "This is a
shape". Create another class named Polygon inheriting the Shape
class with the same function that prints "Polygon is a shape".
Create two other classes named Rectangle and Triangle having
the same function which prints "Rectangle is a polygon" and
"Triangle is a polygon" respectively. Again, make another class
named Square having the same function which prints "Square is a
rectangle".
Now, try calling the function by the object of each of these
classes*/

import java.util.Scanner;

public class Students {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal=new Calculate();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students");
		int students=sc.nextInt();
		System.out.println("Enter marks");
		for(int i=1;i<=students;i++)
		{
			cal.calculate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		System.out.println("Average marks of class="+(cal.total/students));		
	}
}

class StudentInfo{
	int rollNo;
	int marks;
	String name;
}


class Calculate extends StudentInfo{
	String name;
	int total=0;
	int sum=0;
	
	void calculate(int physic ,int mathematics, int chemistry)
	{   
	   sum=physic+mathematics+chemistry;
		total+=physic+mathematics+chemistry;
		System.out.println("total marks of student "+"="+sum);
	}
}