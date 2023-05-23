package multithreadprograms;

public class UsingSleep {

	public static void main(String[] args) 
	{
		Parent obj=new Parent();
		Parent2 obj1=new Parent2();
		
		obj.start();
		obj1.start();
	}

}
class Parent extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("first"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class Parent2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("second"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}