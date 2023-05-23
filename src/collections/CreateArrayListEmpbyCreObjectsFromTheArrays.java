package collections;

import java.util.ArrayList;
	
import java.util.List;

class Emp1
{
	int id;
	String name;
	int salary;
	
	Emp1(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}


public class CreateArrayListEmpbyCreObjectsFromTheArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id= {10,20,30};
		String[] name= {"aa","bb","cc"};
		int[] salary= {5000,6000,7000};
		List<Emp1> list=new ArrayList<Emp1>();     
		
		for(int i=0;i<=id.length-1;i++)
		{
			
			Emp1 e=new Emp1(id[i],name[i], salary[i]);
			list.add(e);
			
		}
		System.out.println("Details are");
		for(Emp1 e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
		}
		
	}

}
