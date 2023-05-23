package java8features;

public class MethodReferenceNon_Static_Class {

	
	public static void main(String[] args) {
		MethodReferenceNon_StaticInterface obj=new Demo1()::xyz;
		obj.abcd();
	}

}
