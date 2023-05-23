package basic;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				System.out.println("enter start date (2017-05-24) like this format:");
				String dateBeforeString=sc.nextLine();
				System.out.println("enter end date (2017-05-24) like this format:");
				String dateAfterString=sc.nextLine();

				LocalDate dateBefore=LocalDate.parse(dateBeforeString);
				LocalDate dateAfter=LocalDate.parse(dateAfterString);

				long noOfDaysBetween=(int)ChronoUnit.DAYS.between(dateBefore,dateAfter);


				System.out.println("enter principal amount :");
				double amt=sc.nextDouble();

				System.out.println("enter intrest rate is in Rupee  per 100 to month:");
				double monthInterest=sc.nextInt();


				double monthlyInterest=amt/100*monthInterest;
//				System.out.println("per month Interest is:"+monthlyInterest);

				double dayInterest=monthlyInterest/30;
//				System.out.println("per day Interest is:"+dayInterest);

				int totalInterest2=(int)(noOfDaysBetween*dayInterest);
				double totalInterest=totalInterest2;

				int total2=(int)amt+totalInterest2;
				double total=total2;
				System.out.println();



				System.out.println("Principal Amount:"+amt);
				System.out.println("Loan Duration: "+noOfDaysBetween+" days");
				System.out.println("Interest Rate: "+monthInterest+" rupees per 100 per month");
				System.out.println();
				System.err.println("Total Interest: "+totalInterest);
				System.out.println();
				System.err.println("Total amt is: "+total);
			}
	}


