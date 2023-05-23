package strings;

public class CreateCharactersFromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		int count =0;
		for(int i=0;i<=arr.length-1;i++)
		{
			char ch=arr[i];
			if((ch>='a'&&ch<='z')||(ch<='A'&&ch<='Z'))
			{
				count++;
			}
		}
		char[] b=new char[count];
		int x=0;
		for(int i=0;i<=b.length-1;i++)
		{
			char ch=b[i];
			if((ch>='a'&&ch<='z')||(ch<='A'&&ch<='Z'))
			{
				b[x]=ch;
				x++;
			}
		}
		System.out.println("alphabet array");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
