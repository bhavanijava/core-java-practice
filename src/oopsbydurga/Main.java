
package oopsbydurga;

//interface FirstInterface {
//  public void myMethod(); // interface method
//  //public void m1();
//}
//
//interface SecondInterface {
//  public void myOtherMethod(); // interface method
//}
//
// class DemoClass implements FirstInterface, SecondInterface {
//  public void myMethod() {
//    System.out.println("Some text..");
//  }
//  public void myOtherMethod() {
//    System.out.println("Some other text...");
//  }
//}
//
//
//
//class Main {
//  public static void main(String[] args) {
//    DemoClass myObj = new DemoClass();
//    myObj.myMethod();
//    myObj.myOtherMethod();
//  }
//}
// 

interface FirstInterface {
	  public void myMethod(); // interface method
	  public void m1();
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	abstract class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  
	  public void myOtherMethod() {
	        System.out.println("Some other text...");
	      }
	}

	class Main {
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass() {
	      

	      public void m1() {
	        System.out.println("m1 method");
	      }
	    };
	    myObj.myMethod();
	    myObj.myOtherMethod();
	    myObj.m1();
	  }
	}
