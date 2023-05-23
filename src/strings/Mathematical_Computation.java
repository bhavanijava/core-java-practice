package strings;

public class Mathematical_Computation {

public static void main(String []args) {
	String s="1,2,3,-3,7,*10";
	
	String [] sh=s.split(",");
		
		int sum=0;
		for(int i=0;i<=sh.length-1;i++) 
		{
			
			String ch=sh[i];
			int num=0; 
			for(int j=0;j<=ch.length()-1;j++)
			{
				
				if(ch.charAt(j)=='-')
				{
					num =num-(int)(ch.charAt(j+1)-48);
					System.out.println(num);
					j++;
				}
				else if(ch.charAt(j)=='*')
				{

				int n=(int)(ch.charAt(j+1)-48);
				int n1=(int)(ch.charAt(j+2)-48);
				
				int n2=n*10+n1;
				sum=sum*n2;
				j++;
				j++;

				}
				else 
				{
				num =num+(int)(ch.charAt(j)-48);
				System.out.println(num);
				}
			sum=sum+num;
		}
			
	}
		System.out.println("sum: "+sum);
}
}