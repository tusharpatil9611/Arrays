package Array;

public class Test {

	public static void main(String[] args) {
		int [] a={12,14,18,20};
		int i=0;				
		int j=a.length-1;
		
		while(j>i)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+" ");
		}
		
	}

}
