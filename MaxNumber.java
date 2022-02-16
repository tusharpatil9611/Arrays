package Array;

public class MaxNumber {

	public static void main(String[] args) {
		int []a={14,85,69,47,861,215,845,875};
			int max=Integer.MIN_VALUE;
			
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);

	}

}
