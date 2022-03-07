package ArrayAssign;

public class EvenOdd {

	public static void main(String[] args) {
		int []a={12,14,78,78,70,71,75,79,73};
		
		int evenCount=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evenCount++;
		}
		int []evenArray=new int[evenCount];
		int []oddArray=new int[a.length-evenCount];
		int evenIndex=0;
		int oddIndex=0;
		for (int i = 0; i <a.length; i++) {
			if(a[i]%2==0)
			{
				evenArray[evenIndex]=a[i];
				evenIndex++;
			}
			else
			{
				oddArray[oddIndex]=a[i];
				oddIndex++;
			}
		}
		System.out.println("Even Array are as follow");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.println(evenArray[i]+" ");
		}
		System.out.println("Odd Array are as follow");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i]+" ");
		}
	}

}
