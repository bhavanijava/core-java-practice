package java8features;

public class LamdaPrintTableClass {

	public static void main(String[] args)
	{
		LamdaPrintTableInterface obj=(x)->{
												for(int i=1;i<=10;i++)
												{
													System.out.println(x+"*"+i+"="+(x*i));
												}
											};
		obj.table(5);
	}

}
