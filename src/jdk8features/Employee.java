package jdk8features;

class Employee{
	int empno;
	String empName;
	String gender;
	int basicSalary;
	String city;
	String deptName;
	public double totalSalary;
	Employee(int empno,String empname,String gender,int basicsal,String city,String deptname)
	{
		this.empno=empno;
		this.empName=empname;
		this.gender=gender;
		this.basicSalary=basicsal;
		this.city=city;
		this.deptName=deptname;
		
	}


@Override
public String toString() {
	return "Test [empno=" + empno + ", empname=" + empName + ", gender=" + gender + ", basicsal=" + basicSalary + ", city="
			+ city + ", deptname=" + deptName + "]";
}


public int getBasicsal() {
	// TODO Auto-generated method stub
	return 0;
}



}