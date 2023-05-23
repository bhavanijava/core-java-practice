package multithreadprograms;

public class USingJoinMethod {

	public static void main(String[] args) {
		Bhavani obj=new Bhavani();
		obj.start();
		System.out.println("@Bhavani Class Start");
		try
		{
			obj.join();
		}
		catch(Exception e) {
			System.out.println("@Bhavani Class End");
		}

		
		Sankar obj2=new Sankar();
		obj2.start();
		System.out.println("@Sankar Class Start");

		try
		{
			obj2.join();
		}
		catch(Exception e) {
			System.out.println("@Sankar Class End");
		}

	}
}
class Bhavani extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("First "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class Sankar extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Second "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}