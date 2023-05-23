package basic;

public class EvenArrayOddArrayFromGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,8,9,4,6,1,6};
		
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				count++;
		}
		int[] b=new int[count];
		int[] c=new int[a.length-count];
		int x=0,y=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				b[x]=a[i];
				x++;
			}
			else
			{
				c[y]=a[i];
				y++;
			}
		}
		System.out.println("Even Array");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Odd arry");
		for(int i=0;i<=c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
