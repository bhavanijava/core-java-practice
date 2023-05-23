package java8features;

import java.time.*;

public class DateAndTimeAPIexample_4 {
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println("Current Date :"+date);
		
		System.out.println("After 20 days :"+date.plusDays(20));
		System.out.println("Before 44 days :"+date.minusDays(44));
		System.out.println("After 2 Months : "+date.plusMonths(2));
		System.out.println("Before  3 Months : "+date.minusMonths(3));
		System.out.println("After  2 Years : "+date.plusYears(2));

		

		
	}

}
