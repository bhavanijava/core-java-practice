package java8features;

class Main
{
	static void fun()
	{
		System.out.println("fun..");
	}
}
public class MethodReferenceStaticClass {

	public static void main(String[] args)
	{
		MethodReferenceStaticInterface obj=Main::fun;
		obj.abc();
	}

}
