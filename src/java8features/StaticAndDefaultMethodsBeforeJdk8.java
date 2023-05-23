package java8features;

interface Test
{
	void m1();
}
class Demo implements Test
{
	public  void m1()
	{
		System.out.println("m1...");
	}
}

public class StaticAndDefaultMethodsBeforeJdk8 {

	public static void main(String[] args) {
		Test obj = new Demo();
		obj.m1();
	}

}
