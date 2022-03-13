package RemainingArrays;

public class RemoveMoreElement {

	public static void main(String[] args) 
	{
		int []a={2,4,6,8,6,1,9};
	
		int count=0;
		int num=6;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
				count++;
		}
		int []b=new int [a.length];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=num)
			{
				b[index]=a[i];
				index++;
			}
		}
		for (int i = 0; i < index; i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
