package oopsbydurga;


public class All {
	static int a=10;      //this is static variable
	int b=20;			  //this is instance variable

	static
	{
		System.out.println("static block");	//this is static block	
	}

	{
		System.out.println("instance block"); //this is instance block
	}

	static void m1()
	{
		System.out.println("static method");  //this is static method
	}

	void m2()
	{
		System.out.println("instance method");  //this is instance method
	}

	All()
	{
		System.out.println("constructor");    //this is constructor
	}



	public static void main(String[] args)
	{
		System.out.println("this is main");    //this is main method output statement
		System.out.println(a);                 // call static variable
		All.m1();							   // call static method																	

		All all=new All();					   // create object
		System.out.println(all.b);			   // call instance variable
		all.m2();							   // call instance method

	}
}



/*
 *     output 
 *     
 *     static block  ----> it is executes before main method because it is static block
       this is main  ----> it is main method print statement(first line in main method)
       10			-----> it is static variable call directly, because calling in same class 
       static method ----> it is static method call directly, because calling in same class
       instance block ---> it is instance block it is executed automatically when object is created
       constructor   ----> it is constructor it is executed when object is created 
                           (in object creation All(); this means calling constructor)
       20            ----> it is instance variable so call with the help of object reference
       instance method---> it is instance method so call with the help of object reference

 */