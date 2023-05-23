package java8features;

import java.time.*;
import java.time.format.*;

public class EditDateAndTimeFormat {

	public static void main(String[] args)
	{
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MM-yyyy-dd HH:mm:ss");
		    String formattedDate=date.format(format);
		    System.out.println(formattedDate);
	}

}
