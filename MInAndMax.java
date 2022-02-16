package Array;

public class MInAndMax {

	public static void main(String[] args) {
		int []a={10,88,95,315,22,366,21,23,36,32};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max-min);

	}

}
