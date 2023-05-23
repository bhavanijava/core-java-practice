package strings;

public class AtTimeLowerToUpper_UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s = "ApPLe";
		    String s1 = "";
		    for(int i=0;i<s.length();i++)
		    {
		    	if(Character.isUpperCase(s.charAt(i)))
		    	{
		        s1=s1+Character.toLowerCase(s.charAt(i));
		    	}
		      	else 
		      	{
		        s1=s1+Character.toUpperCase(s.charAt(i));
		    	}
		    }
		    System.out.println("Toogle String is : "+s1);

		  }

		


	}


