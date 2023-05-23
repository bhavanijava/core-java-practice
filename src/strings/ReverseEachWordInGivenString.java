package strings;

public class ReverseEachWordInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="which is the biggest continent";
		String[] arr=s.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
		
			String s1=arr[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
