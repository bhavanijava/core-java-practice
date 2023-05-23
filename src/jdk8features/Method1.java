package jdk8features;
@FunctionalInterface
public interface Method1 {
	void abc();
}
class Method2{
	static void xyz() {
		System.out.println("xyz logic");
	}
}