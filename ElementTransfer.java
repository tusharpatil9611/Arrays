package Array;

public class ElementTransfer {

	public static void main(String[] args) {
		int [] a={10,12,14,16,18};
		int [] b=new int [a.length];			//syntax to transfer.
		 for(int i=0;i<a.length;i++)
		 {
			 b[i]=a[i];
			 System.out.print(+b[i]+" ");
		 }
	}

}
