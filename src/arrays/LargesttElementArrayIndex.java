package arrays;

public class LargesttElementArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,9,7,1};
		int large=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
		}
		System.out.println("Largestt Element "+large);
	}

}
 