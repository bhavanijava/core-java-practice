package collections;

import java.util.ArrayList;
import java.util.List;





public class Lab {

	

	private static double basicsal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Lab1> list=new ArrayList<Lab1>();
		Lab1 e1=new Lab1(1001,"kannababu","male",40000,"hyderabad","EIE");
		Lab1 e2=new Lab1(1002,"srinivas","male",42000,"chennai","CSE");
		Lab1 e3=new Lab1(1003,"Yacob","male",45000,"banglore","CSE");
		Lab1 e4=new Lab1(1004,"Venkat","male",55000,"hyderabad","CSE");
		Lab1 e5=new Lab1(1005,"samantha","female",65000,"chennai","ECE");
		Lab1 e6=new Lab1(1006,"anushka","female",43000,"banglore","EIE");
		Lab1 e7=new Lab1(1007,"sekhar","male",23000,"banglore","ECE");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println("Details are");
		
		
		list.forEach(System.out::println);
		System.out.println();
		
		System.err.println("emp salary whose salary greater than 45000");
		
		list.stream().filter(e->e.basicsal>45000).forEach(System.out::println);
		
		System.err.println("using stream ");
		list.stream().filter(e->e.city.equalsIgnoreCase("hyderabad")).forEach(System.out::println);
		
		System.err.println("using stream api4");
		System.out.println(list.size());
		
		System.err.println("using stream api5");
		list.stream().filter(e->e.deptname.equalsIgnoreCase("cse")).forEach(System.out::println);
		
//        System.err.println("using stream api6");		
//		list.stream().filter(e->(e.basicsal>=45000 && e.basicsal<60000)).forEach(System.out::println);
//		
		System.err.println("using stream api7");		
		long count2=list.stream().filter(e->(e.gender.equalsIgnoreCase("male")||e.gender.equalsIgnoreCase("female"))).count();
		char[] count = null;
		System.out.println(count);
		
		list.stream().filter(e->e.basicsal>40000 && e.city.equalsIgnoreCase("hyderabad")).forEach(System.out::println);
		
	    System.err.println("10");
	    list.stream().filter(e->(e.deptname.equalsIgnoreCase("ECE"))).forEach(e->System.out.println(e));
	    System.out.println();
	    
	    
	   
	    
	    
	  System.err.println("using stream api13");		
	  long count3 =list.stream().filter(e->e.deptname.equalsIgnoreCase("ece")).count();	
	  char[] count1 = null;
	System.out.println(count1);
	}}