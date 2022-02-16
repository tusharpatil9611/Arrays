package Array;

public class ArrayAddition
{
	public static void main(String[] args)
	{
		int [] a={22,65,78,65,42,24,25};
		// int sum=a[0]+a[1]+a[2]+a[3];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];	
		}
		System.out.println("Adition is "+sum);
	}
}
