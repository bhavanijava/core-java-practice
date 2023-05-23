package strings;

public class DisplayVowelsInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			char ch=arr[i];
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("vowel = "+ch);
			}
			else 
			{
				System.out.println("Not Vowel = "+ch);
			}
		}

	}

}
