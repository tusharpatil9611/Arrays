package ArrayAssign;

public class ReverseByTwo {

	public static void main(String[] args) {
		   int[] a = {12, 45, 87, 95, 67, 140};
        int i = 0;
        int j = a.length-1;
        while (j > i) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
            i++;
            j--;

        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

	}

}
