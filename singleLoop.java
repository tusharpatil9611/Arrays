package Array;

import java.util.Arrays;

public class singleLoop {

	public static void main(String[] args) 
	{
		
		int[] a={3,2,5,4,6,1};
		int i = 0;
		int j=i+1;;
		while(true) 
		{
				if(a[i]>a[j])
				{
				int	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(j==a.length-1)
				{
					i++;
					j=i+1;
				}
				else
				{
					j++;
				}
				if(i==a.length-1)
					break;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
