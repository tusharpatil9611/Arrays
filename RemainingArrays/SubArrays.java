package RemainingArrays;

public class SubArrays {

	public static void main(String[] args) 
	{
		int []a={3,7,90,20,5,50,40};
		double min=Integer.MAX_VALUE;
		int k=3;
		
		for (int i = 0; i < a.length-2; i++) 
		{
			int sum=0;
			for (int j = i; j < i+k; j++)
			{
				sum=sum+a[j];
			}
			double avg= ((double)sum)/k;
			if(avg<min)
			{
				min=avg;
			}
		}
		
		System.out.println(min);
	}

}
