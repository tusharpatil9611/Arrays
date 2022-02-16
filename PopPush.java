package Array;

public class PopPush {
	static int []a=new int [5];					//declare the size of the array or provide memory 
	static int index=0;
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("Queue is Empty ");
			return 0;
		}
		else
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}	
			index--;
			return temp;
		}
	}
	public static void print()
	{
		for (int i = 0; i <index; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void push(int num)
	{
		if(index<a.length)
		{
			a[index]=num;
			index++;
		}
		else
		{
			System.out.println("Queue is Full");
		}
	}
public static void main(String[] args) {
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
	push(20);
	push(30);
	push(40);
	push(50);
	print();
	System.out.println(pop());
	print();
	push(60);
	print();
	}
}
