package patterns;

public class ComplexPatterns {

	public static void main(String[] args)
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
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
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n1;i>=1;i--)
		{
			for(int j=i;j<n1;j++)
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
		
	}

}
