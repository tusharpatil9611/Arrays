package Array;

public class Queue {
	static int []a=new int [5];
	static int indexCount=0;
	public static int pop()
	{
		if(indexCount==0)
		{
			System.out.println("Quese is empty");
			return 0;
		}
		else
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			indexCount--;
			return temp;
		}
	}
	public static void print()
	{
		for (int i = 0; i < indexCount; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void push(int num)
	{
		if(indexCount<a.length)
		{
			a[indexCount]=num;
			indexCount++;
		}
			else
				System.out.println("Queue is Full");
	}
	
	

	public static void main(String[] args) 
	{
	push(100);
	push(120);
	push(130);
	print();
	System.out.println(pop());
	print();
	push(10);
	push(20);
	push(20);
	push(60);
	print();
	System.out.println(pop());
	System.out.println(pop());
	System.out.println(pop());
	System.out.println(pop());
	push(10);
	}

}
