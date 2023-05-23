package experiments;

import java.util.*;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Anu Univercity:");
		System.out.println(" Enter College Name :"); 
		 
		 switch(s.next())
		 {
		 case "Bharthi":
		 System.out.println("English :");
		 System.out.println("Programming :");
		 System.out.println("Logic :");
		 System.out.println("CSS :");
		 break;
		 case "SriCollege":
		 System.out.println("Java :");
		 System.out.println("Programming:");
		 System.out.println("Logic:");
		 System.out.println(" CSS:");
		 break;
		 case "Bhavani":
			 System.out.println("Java :");
			 System.out.println(" Programming:");
			 System.out.println(" Logic:");
			 System.out.println("CSS :");
			 break;
		 case "Dhoni":
			 System.out.println("Java :");
			 System.out.println("Programming :");
			 System.out.println("  Logic:");
			 System.out.println("CSS  :");
			 break;
			 default:
			 {
				 System.out.print("Collage Name Not Valid!!!!");
			 }
		 }
		
		
		
		s.close();
	}

}
