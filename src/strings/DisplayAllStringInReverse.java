package strings;

public class DisplayAllStringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc@123";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}

	}

}
