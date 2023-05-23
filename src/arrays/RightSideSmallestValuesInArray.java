package arrays;

public class RightSideSmallestValuesInArray {

	public static void main(String[] args)
	{
		int[] a= {16,17,3,4,5,2};
		int min=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				min=a[j];
				for(int k=j+1;k<a.length;k++)
				{
					if(min>a[k])
					{
						min=a[k];
					}
				}
				System.out.println(min+"");
				break;
			}
		}
	}

}
