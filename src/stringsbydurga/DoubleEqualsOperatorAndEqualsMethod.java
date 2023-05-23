package stringsbydurga;

public class DoubleEqualsOperatorAndEqualsMethod {

	public static void main(String[] args)
	{
		// == and equals()
		
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		// here "==" for reference comparision and "equals()" for conteent comparision
		
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); // false
		// here "==" for reference comparision and "equals()" for also reference comparision

	}

}
