package specialprograms;

public class Demo {

	public static void main(String[] args) 
	{
		int max=0;
		int  a[]= {16,17,4,3,5,2};
		for(int i=1;i<a.length;i++) {
		   max=0;
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[k]>max)
					{
						max=a[i];
					}
				}
			}
			System.out.println(max);
		}
		
	}

}
