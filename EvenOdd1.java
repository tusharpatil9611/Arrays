package ArrayAssign;

public class EvenOdd1 {

	public static void main(String[] args) {
		int []a={12,13,14,16,17,181,79,47,7};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				count++;
		}
		int evenArray[]=new int [count];
		int oddArray[]=new int [a.length-count];
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evenArray[evenCount++]=a[i];
			}
			else
			{
				oddArray[oddCount++]=a[i];
			}
		}
		System.out.println("Evnen No ");
		for (int i = 0; i < evenArray.length; i++) 
		{
			System.out.println(evenArray[i]);
		}
		System.out.println("Odd Array ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.println(oddArray[i]);
		}

	}

}
