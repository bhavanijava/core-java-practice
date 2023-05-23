package jdk8features;

public interface first {
	
		void m1();
	}
	  class Second implements first{
		 
		  public void m1() {
			  for(int i=1; i<=100; i++)
			  {
				  if(i!=0)
				  for(int j=2; j>=1; j--) {
			  
				  System.out.print("   kajjikaya murugun ");
				  }
				  System.out.println();
			  }
		  }
	  }



