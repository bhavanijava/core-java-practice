package multithreadprograms;

public class Default3 {

	public static void main(String[] args) {
		
		System.out.println("starts @ Default3");
		Robo r=new Robo();
		r.start();
//		try {
//			r.join();
//		}
//		catch(Exception e) {}
//		System.out.println("Ends @ Default3");
		
	}

}
class Robo extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("First"+i);
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
