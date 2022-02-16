package Array;
import java.util.*;
public class SameElement {

	public static void main(String[] args) 
	{
		int []a={11,22,11,22,55,22,55,11};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		
		int index =-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				index=i;
			System.out.println("NO at index position "+index);
			//	break;
			}
		}
		
		if(index==-1)
			System.out.println("Index is Not found");
		else
			System.out.println("No is found ");
	}

}
