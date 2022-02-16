package ArrayAssign;
import java.util.*;
public class IndexValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No any ine of the 20,25,62,73,86");
		int num=sc.nextInt();
		int [] a={20,25,62,73,86};
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				System.out.println(i);	
			}
			else
			{
				System.out.println("No is not present");
				break;
			}
			
		}	
	}

}
