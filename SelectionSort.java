package ArrayAssign;

import java.util.Arrays;
// selection sort mean swapping the lowest element to that position compare one element to other element of the array.
public class SelectionSort {

	public static void main(String[] args)
	{
		int a[]={85,12,69,78,32,65,45};
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;	
		}
		System.out.println(Arrays.toString(a));
	}

}
