package arrays;

public class LargestAndSmllestArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,9,3,2,1,5};
		
		int large=a[0];
		int small=a[0];
		int x=0;
		int y=0;
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>large)
				large=a[i];
				x=i;
		}

		for(int j=1;j<=a.length-1;j++)
		{
			if(a[j]<small);
			y=j;                                       
		}
		
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		System.out.println("After swapping");
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.print(a[k]+" ");
		}
		                                                               

	}

}
