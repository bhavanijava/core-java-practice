package collections;

import java.util.ArrayList;
import java.util.List;





public class LabActivity {

	

	private static double basicsal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Test> list=new ArrayList<Test>();
		Test e1=new Test(1001,"kannababu","male",40000,"hyderabad","EIE");
		Test e2=new Test(1002,"srinivas","male",42000,"chennai","CSE");
		Test e3=new Test(1003,"Yacob","male",45000,"banglore","CSE");
		Test e4=new Test(1004,"Venkat","male",55000,"hyderabad","CSE");
		Test e5=new Test(1005,"samantha","female",65000,"chennai","ECE");
		Test e6=new Test(1006,"anushka","female",43000,"banglore","EIE");
		Test e7=new Test(1007,"sekhar","male",23000,"banglore","ECE");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println("Details are");
		for(Test e:list) {
			System.out.println(e.toString());
		}
		
		
		System.out.println("  ");
		for(Test e:list) {
			if(e.basicsal>45000) {
				System.out.println(e.toString());
			}

		}
		
		
		System.out.println("  ");
		for(Test e:list) {
			if(e.city.equalsIgnoreCase("Hyderabad"))
			{
				System.out.println(e.toString());
			}
		}
		
		
		
		
		
		System.out.println("  ");
		int count=0;
		for(Test e:list) {
			count++;
		}
		System.out.println(count);
		
		System.out.println("  ");
		
		for(Test e:list) {
			if(e.deptname.equalsIgnoreCase("CSE"))
			{
				System.out.println(e.toString());
			}
		}
		
		
		
		System.out.println("  ");
		for(Test e:list) {
			if(e.basicsal>45000 && e.basicsal<60000)
			{
				System.out.println(e.toString());
			}
		}
		
		
		System.out.println("  ");
		int count1=0;
		for(Test e:list) {
			if(e.gender.equals("male") || e.gender.equals("female"))
			{
				count1++;
			}
		}
		System.out.println(count1);
		
		
		System.out.println("  ");
		for(Test e:list) {
			if(e.city.equals("hyderabad")&&e.basicsal>40000) {
				System.out.println(e.toString());
			}
		}
		
		
		System.out.println("  ");
		int d=0;
		for(Test e:list) {
			if(e.city.equalsIgnoreCase("banglore"))
			{
			d=d+e.basicsal;
				
				
				
			}
		}System.out.println(d);
		
		
		
System.out.println("  ");
		
		for(Test e:list) {
			if(e.deptname.equalsIgnoreCase("ECE"))
			{
				System.out.println(e.toString());
			}
		}
		
		
		
System.out.println("  ");
		
		
		
		for(Test e:list) {

			double da1,hra1,tsal1;
			
			da1=0.20*basicsal;	
			hra1=0.20*basicsal;
			tsal1=basicsal+da1+hra1;
			System.out.println(tsal1);
			System.out.println(e.toString());

	}
		
//		System.out.println("  ");
//		for(Test e:list) {
//			if(e.basicsal.equalsIgnoreCase("samantha"))
//			{
//				System.out.println(e.toString());
//			}
//		}}
}
}
