package specialprograms;
import java.util.*;

public class WithOutPredifinedYearsMonthsDays {

	public static void main(String[] args)
	{
		int d1,d2,m1,m2,y1,y2,d,m,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Date (dd/mm/yy)");
		d1=sc.nextInt();
		m1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter Second Date (dd/mm/yy)");
		d2=sc.nextInt();
		m2=sc.nextInt();
		y2=sc.nextInt();
		
		if(d2<d1)
		{
			if(m2==3)
			{
				//check leap year
				if(y2%100!=0&&y2%4==0||y2%400==0)
				{
					d2=d2+29;
				}
				else
				{
					d2=d2+28;
				}
			}
		}
		else if(m2==5||m2==7||m2==10||m2==12)
		{
			d2=d2+30;
		}
		else
		{
			d2=d2+31;
			m2=m2-1;
		}
		if(m2<m1)
		{
			y2=y2-1;
			m2=m2+12;
		}
		y=y2-y1;
		m=m2-m1;
		d=d2-d1;
		System.out.println("Difference of the two dates is "+y+" years "+m+" months "+d+" days");
	}

}
