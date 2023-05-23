package strings;

public class Split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Core java online Session";
		String[] arr=str.split(" ");
		/*for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}*/
		for(String x:arr)
		{
			System.out.println(x);
		}
		
		System.out.println(" ");
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
