//package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {43,65,90,12,55};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					temp=a[min];
					a[min]=a[j];
					a[j]=temp;		
				}
			}		
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
