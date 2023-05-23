package collections;

import java.util.ArrayList;
import java.util.List;

class Emp2
{
	int id;
	String name;
	int salary;
	
	
	Emp2(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
}


public class ArrayinForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id= {10,20,30};
		String[] name= {"aa","bb","cc"};
		int[] salary= {5000,6000,7000};
		List<Emp2> list=new ArrayList<Emp2>();     
		
		for(int i=0;i<=id.length-1;i++)
		{
			
			Emp2 e7=new Emp2(id[i],name[i], salary[i]);
			list.add(e7);
			
		}
		System.out.println("Details are");
		for(Emp2 e7:list)
		{
			System.out.println(e7.id+","+e7.name+","+e7.salary);
		}
		
	}

}
