package ArrayAssign;

import java.util.Arrays;

public class Replace0with1 {

	public static void main(String[] args) {
		int []a={0,1,0,1,0,1,0,1,0,1,0};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==0)
				a[i]=1;
		}
		System.out.println(Arrays.toString(a));

	}

}
