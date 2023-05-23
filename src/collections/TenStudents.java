package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TenStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Details");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Student_id : Names");
			int id=sc.nextInt();
			String name=sc.next();
			map.put(id,name);
		}
		System.out.println("details are");
		Set<Integer> keys=map.keySet();
		for(Integer k:keys)
		{
			String v=map.get(k);
			if(k%2==0) {
			System.out.println(k+"="+v);
			}
		}
	}

}
