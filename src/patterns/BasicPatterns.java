package patterns;

public class BasicPatterns {

	public static void main(String[] args)
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==1&&j<=4||j==4||i==7&&j>=4)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
System.out.println();

for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}

System.out.println();

	int x=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(x++);
				if(x>
				9)
				{
					x=1;
				}
			}
			System.out.println();
		}

System.out.println();
		
		
	}

}
