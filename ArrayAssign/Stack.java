package ArrayAssign;

public class Stack {
	static int []a=new int[5];
	static int count=0;
	
	public static int pop()
	{
		if(count==0)
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
				count--;
				return count;
	}
	public static void print()
	{
		for (int i = 0; i < count; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void push(int num)
	{
		if(count<a.length)
		{
			a[count]=num;
			count++;
		}
		else
			System.out.println("Stack is Full");
	}
	

	public static void main(String[] args) {

		print();
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);push(60);
		print();
		System.out.println(pop());


	}

}
