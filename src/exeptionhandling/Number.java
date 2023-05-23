package exeptionhandling;

public class Number
{
	public static void main(String[] args)
	{
		try 
		{
			String s="abc";
			int x= Integer.parseInt(s);
			//System.out.println(x);
			
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}

}
