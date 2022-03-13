package RemainingArrays;

public class AllPositiveNo {

	public static void main(String[] args)
	{
		int []a={12,1,2,3,-4,6,-8,-9,11,12,-12};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if( a[j]>0)
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
