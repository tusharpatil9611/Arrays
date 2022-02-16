package ArrayAssign;

public class CopyElement {

	public static void main(String[] args) {

int []a={12,31,34,54,65};
int []b=new int[a.length];
System.out.println("Element after copy");
for (int i = 0; i < b.length; i++) 
{
	b[i]=a[i];
	System.out.print(b[i]+" ");
	
}


	}

}
