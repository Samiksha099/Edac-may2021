//package sorting;
public class InsertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {64,34,25,12,22,11,10};
  int temp;
  for(int i=1;i<a.length;i++)
  {
	  for(int j=0;j<a.length-i+1;j++)
	  {
		  if(a[j]>a[i])
		  {
		   temp = a[j];
		  a[j] =a[i];
		  a[i]=temp;
		  }
		  for(int k=0;k<a.length;k++)
		  {
			  System.out.print(a[k]+" ");
		  }
		  System.out.println();
	  } 
	} 
  System.out.println("sorted array");
  for(int i=0;i<a.length;i++)
  {
	  System.out.print(a[i]+" ");
  }
  //sort. display(a[]);
	}	
	}
  
//	22 34 11 -1 -2 
//	11 22 34 -1 -2 
//	-1 11 22 34 -2 
//	-2 -1 11 22 34 

