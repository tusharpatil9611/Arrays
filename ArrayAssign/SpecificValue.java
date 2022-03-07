package ArrayAssign;
import java.util.*;
public class SpecificValue {

	public static void main(String[] args) {

		int []a={20,84,65,79,54,79};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		
		int count=-1;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				count++;
		}
		if(count==-1)
			System.out.println("No is not found");
		else
			System.out.println("No is found");
	}

}
