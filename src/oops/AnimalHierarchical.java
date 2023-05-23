package oops;

public class AnimalHierarchical 
{
	public void eat()
	{
		System.out.println("eating..");
	}
}
class Lion extends AnimalHierarchical
{
	public void Big()
	{
		System.out.println("Non-Veg..");
	}
}
class Goat extends AnimalHierarchical
{
	public void small()
	{
		System.out.println("Veg..");
	}
}
