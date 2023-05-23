package multithreadprograms;

public class Default {

	public static void main(String[] args) {
		
		First f=new First();
		Second s=new Second();
		f.start();
		s.start();
		
	}

}
class First extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("First:"+i);
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Second:"+i);
		}
	}
}

