package strings;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc@123";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int n=(int)(ch-48);
				sum=sum+n;
			}
			
		}
		System.out.println(sum);
	}

}
