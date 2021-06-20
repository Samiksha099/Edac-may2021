import java.util.*;


public class LinearSearch {
	public static int search(int arr[],int key)
	{
	int n = arr.length;
	for(int i=0;i<n;i++)
	{
		if(key==arr[i])
			return 1;
	}
	return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//System.out.println(" enter a size of array ");
		int arr[]= {1,2,3,4};
		int key = 8;
		
		int result = search(arr,key);
		{
			if(result == -1)
				System.out.println(" element not found");
			else
				System.out.println(" element found ");
		}
		
	}
}
	    