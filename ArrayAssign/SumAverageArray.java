package ArrayAssign;

public class SumAverageArray {

	public static void main(String[] args) {
		int [] a={20,25,62,73,86};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the Array "+sum);
		double average=(double)(sum)/a.length;
		System.out.println("Average is "+average);
	}

}
