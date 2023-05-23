package ideyalabs;

public class SmallestElement {

	public static void main(String[] args)
	{
		int[] a= {3,4,9,4,6,2};
		int small=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("small element is "+small);
		                                                  

	}
	}


