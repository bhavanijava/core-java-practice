package strings;

public class DisplayAsciiValueofEachCharacterinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		for(int i=0;i<=arr.length-1;i++)
		{
			char ch=arr[i];
			System.out.println(ch+"="+(int)ch);
		}
	}

}
