package java8features;

import java.time.*;


public class DateAndTimeAPIexample_1 {

	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int day=date.getDayOfMonth();
		System.out.println("Day :"+day);
		
		int month=date.getMonthValue();
		System.out.println("Month :"+month);
		
		int year=date.getYear();
		System.out.println("Year :"+year);
	}

}
