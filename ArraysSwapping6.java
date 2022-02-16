package Array;
	//Insertion sort.
import java.util.Arrays;

public class ArraysSwapping6 
{
	public static void main(String[] args)
	{
		int a[]={54,89,4,5,6,99,45,23};
		
		for (int i = 0; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
