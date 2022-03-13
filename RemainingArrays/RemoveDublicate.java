package RemainingArrays;
import java.util.Arrays;
public class RemoveDublicate {
	public static void main(String[] args)
	{
		int []a={2,4,5,2,7,9,1,1,2,3,4,1,2,5,3,4,8};
		int ckt=0; 
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					ckt++;
					break;
				}
			}
		}
		System.out.println(ckt);
		int []b=new int[a.length-ckt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			int counter=0;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					counter++;
			}
			if(counter==0)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < index; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
