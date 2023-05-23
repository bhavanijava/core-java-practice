package strings;

public class GivenCharacterIsDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3','a'};
		 
		char ch='a';
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==ch)
				count++;
		}
		if(count==1)
		{
			System.out.println("character present");
		}
		else
		{
			System.out.println("Duplicate characters "+ch);
		}
		
	}

}
