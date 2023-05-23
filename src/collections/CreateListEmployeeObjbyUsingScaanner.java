package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp5
{
	int id;
	String name;
	double salary;
	Emp5(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class CreateListEmployeeObjbyUsingScaanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp5> list=new ArrayList<Emp5>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 details");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Emp_"+i+" ");
		  int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		Emp5 e=new Emp5(id,name,salary);
		list.add(e);
		}
		System.out.println("Details are:");
		for(Emp5 e:list) {
			System.out.println(e.id+","+e.name+","+e.salary);
		}
	}

}
