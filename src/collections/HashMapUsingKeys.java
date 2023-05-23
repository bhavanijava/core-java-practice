package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class  Emp8
{
	int id;
	String name;
	double sal;
	Emp8(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}

public class HashMapUsingKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Emp8> map=new HashMap<Integer,Emp8>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
		System.out.println("Emp_"+i+"_Details are:");
		int id=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		Emp8 e=new Emp8(id,name,sal);
		map.put(id, e);
					
		}
		System.out.println("Details are");
		Set<Integer> keys=map.keySet();
		for(Integer k:keys)
		{
			Emp8 e=map.get(k);
			System.out.println(e.id+","+e.name+","+","+e.sal);
			
		}
		
	}

}
