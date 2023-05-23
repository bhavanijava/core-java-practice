package strings;

import java.util.Scanner;

public class PrintSecondVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen=sc.nextLine();
		String[] arr=sen.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String ch=arr[i];
			int count=0;
			for(int j=0;j<ch.length();j++)
			{
				char ch1=ch.charAt(j);
				if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') 
				{  
					count++;
				}
				if(count==2)
				{
					System.out.println(ch1);
					break;
				}
				
			}	
		}
	}

}
