package ArrayAssign;

public class ReverseArray {

	public static void main(String[] args) {
		int [] a={42,98,65,75,98,156,11,22,45};
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
