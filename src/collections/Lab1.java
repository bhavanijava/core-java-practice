package collections;

class Lab1{
	int empno;
	String empname;
	String gender;
	int basicsal;
	String city;
	String deptname;
	Lab1(int empno,String empname,String gender,int basicsal,String city,String deptname)
	{
		this.empno=empno;
		this.empname=empname;
		this.gender=gender;
		this.basicsal=basicsal;
		this.city=city;
		this.deptname=deptname;
		
	}


@Override
public String toString() {
	return "Test [empno=" + empno + ", empname=" + empname + ", gender=" + gender + ", basicsal=" + basicsal + ", city="
			+ city + ", deptname=" + deptname + "]";
}



}