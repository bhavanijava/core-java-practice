package jdk8features;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Comparator;
import java.util.List; 
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
 public static void main(String[] args) {
  List<Employee> empList = new ArrayList<>(); 
  empList.add(new Employee(1001,"Kannababu","male",40000,"Hyderabad","EIE")); 
  empList.add(new Employee(1002,"Srinivas","male",42000,"Chennai","CSE")); 
  empList.add(new Employee(1003,"Yakoob","male",45000,"Banglore","CSE")); 
  empList.add(new Employee(1004,"Venkat","male",55000,"Hyderabad","CSE")); 
  empList.add(new Employee(1005,"Samantha","Female",65000,"Chennai","ECE")); 
  empList.add(new Employee(1006,"Anushka","Female",43000,"Banglore","EIE")); 
  empList.add(new Employee(1007,"Sekhar","male",23000,"Banglore","ECE")); 
  
 

  
  //QUESTION NUMBER 1
   System.err.println("EMPLOYEE DEATAILS ----------------"); 

   System.out.println("1--------------------------------------------------"); 
   // empList.forEach(System.out::println); 
   empList.forEach(x->System.out.println(x)); 
   System.out.println(" ");
    //QUESTION NUMBER 2
    System.out.println("2--------------------------------------------------"); 
    System.out.println("SALARY  >45000 ----------------"); 
       empList.stream().filter (e-> e.basicSalary > 45000). forEach(System.out::println);
  //QUESTION NUMBER 3
    System.out.println("3--------------------------------------------------"); 
       System.out.println("STAYING IN HYDERABAD ----------------"); 
       empList.stream().filter (e-> e.city.equalsIgnoreCase("Hyderabad")). forEach(System.out::println);
 //QUESTION NUMBER 4
    System.out.println("4--------------------------------------------------"); 
      System.out.println("NUMBER OF THE EMPLOYEES IN COMPANY ----------------");
      System.out.println(empList.size());
    //QUESTION NUMBER 5
   System.out.println("5--------------------------------------------------"); 
      System.out.println("Whose Dept name in CSE ----------------");
      empList.stream().filter (e-> e.deptName.equalsIgnoreCase("CSE")). forEach(System.out::println);
    //QUESTION NUMBER 6
   System.out.println("6--------------------------------------------------"); 
      System.out.println("Whose Salary between 45000 and 60000 ----------------");
      empList.stream().filter (e-> e.basicSalary>45000 && e.basicSalary<60000). forEach(System.out::println); 
    //QUESTION NUMBER 7
   System.out.println("7--------------------------------------------------"); 
      System.out.println("Number of MALES  ----------------");
      int a=(int) empList.stream().filter(e->e.gender.equalsIgnoreCase("male")).count();
      System.out.println(a);
      System.out.println("Number of FEMALES  ----------------");
      int b=(int) empList.stream().filter(e->e.gender.equalsIgnoreCase("female")).count();
      System.out.println(b);
    //QUESTION NUMBER 8
   System.out.println("8--------------------------------------------------"); 
      System.out.println("STAYING IN HYD WITH SALARY > 40000");
      empList.stream().filter (e-> e.city.equalsIgnoreCase("Hyderabad") && e.basicSalary >40000). forEach(System.out::println);
    //QUESTION NUMBER 9
   System.out.println("9--------------------------------------------------"); 
     int sum= empList.stream().filter (e-> e.city.equalsIgnoreCase("Banglore")).mapToInt(e->e.basicSalary).sum();
      System.out.println("total salary all employes staying in banglore  = "+sum);
      //QUESTION NUMBER 10
   System.out.println("10--------------------------------------------------"); 
      System.out.println("No of Employees working in ECE dept");
      long c=empList.stream().filter (e-> e.deptName.equalsIgnoreCase("ECE")). count();
        System.out.println(c); 
       //QUESTION NUMBER 11
     System.out.println("11--------------------------------------------------");
     System.out.println("displaying of emp details along with da,hra,tsal");
     List<Employee> streamList = empList.stream().map( e ->{
   int da= (int) (e.basicSalary * 0.2);
int hra=(int) (e.basicSalary * 0.4);

e.totalSalary= da+hra+ e.basicSalary;
return e;
}).collect(Collectors.toList());
streamList.forEach(System.out::println);
//QUESTION NUMBER 12
System.out.println("12--------------------------------------------------"); 
empList.stream().filter (e-> e.empName.equalsIgnoreCase("Samantha")).map(e->e.basicSalary). forEach(System.out::println);

//QUESTION NUMBER 14
System.out.println("14--------------------------------------------------"); 
empList.stream().filter (e ->e.empName. startsWith("S")).forEach(System.out::println);

//QUESTION NUMBER 15
 System.out.println("15--------------------------------------------------"); 
 Comparator<Employee> com=(e1,e2) ->{
  if (e1.basicSalary>e2.basicSalary) 
   return -1;
else if (e1.basicSalary<e2.basicSalary)
return 1;
else 
return 0;
 };
 empList.stream().sorted(com).forEach(e->System.out.println(e));

}
}
