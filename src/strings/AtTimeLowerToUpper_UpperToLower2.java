package strings;

public class AtTimeLowerToUpper_UpperToLower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s = "mUraLi";
		    String s1 = "";
		    for(int i=0;i<s.length();i++)
		    {
		    	char ch=s.charAt(i);
		    	if(ch>='A'&&ch<='Z')
		    	{
		    		s1=s1+(char)(ch+32);
		    	}
		    	else
		    	{
		    		s1=s1+(char)(ch-32);

		    	}
		    }
		    System.out.println("Toogle String is : "+s1);

		  }

		


	}


