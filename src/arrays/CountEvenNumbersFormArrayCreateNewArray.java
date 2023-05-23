package arrays;

public class CountEvenNumbersFormArrayCreateNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,7,4,1,2,8,9,6,5,4,5};
		
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				count++;
		}
		
		int[] b=new int[count];
		int x=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				b[x]=a[i];
				x++;
			}
		}
		System.out.println("even array");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
