package specialprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class HowManyWaysCanPrintArrayObject {

	public static void main(String[] args) 
	{
		
				List<String> list=new ArrayList<String>();

				list.add("Java");
				list.add("JDBC");
				list.add("Servlets");
				list.add("JSP");
				list.add("Spring");
				list.add("Hibernate");
				
				
				
				System.err.println("by using for loop");
				for(int i=0;i<=list.size()-1;i++)
				{
					System.out.println(list.get(i));
				}		
				System.out.println();

				System.err.println("by using for-each loop");
				for(String s:list)
				{
					System.out.println(s);
				}
				System.out.println();

				
				System.err.println("by using iterator");
				Iterator<String>itr=list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}		
				System.out.println();


				System.err.println("by using lambda expression");
				list.forEach(s->System.out.println(s));		
				
				System.out.println();

				System.err .println("by using method references");
				list.forEach(System.out::println);
				System.out.println();


				System.err.println("by using filter to display word starts with s");
				Stream<String>st=list.stream();
				Stream<String>res=st.filter(s->s.startsWith("S"));
				res.forEach(System.out::println);

				System.out.println();

				System.err.println("display all in single line");
				list.stream().filter(s->s.startsWith("S")).forEach(System.out::println);

			

		
	}

}
