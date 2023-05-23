package patterns;

public class Pyramid {

	public static void main(String[] args)
	{
		int n=7;
		for(int i=1;i<=n;i++)
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
		for(int i=1;i<=n1;i++)
		{
			for(int j=i;j<n1;j++)
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
		
		int n11=7;
		for(int i=1;i<=n11;i++)
		{
			for(int j=i;j<n11;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(i==n||k==1||k==2*i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			int nn=7;
			for(int i1=1;i1<=nn;i1++)
			{
				for(int j=i1;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*i1-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
