package Array;

public class Swapping {

	public static void main(String[] args) {		//way  Accepted .
		int[]  a={12,14,26,44,55};
		int i=0;									//Index Value of element.
		int j=a.length-1;
		
		while(j>i)		//(j>i/2); 
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+" ");
		}
		
		
		}

}
