package labactivity;

public class Prime1_30 {

	public static void main(String[] args) 
	{
		for(int j=1;j<=30;j++)
		{
			int count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				count++;

			}
			if(count==2)
			{
				System.out.print(j+" ");
			}
			
		}
	}

}
