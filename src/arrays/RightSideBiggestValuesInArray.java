package arrays;

public class RightSideBiggestValuesInArray {

	public static void main(String[] args)
	{
		int[] a= {16,17,3,4,5,2};
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				max=a[j];
				for(int k=j+1;k<a.length;k++)
				{
					if(max<a[k])
					{
						max=a[k];
					}
				}
				System.out.println(max+"");
				break;
			}
		}
	}

}
