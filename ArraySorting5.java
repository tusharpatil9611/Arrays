package Array;
									// By using Insertion.
public class ArraySorting5 {

	public static void main(String[] args) 
	{
		int a[]={67,98,34,30,20,55};
		
		for (int i = 1; i < a.length; i++) 
		{
			int j = i-1;
			for (; j >=0; j--) 
			{
				if(a[j]<a[i])
				{
					int temp=a[i];			//Right Shift
					for (int k = i; k>=j+2; k--)
					{
						a[k]=a[k-1];
					}
					a[j+1]=temp;
					break;
				}
			}
			if(j==-1)
			{
				int temp=a[i];
				for (int k = i; k >= j+2; k--) 
				{
					a[k]=a[k-1];
				}
				a[j+1]=temp;
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
