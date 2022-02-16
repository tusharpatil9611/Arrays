package Array;

public class sameArray {

	public static void main(String[] args) 
	{
		int [] a={12,22,32,42,52};
		int [] b={12,22,32,42,52};
		
		
		if(a.length==b.length)
		{
			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]!=b[i])
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("Same");
			else
				System.out.println("Differnt by Element");
		}
	}

}
