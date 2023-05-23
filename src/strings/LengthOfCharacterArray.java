package strings;

public class LengthOfCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','c','f','@','6','1','2','3'};
		System.out.println("Length= "+arr.length);
		System.out.println("First char= "+arr[0]);
		System.out.println("Last char= "+arr[arr.length-1]);
		
		
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]+" ");
		}
	}

}
