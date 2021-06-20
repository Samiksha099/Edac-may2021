/*
Make a class named Fruit with a data member to calculate the
number of fruits in a basket. Create two other class named
Apples and Mangoes to calculate the number of apples and
mangoes in the basket. Print the number of fruits of each type
and the total number of fruits in the basket.
*/
import java.util.*;
class Apples{
int A;
void noOfApples(int a)
{
A=a;
System.out.println("no of Apples "+a);
}
}

class Mangoes extends Apples{
int M;
void noOfMangoes(int b)
{
M=b;
System.out.println("no of Mangoes "+M);
}
}

class Basket extends Mangoes{

void noOfFruits()
{
System.out.println("no of Fruits "+(A+M));
}
}

class Fruit{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
   Basket B = new Basket();
   System.out.println("Enter number of apples ");
   int z=sc.nextInt();
   System.out.println("Enter number of Mangoes ");
   int x=sc.nextInt();
   B.noOfApples(z);
   B.noOfMangoes(x);
   B.noOfFruits();
}
}