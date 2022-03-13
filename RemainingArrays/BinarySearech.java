package RemainingArrays;
import java.util.*;
public class BinarySearech {

	public static void main(String[] args) 
	{
		int []a={3,8,12,16,27,38,45,53,64,78,86};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int start=0;
		int end=a.length-1;
		
		while(true)					// while run continue.
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("Found at index "+mid);
				break;
			}
			else if(num>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			if(end<start)
			{
				System.out.println("Not Found");
				break;
			}
			
		}
	}

}
