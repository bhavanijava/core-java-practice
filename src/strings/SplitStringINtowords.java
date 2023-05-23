package strings;

public class SplitStringINtowords {

	public static void main(String[] args) {
		String s="This is core java test";
		String[] arr=s.split(" ");
		System.out.println("String is: "+s);
		for(String a:arr)
		{
			System.out.println("Word is "+a);
		}


	}

}
