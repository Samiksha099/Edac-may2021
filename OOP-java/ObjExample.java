/*
 * Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 
*/
class Student{
	String name;
	int roll_No;
}

public class ObjExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student E = new Student();
    E.name = "John";
    E.roll_No = 2;
    System.out.println("student name  : "+E.name);
    System.out.println("Student roll number "+E.roll_No);
	
	}
}
