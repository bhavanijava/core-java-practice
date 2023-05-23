



package collections;

import java.util.ArrayList;
import java.util.List;

class Emp
{
	int id;
	String name;
	double salary;
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}

public class ArrayList5StringsandAddListUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> list=new ArrayList<Emp>();
		Emp e1=new Emp(10,"aaa",5000);
		Emp e2=new Emp(20,"bbb",6000);
		Emp e3=new Emp(30,"ccc",7000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Details are:");
		for(Emp e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
			
		}
	}

}

