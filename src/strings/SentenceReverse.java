package strings;

public class SentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam arora teaches malayalam";
		String[] arr=str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			String str1=arr[0];
			String str2=arr[1];
			String str3=arr[2];
			String str4=arr[3];
			String str5=str1;
			String str6=str2;
			String str7=str3;
			String str8=str4;
			
			String rev1="";
			for(int j=str1.length()-1;j>=0;j--)
			{
				rev1=rev1+str1.charAt(i);
			}
			
			System.out.println(rev1);
			
			if(str5.equals(rev1))
			{
				System.out.println(str5+" is palindrome");
			}
			else
			{
				System.out.println(str2+" isnot palindrome");
			}
			
			
			
		}
	}

}
