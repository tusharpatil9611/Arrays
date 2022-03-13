package RemainingArrays;
public class LeaderElement {
	
	public static void main(String[] args)
	{
		int  a[]={4,8,5,3,4,1};
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
					count++;
			}
			if(count==0)
				System.out.print(a[i]+" ");
		}
	}
}
