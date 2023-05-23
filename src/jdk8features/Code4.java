package jdk8features;

class Code4{
	public static void  main(String[] args) {
		Cat obj= new Cat()
		{
			public void fun(){
				System.out.println("Through anonymous inner class");
				
			}
		};
		obj.fun();
	}
}