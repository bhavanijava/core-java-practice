package strings;

public class SwapFirstAndLastInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		int i=0;
		int j=arr.length-1;
		
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		System.out.println("After swapping");
		
		for(int i1=0;i1<=arr.length-1;i1++)
		{
			System.out.print(arr[i1]+" ");
		}
	}

}
