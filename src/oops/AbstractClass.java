package oops;

abstract class AbstractClass
{
	public abstract  void animalSound();
}
class Tiger extends AbstractClass
{
	public void animalSound()
	{
		System.out.println("hungry..");
	}
}