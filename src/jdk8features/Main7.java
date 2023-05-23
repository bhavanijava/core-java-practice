package jdk8features;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main7 {
	public static void main(String[]args) {
		List<Employee> elist=new ArrayList<>();
		
		
		Employee e1=new Employee(1001,"Kannababu","Male", 40000, "Hyderabad","EIE");
		Employee e2=new Employee(1002,"Srinivas","Male", 42000, "Chennai","CSE");
		Employee e3=new Employee(1003,"Yacob","Male", 45000, "Banglore","CSE");
		Employee e4=new Employee(1004,"Venkat","Male", 55000, "Hyderabad","CSE");
		Employee e5=new Employee(1005,"Samantha","Female", 65000, "Chennai","ECE");
		Employee e6=new Employee(1006,"Anushka","Female", 43000, "Banglore","EIE");
		Employee e7=new Employee(1007,"Sekhar","Male", 23000, "Banglore","ECE");
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);
		
		System.out.println("1) All Employee*******");
		elist.stream().map(e->e.toString()).forEach(System.out::println); 
		
		
		System.out.println("2) Basic Salary Above 45000********");
		elist.stream().filter(e -> e.getBasicsal()>45000).forEach(System.out::println);
		
		System.out.println("3) Staying in Hyderabad********");
		elist.stream().filter(e->e.city.equalsIgnoreCase("Hyderabad")).forEach(System.out::println);
		
		
		System.out.println("4) Number of Employee********");
		System.out.println("Employee : "+elist.size()+" members");
		
		
//		System.out.println("5) Studying in CSE dept********");
//		elist.stream().filter(e-> e.deptname.equalsIgnoreCase("CSE")).forEach(System.out::println);
//		
//		
//		System.out.println("6) Basic Salary Between 45000 to  60000********");
//		elist.stream().filter(e -> e.basicsal>=45000 && e.basicsal<= 60000).forEach(System.out::println);
//		
		System.out.println("7) Count of Male and females********");
		int a=(int)elist.stream().filter(e->e.gender.equalsIgnoreCase("male")).count();
		System.out.println("Male "+a);
		int b=(int)elist.stream().filter(e->e.gender.equalsIgnoreCase("female")).count();
		System.out.println("Female "+b);
		
		
		System.out.println("8). Who are staying in hyderabad and above 40000");
		elist.stream().filter(e->e.city.equalsIgnoreCase("hyderabad")&&e.getBasicsal()>40000).forEach(System.out::println);
		
//		System.out.println("9) Sum of Total salary of empolyee who is working in Bangalore******");
//		int sum = elist.stream().filter(e->e.city.equalsIgnoreCase("Banglore")).mapToInt(e->e.basicsal).sum();
//		System.out.println("Total Salaries "+sum);
//		
//		System.out.println("10) No.of emps working in ECE********");
//		int c=(int)elist.stream().filter(e->e.deptname.equalsIgnoreCase("ece")).count();
//		System.out.println("No of emps in ece ="  +c);
//		
//		System.out.println("11) Adding hra da the Total salary becomes*********");
//		elist.stream().map(e->{double hra=0.4*e.basicsal;double da=0.2*e.basicsal;e.totalsal=e.basicsal+hra+da;return e.totalsal;}).forEach(System.out::println);
//		
//		System.out.println("12) Salary of Samantha********");
//        elist.stream().filter(e-> e.empname.equalsIgnoreCase("samantha")).map(e->e.basicsal).forEach(System.out::println);
        
        
	}
	
}