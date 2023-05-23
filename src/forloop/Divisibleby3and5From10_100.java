package forloop;

public class Divisibleby3and5From10_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=100;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
