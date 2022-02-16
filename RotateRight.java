package Array;

import java.util.Arrays;

public class RotateRight {

	public static void main(String[] args) {
		int []a={1,2,3,4,5,6,7,8,9};
		//		  9 1 2 3 4 5 6 7 8      expected output.
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int temp=a[a.length-1];
		for (int i =  a.length-1; i >=1; i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
