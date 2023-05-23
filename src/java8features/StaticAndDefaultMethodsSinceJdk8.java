package java8features;

interface First
{
	int x=0;
	static void m1()
	{
		System.out.println("static m1");
	}
	default void m2()
	{
		System.out.println("default m2");
	}
	void m3();
}
class Second implements First
{
	public void m3() 
	{
		System.out.println("abstract m3");
	}

}

public class StaticAndDefaultMethodsSinceJdk8 {

	public static void main(String[] args)
	{
		System.out.println("x val: "+First.x);
		First.m1();
		First obj=new Second();
		obj.m2();
		obj.m3();
	}

}
