package forloop;

public class Pattern3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(k++);
				if(k>9)
				{
					k=1;
 
				}
			}
			System.out.println( );
			
		}

	}

}
