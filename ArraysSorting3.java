package Array;
								// Bubble Sort.
public class ArraysSorting3 {

	public static void main(String[] args) 
	{
		int a[]={54,76,23,67,29,11,56,34,88};
		for (int i = 0; i < a.length; i++)  
		{
			for (int j = 0; j < a.length-1; j++)  
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" " );
		}
	}

}
