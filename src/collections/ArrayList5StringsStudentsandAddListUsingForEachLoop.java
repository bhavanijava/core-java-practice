package collections;

import java.util.ArrayList;
import java.util.List;

class Student
{
	public static Object out;
	int id;
	String name;
	String course;
	double fees;
	Student(int id,String name,String course,double fees)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.fees=fees;
		
		
	}
}

public class ArrayList5StringsStudentsandAddListUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student(1,"hari","java",4000);
		Student s2=new Student(2,"giri",".net",5000);
		Student s3=new Student(3,"rani","java",6000);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Student Details are:");
		for(Student s:list)
		{
			System.out.println(s.id+","+s.name+","+s.course+","+s.fees);
			
		}
		
		
	}

}
