package ArrayAssign;

public class MaxMin {

	public static void main(String[] args) {
		int a[]={14,59,98,76,52,12,65,89,6};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(max-min);
	}

}
