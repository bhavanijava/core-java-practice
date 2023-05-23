package arrays;

public class LargesttElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,9,4,6,2};
		int large=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("large element is "+large);
	}

}
