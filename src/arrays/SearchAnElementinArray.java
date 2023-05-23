package arrays;

public class SearchAnElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		int ele=60;
		boolean found=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==ele) 
			{
				System.out.println("Found @Location"+i);
				found=true;
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("Not found");
		}
	}

}
