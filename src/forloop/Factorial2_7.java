package forloop;

public class Factorial2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=7;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
				fact=fact*i;
			System.out.println(i+"factorial"+fact);
			
		}
		
		
			
	}

}
