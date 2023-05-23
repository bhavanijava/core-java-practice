package arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,9,23,3};
		int[] b= {7,2,8,3};
		
		int[] c=new int[a.length+b.length];
		
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<=b.length-1;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
