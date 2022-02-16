package Array;
										// selection sort.
import java.util.Arrays;

public class ArraysSorting4 {

	public static void main(String[] args) 
	{
		int a[]={67,89,34,90,12,78,34,11};
		
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;									//take one Variable.
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
