package java8features;

import java.time.LocalDateTime;

public class DateAndTimeAPIexample_3 {

	public static void main(String[] args)
	{
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDateTime otherdate=LocalDateTime.of(2020, 5, 7, 10, 5, 55);
		System.out.println(otherdate);
	}

}
