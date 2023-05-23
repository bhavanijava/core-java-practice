package jdk8features;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=145;
int sum=0;
int x=n;
while(n!=0)
{
	int d=n%10;
	int fact=1;
	for(int i=1; i<=d; i++)
	{
		fact=fact*i;
	}
	sum=sum+fact;
	n=n/10;
}
if(x==sum)
	System.out.println("im fucker");
	}

}
