package ArrayAssign;

import java.util.Arrays;

public class CharS1S2 {

	public static void main(String[] args) {
		char [] s1={'a','b','c','d','f','e','d','t'};
		char [] s2={'w','e','r','t','f','g','h'};
		char [] s3=new char[s1.length+s2.length];
		
		int count=0;
		for (int i = 0; i < s3.length; i++) 
		{
			if(i<s1.length)
			{
				s3[count++]=s1[i];
			}
			if(i<s2.length)
			{
				s3[count++]=s2[i];
						
			}
			
		}
		System.out.println(Arrays.toString(s3));

	}

}
