package ideyalabs;

import java.util.*;

public class Pattern {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	int n1=5;
		for(int i=2;i<=n1;i++)
		{
			int j=0;
			for(j=1;j<n1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
