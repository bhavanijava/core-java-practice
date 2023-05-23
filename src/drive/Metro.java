package drive;

import java.util.Scanner;

public class Metro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("1. warangal \n 2. vizag  \n3. nizamabad \n 4.bangalore  \n 5.hitechcity ");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int kms = 0;
				int fare = 0;
				 if(a==1) {
					 System.out.println("warangal");
					 kms = 200;
				 }
				 else if(a==2) {
					 System.out.println("vizag");
					 kms = 300;
				 }
				 else if(a==3) {
					 System.out.println("nizamabad");
					 kms = 500;
				 }
				 else if(a==4) {
					 System.out.println("bangalore");
					 kms = 80;
				 }
				 else if(a==5) {
					 System.out.println("hitechcity");
					 kms = 20;
				 }
				if(kms>100)
				{
					 fare=fare+(kms-100)*5;
					kms=100;	
				}
				if(kms>=50)
				{
					 fare=fare+(kms-50)*7;
					kms=50;
				}
				if(kms>=25)
				{
					 fare=fare+(kms-25)*8;
					kms = 25;
				}
				if(kms>=0)
				{
					 fare=fare+(kms)*10;			
				}
				System.out.println(fare);	
			}
		

	}


