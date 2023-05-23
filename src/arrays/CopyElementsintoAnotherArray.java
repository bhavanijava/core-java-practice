package arrays;

public class CopyElementsintoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] b=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			b[i]=arr[i];
			
		}
		System.out.println("Copied array");
		for(int i=0;i<=b.length-1;i++)
			System.out.print(b[i]+" ");

	}

}
