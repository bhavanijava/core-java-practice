package patterns;

public class ReversePyramids {

	public static void main(String[] args) 
	{
		int n=7;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int n1=7;
		for(int i=n1;i>=1;i--)
		{
			for(int j=i;j<n1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(i==n1||k==1||k==2*i-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		int n11=7;
		for(int i=n11;i>=1;i--)
		{
			for(int j=i;j<n11;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		
		System.out.println();
	}

}
