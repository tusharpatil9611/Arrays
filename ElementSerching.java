package Array;
import java.util.*;
public class ElementSerching {

	public static void main(String[] args) {
		int [] a={22,44,65,89,54,78};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				index=i;
		}
		if(index==-1)
		System.out.println("No is not Found");
		else
			System.out.println("No is fount at index position "+index);
	}

}
