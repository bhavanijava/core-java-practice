package forloop;

public class Pattern8 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==j&&i<=4||j==8-i&&i<=4||j==4&&i>=4)
				{
				System.out.print("+");
				}
			else {
				System.out.print(" ");
			     }
			}
			System.out.println();
		}
	}

}
