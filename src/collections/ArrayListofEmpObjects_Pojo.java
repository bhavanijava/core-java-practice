package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Employee
{
	private int id;
	private String name;
	private double salary;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
}




public class ArrayListofEmpObjects_Pojo {

	public static void main(String[] args) {

		
		int[] id= {100,101,102,103};
		
		String[] name={"sujatha","rani","raju","sasi"};
		double[] salary= {20000,40000,70456,30008 };
		List<Employee> list=new ArrayList<Employee>();
		for(int i=0;i<=id.length-1;i++)
		{
			Employee e=new Employee();
			e.setId(id[i]);
			e.setName(name[i]);
			e.setSalary(salary[i]);
			list.add(e);
			
		}
		System.out.println("Details are");
		for(Employee x:list)
		{
			System.out.println(x.getId()+","+x.getName()+","+x.getSalary());
		}
		
	}
}
