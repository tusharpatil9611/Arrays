package ArrayAssign;

import java.util.Arrays;

public class RotatingArray {
	public static void main(String[] args)
	{
		int []a={1,2,3,4,5,6,7,8,9};
		int temp=a[0];
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}
}
