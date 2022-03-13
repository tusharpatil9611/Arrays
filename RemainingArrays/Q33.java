package RemainingArrays;

import java.util.Arrays;

public class Q33 {

	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5};
		int []b={6,7,8,9};
		int []c=new int [a.length+b.length];
		int aindex=0;
		int bindex=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(i<a.length)
				c[i]=a[aindex++];
			else
				c[i]=b[bindex++];
		}
		System.out.println(Arrays.toString(c));
	}

}
