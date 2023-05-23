package jdk8features;
@FunctionalInterface
public interface First1 {
	void fun();
}
class Second2 implements First1{
	public void fun() {
		System.out.println("Through class");
		
	}
}