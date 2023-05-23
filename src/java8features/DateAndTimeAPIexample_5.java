package java8features;
import java.time.*;

public class DateAndTimeAPIexample_5 {

	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate startDate=LocalDate.of(2006, 04, 22);
		System.out.println(startDate);
		
		
		//years of experience
		Period exp=Period.between(startDate, date);
		System.out.printf("Total  years of exp %d years,%d months ,%d days",exp.getYears(),exp.getMonths(),exp.getDays());
		
		System.out.println();
		System.out.println();
		
		System.out.println(date);
		LocalDate examDate=LocalDate.of(2023, 04, 22);
		System.out.println(examDate);
		//No of days left
		Period exam=Period.between(date, examDate);
		System.out.printf("No of days Left %d years,%d months ,%d days",exam.getYears(),exam.getMonths(),exam.getDays());
	}

}
