package oopsbydurga;

abstract class Vehicle
{
	public abstract int getNoOfWheels();
	 public void sleep() {
		    System.out.println("Zzz");
		  }
}
class Bus extends Vehicle
{
	public int getNoOfWheels()
	{
		return 6;
	}
}
class Auto extends Vehicle
{
	public int getNoOfWheels()
	{
		return 3;
	}
}



public class Test {

	public static void main(String[] args)
	{
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());
		
		Auto a=new Auto();
		System.out.println(a.getNoOfWheels());
		
		a.sleep();
	}

}
