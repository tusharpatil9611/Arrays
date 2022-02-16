package Array;

public class Q10Hw {

	public static void main(String[] args) 
	{
		int [][]a={{7,8,9},{1,2,3},{5,6,7}};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i][j]>max)
				max=a[i][j];
			}
		}
		System.out.println("MAx no is "+max);
	}

}
