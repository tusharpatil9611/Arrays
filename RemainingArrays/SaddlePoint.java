package RemainingArrays;
public class SaddlePoint {
	public static void main(String[] args)
	{
			int [][]a={{6,3,1},
					{9,3,8},
					{2,4,5}};
			int index=0;
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++)
				{
					boolean isSmallestInRow=true;
					for (int l = 0; l < a[i].length; l++) 
					{
						if(a[i][l]<a[i][j])
							isSmallestInRow=false;
						//break;
					}
					boolean isLargestInCol=true;
					if(isSmallestInRow==true)
					{
						for (int k = 0; k < a.length; k++) 
						{
							if(a[k][j]>a[i][j])
							{
								isLargestInCol=false;
								//break;
							}
						}
					}
					if(isSmallestInRow==true && isLargestInCol==true)
					{
						System.out.println(a[i][j]);
						index++;
					}
				}
			}
			if(index==0)
				System.out.println("not saddle");
	}

}
