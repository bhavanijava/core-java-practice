package oops;

public class Polymorphism {
	public void animalSound()
	{
		System.out.println("The animal makes sound..");
	}
}
class Rat extends Polymorphism
{
	public void animalSound()
	{
		System.out.println("kich kich..");
	}
}
class Pig extends Polymorphism
{
	public void animalSound()
	{
		System.out.println("wee wee..");
	}
}
