package Array;
				//Normal Sort.
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int a[]={12,84,34,54,2,44,25};
		System.out.println(Arrays.toString(a));
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
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
