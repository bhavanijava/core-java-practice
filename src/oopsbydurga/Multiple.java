package oopsbydurga;

interface Parent1 {
    void m1();
    void m2();
}

interface Parent2 {
	void m1();
}

class Child implements Parent1, Parent2 {

	@Override
	public void m1() {
		System.out.println("hello");
	}

	@Override
	public void m2() {
		System.out.println("hello3");

	}
	
	
}

public class Multiple {
    public static void main(String[] args) {
//    	Child c = new Child();
//        c.m1();
//        c.m1();
    	
    	Parent1 p1=new Child();
    	p1.m1();
    	p1.m2();
    	
    	Parent2 p2=new Child();
    	p2.m1();
    	
    	
    	Child c=new Child();
    	c.m1();
    	c.m2();
        
        
    }
}
