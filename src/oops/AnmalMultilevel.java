package oops;

public class AnmalMultilevel
{
	public void eat()
	{
		System.out.println("eating..");
	}
}
class Cat extends AnmalMultilevel
{
	public void bark()
	{
		System.out.println("meow..");
	}
}
class BabyCat extends Cat
{
	public void weep()
	{
		System.out.println("weeping..");
	}
}
