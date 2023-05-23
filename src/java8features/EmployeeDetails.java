package java8features;
import java.util.*;
import java.util.stream.Collectors;

class Employee
{
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class EmployeeDetails {
	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("bhavani",34));
		list.add(new Employee("naga",32));
		list.add(new Employee("bhavani",21));
		
		List<Employee> sortedAgeEmployee=list.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		sortedAgeEmployee.forEach(e->System.out.println(e.getName()+" "+e.getAge()));
		
		System.out.println();
		
		List<Employee> sortedNameEmployee=list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		sortedNameEmployee.forEach(e->System.out.println(e.getName()+" "+e.getAge()));
		
		
	}

}
