package oopsbydurga;

public class ClassMembers {
	
	static String company="xyz";
	static String address="hyd";
	
	int empId;
	String empName;
	double empSalary;
	
	void totalSalary(double basic)
	{
		double hra=0.2*basic;
		double ta=0.15*basic;
		double da=0.25*basic;
		double total=basic+hra+ta+da;
		System.out.println("Total salary : "+total);
	}
	
	static {
		System.out.println("static block");
	}
	static public void main(String[] args) 
	{
		ClassMembers c=new ClassMembers();
		System.out.println(c.empId);
		System.out.println(c.empName);
		System.out.println(c.empSalary);
		System.out.println(company);
		System.out.println(ClassMembers.address);
		c.totalSalary(100);

	}

}
