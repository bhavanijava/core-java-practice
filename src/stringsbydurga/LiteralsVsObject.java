package stringsbydurga;

public class LiteralsVsObject {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		// literals can compare both "==" and "equals()"
		System.out.println(s1==s2 );
		System.out.println(s1.equals(s2));
		
		String s3=new String("world");
		String s4=new String("world");
		// objects can compare "equals()"
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		// literal+object
		System.out.println();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		
		System.out.println(" s1 location "+s1.hashCode());
		System.out.println(" s2 location "+s2.hashCode());
		System.out.println(" s3 location "+s3.hashCode());
		System.out.println(" s4 location "+s4.hashCode());
		
		
		String s="one"+1+"two"+2;
		System.out.println(s);
		
	}

}
