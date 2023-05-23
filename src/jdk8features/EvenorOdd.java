package jdk8features;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check obj=(n)->n%2!=0;
		System.out.println("5 isOdd: "+obj.isOdd(5));
		System.out.println("8 isOdd: "+obj.isOdd(8));

	}

}
