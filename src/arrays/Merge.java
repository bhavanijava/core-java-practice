package arrays;

public class Merge {

	public static void main(String[] args) {
		int [] a= {2,4,7,9};
		int [] b= {6,7,2,9,0,4};
		int [] c= new int[a.length+b.length];
		for (int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		for (int i=0;i<=b.length-1;i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("Merged array is:");
		for (int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+",");
		}

	}

}
