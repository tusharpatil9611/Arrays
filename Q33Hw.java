package Array;

import java.util.Arrays;

public class Q33Hw {

	public static void main(String[] args)
	{
		int []a={11,33,55,77,99};
		int []b={22,44,66,88};
		int []c=new int[a.length+b.length];
		int	index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(i<a.length)
				c[index++]=a[i];
			if(i<b.length)
				c[index++]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
