package RemainingArrays;

public class studentDemo {

	public static void main(String[] args) 
	{
		Student []a=new Student[4];
		a[0]=new Student(1,40,"Somu");
		a[1]=new Student(2,41,"Gomu");
		a[2]=new Student(3,38,"Somya");
		a[3]=new Student(4,47,"Gomya");
		
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = i+1; j < a.length; j++)
//			{
//				if(a[i].marks>a[j].marks)
//				{
//					Student temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		//	System.out.println(a[i].marks+" "+a[i].roll+" "+a[i].student);
		}
		
	}

}
