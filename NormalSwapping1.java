package ArrayAssign;

import java.util.Arrays;

public class NormalSwapping1 {

	public static void main(String[] args) 
	{
	
		int a[]={98,75,14,65,25,55};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				
				if(i<j && a[i]>a[j])
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
