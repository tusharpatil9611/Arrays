package ArrayAssign;

import java.util.Arrays;

public class ArraysSwapping2 {

	public static void main(String[] args) 
	{
		int a[]={78,21,56,98,12,6,99,33};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
