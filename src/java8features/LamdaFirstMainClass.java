package java8features;


//class Zoo implements FirstInterface
//{
//	
//
//	@Override
//	public void fun(int x, int y) {
//		// TODO Auto-generated method stub
//		System.out.print(x+y);
//	}
//}

//  ()->{}; lamda expression syntax


public class LamdaFirstMainClass {

	public static void main(String[] args)
	{
		LamdaFirstInterface obj=(x,y)->{System.out.println(x+y); 
								   System.out.println(x-y);
								   System.out.println(x*y);
								   System.out.println(x/y);
								   System.out.println();
								  };
		obj.fun(5,6);
		obj.fun(10,20);
	}

}
