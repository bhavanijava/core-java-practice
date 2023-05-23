package oopsbydurga;

public class DifferenceBetweenStatic {

	public static void main(String[] args) {
		ClassMembers c=new ClassMembers();
		System.out.println(c.empId);
		System.out.println(c.empName);
		System.out.println(c.empSalary);
		System.out.println(ClassMembers.company);
		System.out.println(ClassMembers.address);
		c.totalSalary(100);
	}

}
