package jdk8features;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj=(x,y)->{
			System.out.println("sum is "+(x+y));
		};
		obj.add(10, 20);
	}

}
