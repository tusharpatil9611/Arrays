package Array;
// swapping by comparing i & j index and elements value. Normal Sort.
public class ArraysSwapping1 {

	public static void main(String[] args) 
	{
		int a[]={21,99,56,78,12,65,86,22};
		
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
