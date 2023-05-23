package java8features;
import java.time.*;

public class DateAndTimeAPIexample_2 {

	public static void main(String[] args) 
	{
		LocalTime time =LocalTime.now();
		System.out.println(time);
		int hour=time.getHour();
		int minutes=time.getMinute();
		int seconds=time.getSecond();
		int nanoSeconds=time.getNano();
		
		System.out.println(hour);
		System.out.println(minutes);
		System.out.println(seconds);
		System.out.println(nanoSeconds);
	}

}
