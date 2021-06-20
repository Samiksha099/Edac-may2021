//package sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("size of an array");
		int size= sc.nextInt();
		int arr[]=new int[size];
System.out.println(" elements to sort ");
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length-1;j++)
	{
		if(arr[j]>arr[j+1])
		{
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
	}
}
System.out.println("elements in sorted order ");
for(int i=0;i<size;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
