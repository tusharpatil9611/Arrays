package ArrayAssign;

public class QualityOfTwoArray {

	public static void main(String[] args) {
		int []a={12,13,14,15,16};
		int []b={12,13,14,15,16};
		
		if(a.length==b.length)
		{
			int count=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("Array is Same");
			}
			else
			{
				System.out.println("Array is not same");
			}
		}
		else
			System.out.println("Not same");
	}

}
