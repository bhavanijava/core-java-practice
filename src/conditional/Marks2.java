package conditional;
import java.util.Scanner;


public class Marks2 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int m6=sc.nextInt();
		int tot=m1+m2+m3+m4+m5+m6;
	    int per=tot/6;
	    if(per>=35&&per<=54)
	    {
	    	System.out.println("A grade");
	    	System.out.println("total:"+tot);
		    System.out.println("percentage:"+per);
	      	
	    }
	    else if(per>=55&&per<=74)
	    {
	    	System.out.println("B grade");
	    	System.out.println("total:"+tot);
		    System.out.println("percentage:"+per);
	    }
	    else if(per>=75&&per<=100)
	    {
	    System.out.println("C grade");	
	    System.out.println("total:"+tot);
	    System.out.println("percentage:"+per);
	    }
	    else
	    {
	    System.out.println("fail");	
	    }
	    
	    
	    
    }

}
