package specialprograms;

import java.time.LocalDate;
import java.time.Period;

public class FindHowYearsCompletedUsingGivenDate {

	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1995, 5, 1);
		
		int years=Period.between(birthday, today).getYears();
		System.out.println(today);
		System.out.println(birthday);
		System.out.println(years);

	}

}
