package ArrayAssign;

import java.util.Arrays;

public class RotateRightShift {

	public static void main(String[] args) {
		int []a={1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(a));
		
		int temp=a.length;
		for (int i = a.length-1; i >=1 ; i--) 
		{
			a[i]=a[i-1];
		}
			a[0]=temp;
			System.out.println(Arrays.toString(a));
		


	}

}
