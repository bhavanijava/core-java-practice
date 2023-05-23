package oops;

public class PolymorphismMain {

	public static void main(String[] args) 
	{
		Polymorphism obj=new Polymorphism();
		obj.animalSound();
		
		Polymorphism rat=new Rat();
		rat.animalSound();
		
		Polymorphism pig=new Pig();
		pig.animalSound();
		
		
	}

}
