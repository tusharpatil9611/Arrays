package RemainingArrays;

import java.util.Arrays;

public class Q37Hw 
{

	public static void main(String[] args) 
	{
		int []a={12,89,52,32,14,2,88,4};
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;			// Reset Counter.
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
